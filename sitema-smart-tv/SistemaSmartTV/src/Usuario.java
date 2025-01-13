public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal atual:  " + smartTV.canal);
        smartTV.mudarCanal(13);

        System.out.println("a TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual:  " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);



    }
}
