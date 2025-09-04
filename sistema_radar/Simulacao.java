package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("simulação");
        
        Carro porsche = new Carro("THYA0713", "panamera", 25, 0);

        Radar radar = new Radar(60, "Pistão Sul");


        radar.avaliarVelocidade(porsche);

        porsche.acelerar(); //10 
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar(); //120

        radar.avaliarVelocidade(porsche);

        porsche.frear();

        radar.avaliarVelocidade(porsche);
    }
    
}
