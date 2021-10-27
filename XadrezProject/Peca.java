abstract class  Peca {
    private String tabuleiro[][];
    public abstract String[][] mover (String t[][], String peca, int linha, int coluna);
   
    public String[][] getTabuleiro() {
        return tabuleiro;
    }
    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
}
