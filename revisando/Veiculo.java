package revisando;

public abstract class Veiculo {
    private String chassi;
    private boolean ligado;
    private double velocidade;
    private int marcha;


    //CONSTRUTOR
    public Veiculo() {
        this.ligado = false;    //por padrão o veiculo vai ser criado desligado, parado e neutro.
        this.velocidade = 0.00;
        this.marcha = 0;
    }


    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
