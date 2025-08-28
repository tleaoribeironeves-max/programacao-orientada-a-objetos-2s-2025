package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("simulação");
        
        Carro porsche = new Carro();
        porsche.ano = 25;
        porsche.modelo = "panamera";
        porsche.placa = "THYA0713";
        porsche.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistão Sul";

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
