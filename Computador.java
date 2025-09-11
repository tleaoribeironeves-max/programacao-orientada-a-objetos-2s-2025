public class Computador {
    private String marca;
    private String modelo;
    private Integer memoriaRAM;
    private Integer armazenamento; 
    private Integer nucleos;
    private Double operacoesPorSegundo;

    public Computador(String marca, String modelo, Integer memoriaRAM, Integer armazenamento, Integer nucleos, Double operacoesPorSegundo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public Integer getMemoriaRAM() {return memoriaRAM;}
    public void setMemoriaRAM(Integer memoriaRAM) {this.memoriaRAM = memoriaRAM;}

    public Integer getArmazenamento() {return armazenamento;}
    public void setArmazenamento(Integer armazenamento) {this.armazenamento = armazenamento;}

    public Integer getNucleos() {return nucleos;}
    public void setNucleos(Integer nucleos) {this.nucleos = nucleos;}

    public Double getOperacoesPorSegundo() {return operacoesPorSegundo;}
    public void setOperacoesPorSegundo(Double operacoesPorSegundo) {this.operacoesPorSegundo = operacoesPorSegundo;}
}
