package revisando;

import java.util.Scanner;

public class Carro extends Veiculo {


    Scanner scan = new Scanner(System.in);

    public Carro() {
        super();
    }

    @Override
    public void ligar() {
        super.ligar();  //método pai
        System.out.println("Ligando carro");
    }
}


//    public void trocarMarcha() {
//        int marcha = scan.nextInt();
//        if (isLigado()){
//            if (marcha == 1){
//                if (getMarcha() >= 6){
//                    System.out.println("Carro tem apenas 6 Marchas");
//                    return;
//                }
//                setMarcha(getMarcha() + 1);
//                System.out.println("+1 Marcha: " + getMarcha());
//            } else if (marcha == 2) {
//                if (getMarcha() <= 0){
//                    System.out.println("Carro já está em Neutro");
//                    return;
//                }
//                setMarcha(getMarcha() - 1);
//                System.out.println("-1 Marcha: " + getMarcha());
//            }else {
//                System.out.println("Opção inválida");
//            }
//        }
//        System.out.println("O veículo precisa estar ligado para trocar a marcha");
//        return;
//    }





