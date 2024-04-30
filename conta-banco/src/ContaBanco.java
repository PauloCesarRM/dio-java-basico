import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //TO-DO: Conhecer e importar a classe Scanner
        int numero;
        String agencia, nomeDoCliente;
        float saldo;

        System.out.println("Olá, vamos criar a sua nova conta bancária!\n Insira os dados a seguir:\n");
        System.out.println("Primeiro, informe o seu nome: ");
        nomeDoCliente = scan.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.nextLine();
        System.out.println("Agora informe o número da sua conta: ");
        numero = scan.nextInt();
        System.out.println("Por último, informe o saldo dispónivel: ");
        saldo = scan.nextFloat();
        System.out.println("Processando...\n");
        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\n");


        //Exibir as mensagens para o usuario

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mesangagem da conta criada


    }
}
