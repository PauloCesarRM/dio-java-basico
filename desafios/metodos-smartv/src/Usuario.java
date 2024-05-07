public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();//criando um novo objeto

        System.out.println("Tv ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Tv ligada: " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Tv ligada: " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal);
    }
}
