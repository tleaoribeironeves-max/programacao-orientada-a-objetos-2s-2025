public class Programa {
    private String nome;
    private Integer memoriaRAMAlocada; 
    private Double tamanhoSSD; 
    private Double quantidadeOperacoes; 

    public Programa(String nome, Integer memoriaRAMAlocada, Double tamanhoSSD, Double quantidadeOperacoes) {
        this.nome = nome;
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.tamanhoSSD = tamanhoSSD;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    // Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Integer getMemoriaRAMAlocada() {return memoriaRAMAlocada;}
    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {this.memoriaRAMAlocada = memoriaRAMAlocada;}

    public Double getTamanhoSSD() {return tamanhoSSD;}
    public void setTamanhoSSD(Double tamanhoSSD) {this.tamanhoSSD = tamanhoSSD;}

    public Double getQuantidadeOperacoes() {return quantidadeOperacoes;}
    public void setQuantidadeOperacoes(Double quantidadeOperacoes) {this.quantidadeOperacoes = quantidadeOperacoes;}


    public void executarPrograma(Computador comp, SistemaOperacional so) {
        System.out.println("Tentando executar programa: " + nome);

        if (this.tamanhoSSD > comp.getArmazenamento() - so.getTamanhoSSD()) {
            System.out.println("Erro: espaço insuficiente no SSD para instalar o programa " + nome);
            return;
        }

        if (this.memoriaRAMAlocada > comp.getMemoriaRAM()) {
            System.out.println("Erro: memória RAM insuficiente para executar o programa " + nome);
            return;
        }

        Double tempoExecucao = this.quantidadeOperacoes / (comp.getOperacoesPorSegundo() * comp.getNucleos());
        System.out.println("Programa " + nome + " executado com sucesso!");
        System.out.println("Tempo de execução estimado: " + tempoExecucao + " segundos");
    }
}
