public class Peao extends Peca {

  @Override
    public String[][] mover (String t[][], String peca, int linha, int coluna) {
        t[linha][coluna] = peca;
        super.setTabuleiro(t);
    
        return super.getTabuleiro();
   }
}
