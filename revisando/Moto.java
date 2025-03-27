package revisando;

public class Moto extends Veiculo {

    public Moto() {
        super();
    }

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Ligando moto");
    }
}

