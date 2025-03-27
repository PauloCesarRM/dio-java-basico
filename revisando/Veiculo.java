package revisando;

import java.util.Scanner;


public abstract class Veiculo {
    private String chassi;
    private boolean ligado;
    private double velocidade;
    private int marcha;

    private static final Scanner scan = new Scanner(System.in);

    //CONSTRUTOR
    public Veiculo() {
        this.ligado = false;    //por padrão o veiculo vai ser criado desligado, parado e neutro.
        this.velocidade = 0.00;
        this.marcha = 0;
    }


    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void ligar() {
        if (!isLigado()) {
            if (confereCambio() == 0) {
                confereCombustivel();
                setLigado(true);    //setou o boolean de ligado como true. 1 = ligado
                System.out.println("Veículo Ligado: " + isLigado());
            } else
                System.out.println("O veículo precisa estar de ponto morto para ligar");
        } else {
            System.out.println("O veículo já estava ligado!");
        }
    }

    public void desligar() {
        if (isLigado()) {
            if (confereVelocidade() > 0) {
                System.out.println("você não pode desligar o veículo em movimento");
                return; //VOLTA PARA O MENU
            }
            if (confereCambio() == 0) {
                setLigado(false);
                System.out.println("Veículo Ligado: " + isLigado());
            } else
                System.out.println("O veículo precisa estar de ponto morto para desligar");


        } else {
            System.out.println("O veículo já estava desligado!");
        }

    }

    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel");
    }

    private int confereCambio() {
        System.out.println("Conferindo Cambio");
        return getMarcha();
    }

    private double confereVelocidade() {
        System.out.println("Conferindo Velocidade: " + getVelocidade());
        return getVelocidade();
    }

    public void acelerar() {
        if (isLigado()) {
            if (getMarcha() == 0) {
                System.out.println("O veículo não pode acelerar de ponto morto");
                return;
            }
            if (confereVelocidade() >= 120) {
                System.out.println("VELOCIDADE MÁXIMA ALCANÇADA!");
                return;
            }
            setVelocidade(getVelocidade() + 1);
            System.out.println("Veículo acelerando. Velocidade: " + getVelocidade() + " km/h");
        } else {
            System.out.println("O veículo precisa estar ligado para acelerar");
        }
    }

    public void desacelerar() {
        if (isLigado()) {
            if (confereVelocidade() <= 0) {
                System.out.println("VELOCIDADE MÍNIMA ALCANÇADA, POR FAVOR ACELERE");
                return;
            }
            setVelocidade(getVelocidade() - 1);
            System.out.println("Veículo desacelerando. Velocidade: " + getVelocidade() + " km/h");
            while(getMarcha() > 0 && !marchaPermitida(getMarcha(), getVelocidade())){
                setMarcha(getMarcha() - 1);
                System.out.println("Mudando para marcha: " + getMarcha());
            }
        } else {
            System.out.println("O veículo precisa estar ligado para frear burro");
        }
    }

    public void virar() {
        if (isLigado()) {
            if (confereVelocidade() > 0 && confereVelocidade() < 40) {
                System.out.println("1 - para virar a esquerda e 2 para virar a direita:");
                int direcao = scan.nextInt();
                if (direcao == 1) {
                    System.out.println("Virando para esquerda");
                } else if (direcao == 2) {
                    System.out.println("Virando para direita");
                } else
                    System.out.println("Direção inválida!");
            } else {
                System.out.println("O veículo deve estar entre 1 e 40 km/h para virar");
                return;
            }
        } else {
            System.out.println("O veículo precisa estar ligado para virar");
        }
    }

    public void trocarMarcha() {
        if (!isLigado()) {
            System.out.println("O veículo precisa estar ligado para trocar a marcha.");
            return;
        }

        System.out.println("Digite 1 para aumentar a marcha ou 2 para reduzir:");
        int opcao = scan.nextInt();

        int marchaAtual = getMarcha();
        int novaMarcha = marchaAtual; // Inicialmente, mantém a marcha atual
        double velocidade = getVelocidade();

        if (opcao == 1) { // Aumentar marcha
            if (marchaAtual < 6) {
                novaMarcha = marchaAtual + 1;
            } else {
                System.out.println("Já está na marcha máxima (6).");
                return;
            }
        } else if (opcao == 2) { // Reduzir marcha
            if (marchaAtual > 0) {
                novaMarcha = marchaAtual - 1;
            } else {
                System.out.println("Já está em ponto morto (0).");
                return;
            }
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        // Verifica se a nova marcha é válida para a velocidade atual
        if (!marchaPermitida(novaMarcha, velocidade)) {
            System.out.println("Não é possível trocar para a marcha " + novaMarcha +
                    " na velocidade atual de " + velocidade + " km/h.");
            return;
        }

        setMarcha(novaMarcha);
        System.out.println("Marcha trocada para: " + novaMarcha);
    }

    private boolean marchaPermitida(int marcha, double velocidade) {
        switch (marcha) {
            case 0:
                return true;  // Neutro pode ser usado em qualquer velocidade.
            case 1:
                return velocidade >= 0 && velocidade <= 20;
            case 2:
                return velocidade > 10 && velocidade <= 40;
            case 3:
                return velocidade > 20 && velocidade <= 60;
            case 4:
                return velocidade > 30 && velocidade <= 80;
            case 5:
                return velocidade > 50 && velocidade <= 100;
            case 6:
                return velocidade > 70 && velocidade <= 120;
            default:
                return false;
        }
    }
}

