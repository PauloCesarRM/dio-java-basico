package revisando;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1414");
        jeep.ligar();

        Moto honda = new Moto();
        honda.setChassi("1415");
        honda.ligar();
    }
}
