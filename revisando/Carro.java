package revisando;

public class Carro extends Veiculo {


    public Carro() {
        super();
    }

    public void ligar() {
        confereCambio();
        confereCombustivel();
        if (!isLigado()){
            setLigado(true);    //setou o boolean de ligado como true. 1 = ligado
        }
        System.out.println("Carro Ligado: " + isLigado());
    }

    public void desligar() {
        if (isLigado()){
            setLigado(false);
        }
        System.out.println("Carro Ligado: " + isLigado());
    }

    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo Cambio");
    }

    private void confereVelocidade(){
        System.out.println("Conferindo Velocidade: " + getVelocidade());
    }

    public void acelerar() {
        if (isLigado()){
            setVelocidade(getVelocidade() + 1);
            System.out.println("Carro acelerando");
        }else {
            System.out.println("O veículo precisa estar ligado para acelerar");
        }
    }

    public void desacelerar() {
        if (isLigado()){
            setVelocidade(getVelocidade() - 1);
            System.out.println("Carro desacelerando");
        }else {
            System.out.println("O veículo precisa estar ligado para frear burro");
        }
    }
}
