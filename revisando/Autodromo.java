package revisando;

import java.util.Scanner;
import java.util.ArrayList;

public class Autodromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int opcaoMenu;

        do {
            System.out.println("==== Menu Principal ====");
            System.out.println("1 - Criar veículo");
            System.out.println("2 - Selecionar veículo existente");
            System.out.println("0 - Sair");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

            switch(opcaoMenu) {
                case 1:
                    System.out.println("Escolha o tipo do veículo (carro/moto): ");
                    String tipo = scan.nextLine();
                    try {
                        Veiculo novo = VeiculoFactory.criarVeiculo(tipo);
                        System.out.println("Digite o chassi do veículo: ");
                        String chassi = scan.nextLine();
                        novo.setChassi(chassi);
                        veiculos.add(novo);
                        System.out.println("Veículo criado com sucesso!");
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    if (veiculos.isEmpty()) {
                        System.out.println("Nenhum veículo criado ainda!");
                    } else {
                        System.out.println("Veículos disponíveis:");
                        for (int i = 0; i < veiculos.size(); i++) {
                            System.out.println(i + " - " + veiculos.get(i).getChassi());
                        }
                        System.out.println("Digite o índice do veículo que deseja operar: ");
                        int idx = scan.nextInt();
                        scan.nextLine();
                        if (idx >= 0 && idx < veiculos.size()){
                            operarVeiculo(veiculos.get(idx), scan);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcaoMenu != 0);


    }

    public static void operarVeiculo(Veiculo veic, Scanner scan){
        int op;
        System.out.println("Bem vindo ao seu veiculo: " + veic.getChassi());
        do {
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1 - Ligar o veículo");
            System.out.println("2 - Desligar o veículo");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Verificar velocidade");
            System.out.println("6 - Virar para esquerda/direita");
            System.out.println("7 - Trocar a marcha");
            System.out.println("0 - Voltar ao menu principal");
            op = scan.nextInt();
            scan.nextLine();

            switch (op){
                case 1 -> veic.ligar();
                case 2 -> veic.desligar();
                case 3 -> veic.acelerar();
                case 4 -> veic.desacelerar();
                case 5 -> System.out.println("Velocidade atual: " + veic.getVelocidade());
                case 6 -> veic.virar();
                case 7 -> veic.trocarMarcha();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }

        }while(op != 0);

    }
}
