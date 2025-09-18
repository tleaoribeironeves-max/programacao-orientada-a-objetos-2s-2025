public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador("Dell", "NASA", 8000, 500, 4, 2000);

        SistemaOperacional windows = new SistemaOperacional("Windows", "11 Pro", 50);

        Programa word = new Programa("Word", 2000, 2, 10000);
        Programa jogoPesado = new Programa("Jogo Ultra", 16000, 200, 500000);
        Programa navegador = new Programa("Chrome", 4000, 10, 20000);

        word.executarPrograma(pc, windows);       
        jogoPesado.executarPrograma(pc, windows); 
        navegador.executarPrograma(pc, windows);  
    }
}
