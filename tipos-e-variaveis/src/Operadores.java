public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "Paulo " + "Martins";
        //System.out.println(nomeCompleto);
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero =- numero;
        System.out.println(numero);

        numero += 7;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        boolean variavel = false;
        System.out.println(variavel);
        System.out.println(!variavel);

        //Ternário (?:)
        //<Expressão Condicional> ? <Caso condição seja true> :
        //<Caso condição seja false>
        //Ex:

        int a=5, b=5;
        String resultado = a==b ?"verdadeiro" : "falso";
/*         if (a==b) 
            resultado = "verdadeiro";
        else
            resultado = "false";
         */
        
        System.out.println("Resultado operador ternário : " + resultado);
        

        //OPERADORES RELACIONAIS
        //==, !=, >, >=, <, <=
        
        int numero1 = 1, numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);

        String nomeUm = "Paulo";
        String nomeDois = "Paulo";

        System.out.println("nomeUm é igual a nomeDois? " + nomeUm.equals(nomeDois));

        //LÓGICOS
        //&& "E"
        //|| "Ou"

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições são verdadeiras");
        }
        System.out.println("fim");

    }
}
