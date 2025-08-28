package sistema_radar;

public class Radar {
    public Integer limiteVelocidade;
    public String localizacao;

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            //emitir notificação
            emitirnotificacao(carro.placa,carro.velocidade);
        }
    }

    public void emitirnotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+ velocidadeObservada);
        System.out.println("Limite da via "+ this.limiteVelocidade);
    }
    
}

