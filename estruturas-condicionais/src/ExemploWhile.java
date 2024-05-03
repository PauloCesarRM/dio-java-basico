import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorCompra = valorAleatorio();
            if (valorCompra > mesada)
                valorCompra = mesada;   //Se o valor da compra é maior que a mesada,valor da compra é ajustado ao valor da mesada para que não gere uma compra negativa, joazinho malandro

            System.out.println("Item do valor: " + valorCompra + " Adicionado ao carrinho.");
            mesada = mesada - valorCompra;
            System.out.println("Mesada restante: " + mesada);
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
