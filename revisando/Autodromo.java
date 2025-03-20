package revisando;

import java.util.Scanner;

public class Autodromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro jeep = new Carro();
        jeep.setChassi("1414");

//
//        Moto honda = new Moto();
//        honda.setChassi("1415");
//        honda.ligar();

        System.out.println("Bem vindo ao seu veiculo!\n");
        int op = -1;
        do {
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1 - Ligar o veículo");
            System.out.println("2 - Desligar o veículo");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Verificar velocidade");
            System.out.println("6 - Virar para esquerda/direita");
            System.out.println("7 - Trocar a marcha");
            System.out.println("0 - Sair\n");
            op = scan.nextInt();

            switch (op){

                case 1:
                    jeep.ligar();
                    break;

                case 2:
                    jeep.desligar();
                    break;

                case 3:
                    jeep.acelerar();
                    break;

                case 4:
                    jeep.desacelerar();
                    break;

                case 5:
                    System.out.println("Velocidade atual: " + jeep.getVelocidade());
                    break;

                case 6:
                    jeep.virar();
                    break;

                case 7:
                    jeep.trocarMarcha();
            }


        }while (op != 0);
        System.out.println("Saindo do veículo!");
    }
}
