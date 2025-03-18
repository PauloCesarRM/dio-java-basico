package revisando;

import java.util.Scanner;

public class Carro extends Veiculo {


    Scanner scan = new Scanner(System.in);

    public Carro() {
        super();
    }

    public void ligar() {
        if (!isLigado()){
            if (confereCambio() == 0){
                confereCombustivel();
                setLigado(true);    //setou o boolean de ligado como true. 1 = ligado
                System.out.println("Carro Ligado: " + isLigado());
            }else
                System.out.println("O carro precisa estar de ponto morto para ligar");
        }else {
            System.out.println("O carro já estava ligado!");
        }
    }

    public void desligar() {
        if (isLigado()){
            if (confereVelocidade() > 0){
                System.out.println("você não pode desligar o carro em movimento");
                return; //VOLTA PARA O MENU
            }
            if (confereCambio() == 0){
                setLigado(false);
                System.out.println("Carro Ligado: " + isLigado());
            }else
                System.out.println("O carro precisa estar de ponto morto para desligar");


        }else {
            System.out.println("O carro já estava desligado!");
        }

    }

    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel");
    }

    private int confereCambio(){
        System.out.println("Conferindo Cambio");
        return getMarcha();
    }

    private double confereVelocidade(){
        System.out.println("Conferindo Velocidade: " + getVelocidade());
        return getVelocidade();
    }

    public void acelerar() {
        if (isLigado()){
            if (getMarcha() == 0){
                System.out.println("O carro não pode acelerar de ponto morto");
                return;
            }
            if (confereVelocidade() > 120){
                System.out.println("VELOCIDADE MÁXIMA ALCANÇADA!");
                return;
            }
            setVelocidade(getVelocidade() + 1);
            System.out.println("Carro acelerando");
        }else {
            System.out.println("O veículo precisa estar ligado para acelerar");
        }
    }

    public void desacelerar() {
        if (isLigado()){
            if (confereVelocidade() <= 0){
                System.out.println("VELOCIDADE MÍNIMA ALCANÇADA, POR FAVOR ACELERE");
                return;
            }
            setVelocidade(getVelocidade() - 1);
            System.out.println("Carro desacelerando");
        }else {
            System.out.println("O veículo precisa estar ligado para frear burro");
        }
    }

    public void virar() {
        if (isLigado()){
            if (confereVelocidade() > 0 && confereVelocidade() < 40){
                System.out.println("1 - para virar a esquerda e 2 para virar a direita:");
                int direcao = scan.nextInt();
                if (direcao == 1){
                    System.out.println("Virando para esquerda");
                }else if (direcao == 2){
                    System.out.println("Virando para direita");
                }else
                    System.out.println("Direção inválida!");
            }else {
                System.out.println("O carro deve estar entre 1 e 40 km/h para virar");
                return;
            }
        }else {
            System.out.println("O veículo precisa estar ligado para virar");
        }
    }

    public void trocarMarcha() {
        int marcha = scan.nextInt();
        if (isLigado()){
            if (marcha == 1){
                if (getMarcha() >= 6){
                    System.out.println("Carro tem apenas 6 Marchas");
                    return;
                }
                setMarcha(getMarcha() + 1);
                System.out.println("+1 Marcha: " + getMarcha());
            } else if (marcha == 2) {
                if (getMarcha() <= 0){
                    System.out.println("Carro já está em Neutro");
                    return;
                }
                setMarcha(getMarcha() - 1);
                System.out.println("-1 Marcha: " + getMarcha());
            }else {
                System.out.println("Opção inválida");
            }
        }

    }
}
