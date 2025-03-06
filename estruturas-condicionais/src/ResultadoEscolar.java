import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = 0;
        int op = 0;

        System.out.println("Seja bem vindo ao sistema academico!\n\n");

        do {

            System.out.println("Selecione uma opção do menu: \n");
            System.out.println("1 - Calcular nova nota média");
            System.out.println("2 - Verificar se foi aprovado");
            System.out.println("3 - Sair");
            op = scan.nextInt();//recebe o inteiro referente a escolha do menu

            switch (op){
                case 1:
                    nota = 0;
                    System.out.println("Digite a priemira nota (0 a 10): ");
                    nota = scan.nextInt();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        continue; // Volta ao início do loop
                    }
                    System.out.println("\nNota total = " + nota);
                    System.out.println("\nDigite a segunda nota (0 a 10): ");
                    nota += scan.nextInt();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        continue; // Volta ao início do loop
                    }
                    System.out.println("\nNota total = " + nota);
                    System.out.println("\nDigite a terceira nota (0 a 10): ");
                    nota += scan.nextInt();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        continue; // Volta ao início do loop
                    }
                    System.out.println("\nNota total = " + nota);
                    nota = nota / 3;
                    System.out.println("Media das notas = " + nota);
                    break;

                case 2:
                    // Usando operador TERNÁRIO
                    //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
                    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("\n\nOpção inválida");
                    break;
            }

        }while(op != 3);



        /*
         * if (nota >= 8)
         * System.out.println("Aprovado");
         * 
         * else if (nota >= 5 && nota < 7)
         * System.out.println("Recuperação");
         * 
         * else
         * System.out.println("Reprovado");
         */


    }
}
