public class SistemaOperacional {
    private String nome;
    private String versao;
    private Double tamanhoSSD;

    public SistemaOperacional(String nome, String versao, Double tamanhoSSD) {
        this.nome = nome;
        this.versao = versao;
        this.tamanhoSSD = tamanhoSSD;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getVersao() {return versao;}
    public void setVersao(String versao) {this.versao = versao;}

    public Double getTamanhoSSD() {return tamanhoSSD;}
    public void setTamanhoSSD(Double tamanhoSSD) {this.tamanhoSSD = tamanhoSSD;}
}
