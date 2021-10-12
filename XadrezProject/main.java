import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linha, coluna, op;
        String[][] tabuleiro = { { "R", "N", "B", "Q", "K", "B", "N", "R" }, { "P", "P", "P", "P", "P", "P", "P", "P" },
                { " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
                { " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
                { "p", "p", "p", "p", "p", "p", "p", "p" }, { "r", "n", "b", "q", "k", "b", "n", "r" } };

        do {
            imprimirTabuleiro(tabuleiro);
            System.out.print("Infome a posicao da linha do tabuleiro: ");
            linha = in.nextInt();
            while (linha == 0 || linha > 8) {
                System.out.print("Opcao invalida. Digite um numero entre 1 e 8 ");
                linha = in.nextInt();
            }
            linha -= 1; // ajustar posicao da matriz
            System.out.print("Infome a posicao da coluna do tabuleiro: ");
            coluna = in.nextInt();
            while (coluna == 0 || coluna > 8) {
                System.out.print("Opcao invalida. Digite um numero entre 1 e 8 ");
                coluna = in.nextInt();
            }
            coluna -= 1; // ajustar posicao da matriz
            jogar(tabuleiro, linha, coluna);
            System.out.println(" Quer continuar o jogo? 1 - SIM 0 - NAO");
            op = in.nextInt();
        } while (op != 0);

        imprimirTabuleiro(tabuleiro);
    }

    public static void jogar(String[][] t, int li, int co) {

    }

    public static void imprimirTabuleiro(String[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
