import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhaOrigem, colunaOrigem, op, linhaDestino, colunaDestino, jogada;
        String[][] tabuleiro = { { "R", "N", "B", "Q", "K", "B", "N", "R" }, { "P", "P", "P", "P", "P", "P", "P", "P" },
                { " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
                { " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
                { "p", "p", "p", "p", "p", "p", "p", "p" }, { "r", "n", "b", "q", "k", "b", "n", "r" } };
        jogada = 0; // jogada das brancas
        do {
            imprimirTabuleiro(tabuleiro);

            System.out.print("Infome a posicao da linha do tabuleiro: ");
            linhaOrigem = in.nextInt();
            while (linhaOrigem < 1 || linhaOrigem > 8) { // validacao
                System.out.print("Opcao invalida. Digite um numero entre 1 e 8 ");
                linhaOrigem = in.nextInt();
            }
            linhaOrigem -= 1; // ajustar posicao da matriz

            System.out.print("Infome a posicao da coluna do tabuleiro: ");
            colunaOrigem = in.nextInt();
            while (colunaOrigem < 1 || colunaOrigem > 8) { // validacao
                System.out.print("Opcao invalida. Digite um numero entre 1 e 8 ");
                colunaOrigem = in.nextInt();
            }
            colunaOrigem -= 1; // ajustar posicao da matriz
            if (jogada == 0) {
                if (tabuleiro[linhaOrigem][colunaOrigem] != "p") {
                    System.out.println("Opa posicao incorreta");
                } else {

                }

            } else {

            }

            System.out.print("Infome a posicao da coluna do tabuleiro: ");
            colunaOrigem = in.nextInt();
            while (colunaOrigem == 0 || colunaOrigem > 8) {
                System.out.print("Opcao invalida. Digite um numero entre 1 e 8 ");
                colunaOrigem = in.nextInt();
            }
            colunaOrigem -= 1; // ajustar posicao da matriz
            jogar(tabuleiro, linhaOrigem, colunaOrigem);
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
