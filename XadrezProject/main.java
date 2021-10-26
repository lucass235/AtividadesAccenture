import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada;
        int linhaOrigem, colunaOrigem, op, linhaDestino, colunaDestino, jogada;
        String[][] tabuleiro = { { "R", "N", "B", "Q", "K", "B", "N", "R" }, { "P", "P", "P", "P", "P", "P", "P", "P" },
                { " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
                { " ", " ", " ", " ", " ", " ", " ", " " }, { " ", " ", " ", " ", " ", " ", " ", " " },
                { "p", "p", "p", "p", "p", "p", "p", "p" }, { "r", "n", "b", "q", "k", "b", "n", "r" } };
        jogada = 0; // jogada das brancas
        do {
            entrada = JOptionPane.showInputDialog(null,
                    imprimirTabuleiro(tabuleiro) + "\nInfome a posição da linha do tabuleiro a ser selecionada: ",
                    "TABULEIRO", JOptionPane.QUESTION_MESSAGE);
            linhaOrigem = Integer.parseInt(entrada);
            while (linhaOrigem < 1 || linhaOrigem > 8) { // validacao
                entrada = JOptionPane.showInputDialog(null,
                        imprimirTabuleiro(tabuleiro) + "\nOpcao invalida. Digite um numero entre 1 e 8 ", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
                linhaOrigem = Integer.parseInt(entrada);
            }
            linhaOrigem -= 1; // ajustar posicao da matriz

            entrada = JOptionPane.showInputDialog(null,
                    imprimirTabuleiro(tabuleiro) + "\nInfome a posição da coluna do tabuleiro a ser selecionada: ",
                    "TABULEIRO", JOptionPane.QUESTION_MESSAGE);
            colunaOrigem = Integer.parseInt(entrada);
            colunaOrigem = in.nextInt();
            while (colunaOrigem < 1 || colunaOrigem > 8) { // validacao
                entrada = JOptionPane.showInputDialog(null,
                        imprimirTabuleiro(tabuleiro) + "\nInfome a posição da coluna do tabuleiro a ser selecionada: ",
                        "TABULEIRO", JOptionPane.QUESTION_MESSAGE);
                colunaOrigem = Integer.parseInt(entrada);
            }
            colunaOrigem -= 1; // ajustar posicao da matriz
            if (jogada == 0) {
                // jogada das brancas
                if (tabuleiro[linhaOrigem][colunaOrigem] != "p") {
                    System.out.println("Opa posicao incorreta");
                } else {
                    System.out.print("Infome a posição da linha do tabuleiro para se mover: ");
                    linhaDestino = in.nextInt();
                    while (linhaDestino < 1 || linhaDestino > 8) { // validacao
                        System.out.print("Opção inválida. Digite um numero entre 1 e 8: ");
                        linhaDestino = in.nextInt();
                    }
                    linhaDestino -= 1; // ajustar posicao da matriz

                    System.out.print("Infome a posição da coluna do tabuleiro para se mover: ");
                    colunaDestino = in.nextInt();
                    while (colunaDestino < 1 || colunaDestino > 8) { // validacao
                        System.out.print("Opção inválida. Digite um numero entre 1 e 8: ");
                        colunaDestino = in.nextInt();
                    }
                    colunaDestino -= 1; // ajustar posicao da matriz

                    if (colunaOrigem == colunaDestino) {
                        if (linhaDestino == 6) {
                            if (linhaDestino == 5
                                    || linhaDestino == 4 && tabuleiro[linhaDestino][colunaDestino] == " ") {

                                tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 1;
                                System.out.println("Peça movida");
                            } else {
                                System.out.println("Essa posição nao pode ser selecionada");
                            }
                        } else {
                            if (linhaOrigem - 1 == linhaDestino && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 1;
                                System.out.println("Peça movida");
                            } else {
                                System.out.println("Essa posição nao pode ser selecionada");
                            }
                        }

                    } else {
                        System.out.println("Essa posição não pode ser selecionada");
                    }
                }

            } else {
                // jogada das pretas.
                if (tabuleiro[linhaOrigem][colunaOrigem] != "P") {
                    System.out.println("Opa posição incorreta");
                } else {
                    System.out.print("Infome a posição da linha do tabuleiro para se mover: ");
                    linhaDestino = in.nextInt();
                    while (linhaDestino < 1 || linhaDestino > 8) { // validacao
                        System.out.print("Opção inválida. Digite um numero entre 1 e 8: ");
                        linhaDestino = in.nextInt();
                    }
                    linhaDestino -= 1; // ajustar posicao da matriz

                    System.out.print("Infome a posição da coluna do tabuleiro para se mover: ");
                    colunaDestino = in.nextInt();
                    while (colunaDestino < 1 || colunaDestino > 8) { // validacao
                        System.out.print("Opção inválida. Digite um numero entre 1 e 8: ");
                        colunaDestino = in.nextInt();
                    }
                    colunaDestino -= 1; // ajustar posicao da matriz

                    if (colunaOrigem == colunaDestino) {
                        if (linhaDestino == 1) {
                            if (linhaDestino == 2
                                    || linhaDestino == 3 && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 0;
                                System.out.println("Peça movida");
                            } else {
                                System.out.println("Essa posição não pode ser selecionada!");
                            }
                        } else {
                            if (linhaOrigem + 1 == linhaDestino && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 0;
                                System.out.println("Peça movida");
                            } else {
                                System.out.println("Essa posição não pode ser selecionada!");
                            }
                        }
                    } else {
                        System.out.println("Essa posição não pode ser selecionada!");
                    }
                }

            }
            System.out.println(" Quer continuar o jogo? 1 - SIM, 0 - NÃO");
            op = in.nextInt();
        } while (op != 0);

        imprimirTabuleiro(tabuleiro);
    }

    public static void jogar(String[][] t, int li, int co) {

    }

    public static String imprimirTabuleiro(String[][] t) {
        String tabuleiro = "";

        for (int i = 0; i < t.length; i++) {
            tabuleiro += (i + 1) + " - ";
            for (int j = 0; j < t[i].length; j++) {
                tabuleiro += t[i][j] + "  ";
            }
            tabuleiro += "\n";
        }
        return tabuleiro;
    }

}
