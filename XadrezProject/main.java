import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        Peao peao = new Peao();
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
                        imprimirTabuleiro(tabuleiro) + "\nOpção inválida. Digite um numero entre 1 e 8: ", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
                linhaOrigem = Integer.parseInt(entrada);
            }
            linhaOrigem -= 1; // ajustar posicao da matriz

            entrada = JOptionPane.showInputDialog(null,
                    imprimirTabuleiro(tabuleiro) + "\nInfome a posição da coluna do tabuleiro a ser selecionada: ",
                    "TABULEIRO", JOptionPane.QUESTION_MESSAGE);
            colunaOrigem = Integer.parseInt(entrada);
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
                    JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    entrada = JOptionPane.showInputDialog(null,
                            imprimirTabuleiro(tabuleiro) + "\nInfome a posição da linha do tabuleiro para se mover: ",
                            "TABULEIRO", JOptionPane.QUESTION_MESSAGE);
                    linhaDestino = Integer.parseInt(entrada);
                    while (linhaDestino < 1 || linhaDestino > 8) { // validacao
                        entrada = JOptionPane.showInputDialog(null,
                                imprimirTabuleiro(tabuleiro) + "\nOpção inválida. Digite um numero entre 1 e 8: ",
                                "ERRO", JOptionPane.ERROR_MESSAGE);
                        linhaDestino = Integer.parseInt(entrada);
                    }
                    linhaDestino -= 1; // ajustar posicao da matriz

                    entrada = JOptionPane.showInputDialog(null,
                            imprimirTabuleiro(tabuleiro) + "\nInfome a posição da coluna do tabuleiro para se mover: ",
                            "COLUNA", JOptionPane.QUESTION_MESSAGE);
                    colunaDestino = Integer.parseInt(entrada);
                    while (colunaDestino < 1 || colunaDestino > 8) { // validacao
                        entrada = JOptionPane.showInputDialog(null,
                                imprimirTabuleiro(tabuleiro) + "\nOpção inválida. Digite um numero entre 1 e 8: ",
                                "ERRO", JOptionPane.QUESTION_MESSAGE);
                        colunaDestino = Integer.parseInt(entrada);
                    }
                    colunaDestino -= 1; // ajustar posicao da matriz

                    if (colunaOrigem == colunaDestino) {
                        if (linhaDestino == 6) {
                            if (linhaDestino == 5
                                    || linhaDestino == 4 && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro = peao.mover(tabuleiro, "p", linhaDestino, colunaDestino);
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 1;
                                JOptionPane.showMessageDialog(null, "Peça movida", "SUCESSO",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            if (linhaOrigem - 1 == linhaDestino && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro = peao.mover(tabuleiro, "p", linhaDestino, colunaDestino);
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 1;
                                JOptionPane.showMessageDialog(null, "Peça movida", "SUCESSO",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

            } else {
                // jogada das pretas.
                if (tabuleiro[linhaOrigem][colunaOrigem] != "P") {
                    JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    entrada = JOptionPane.showInputDialog(null,
                            imprimirTabuleiro(tabuleiro) + "\nInfome a posição da linha do tabuleiro para se mover: ",
                            "TABULEIRO", JOptionPane.QUESTION_MESSAGE);
                    linhaDestino = Integer.parseInt(entrada);
                    while (linhaDestino < 1 || linhaDestino > 8) { // validacao
                        entrada = JOptionPane.showInputDialog(null,
                                imprimirTabuleiro(tabuleiro) + "\nOpção inválida. Digite um numero entre 1 e 8: ",
                                "ERRO", JOptionPane.ERROR_MESSAGE);
                        linhaDestino = Integer.parseInt(entrada);
                    }
                    linhaDestino -= 1; // ajustar posicao da matriz

                    entrada = JOptionPane.showInputDialog(null,
                            imprimirTabuleiro(tabuleiro) + "\nInfome a posição da coluna do tabuleiro para se mover: ",
                            "COLUNA", JOptionPane.QUESTION_MESSAGE);
                    colunaDestino = Integer.parseInt(entrada);
                    while (colunaDestino < 1 || colunaDestino > 8) { // validacao
                        entrada = JOptionPane.showInputDialog(null,
                                imprimirTabuleiro(tabuleiro) + "\nOpção inválida. Digite um numero entre 1 e 8: ",
                                "ERRO", JOptionPane.ERROR_MESSAGE);
                        colunaDestino = Integer.parseInt(entrada);
                    }
                    colunaDestino -= 1; // ajustar posicao da matriz

                    if (colunaOrigem == colunaDestino) {
                        if (linhaDestino == 1) {
                            if (linhaDestino == 2
                                    || linhaDestino == 3 && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro = peao.mover(tabuleiro, "p", linhaDestino, colunaDestino);
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 0;
                                JOptionPane.showMessageDialog(null, "Peça movida", "SUCESSO",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            if (linhaOrigem + 1 == linhaDestino && tabuleiro[linhaDestino][colunaDestino] == " ") {
                                tabuleiro = peao.mover(tabuleiro, "p", linhaDestino, colunaDestino);
                                tabuleiro[linhaOrigem][colunaOrigem] = " ";
                                jogada = 0;
                                JOptionPane.showMessageDialog(null, "Peça movida", "SUCESSO",
                                        JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não pode ser selecionada", "ERRO",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
            entrada = JOptionPane.showInputDialog(null, "Quer continuar o jogo? 1 - SIM, 0 - NÃO: ", "JOGO",
                    JOptionPane.QUESTION_MESSAGE);
            op = Integer.parseInt(entrada);
            while (op != 0 && op != 1) {
                entrada = JOptionPane.showInputDialog(null, "Opção inválida. Digite um número 0 ou 1: ", "ERRO",
                        JOptionPane.ERROR_MESSAGE);
                op = Integer.parseInt(entrada);
            }
        } while (op != 0);

        imprimirTabuleiro(tabuleiro);
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
