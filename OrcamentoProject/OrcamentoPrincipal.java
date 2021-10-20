import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrcamentoPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ItemOrcamento[] vItem = new ItemOrcamento[100];
        ItemOrcamentoComplexo item = new ItemOrcamentoComplexo("", 0, null, 0);
        ItemOrcamento resul;
        int pos = 0, op;
        String historico, menu, entrada;
        float valor;
        menu = menu();
        do {
            entrada = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.INFORMATION_MESSAGE);
            op = Integer.parseInt(entrada);
            switch (op) {
            case 1:
                if (pos == vItem.length) {
                    JOptionPane.showMessageDialog(null, "Vetor Cheio!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    entrada = JOptionPane.showInputDialog(null, "Digite o histórico do item", "Histórico",
                            JOptionPane.INFORMATION_MESSAGE);
                    historico = entrada;
                    resul = item.encontraItem(historico);
                    while (resul != null) {
                        entrada = JOptionPane.showInputDialog(null,
                                "Ja existe um item com esse histórico, digite um diferente", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                        historico = entrada;
                        resul = item.encontraItem(historico);
                    }
                    entrada = JOptionPane.showInputDialog(null, "Digite o valor do item", "Valor Item",
                            JOptionPane.INFORMATION_MESSAGE);
                    valor = Integer.parseInt(entrada);
                    while (valor <= 0) {
                        entrada = JOptionPane.showInputDialog(null, "Valor inválido, digite um valor maior que 0",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        valor = Integer.parseInt(entrada);
                    }
                    vItem[pos] = new ItemOrcamento(historico, valor);
                    pos++;
                    item.setHistorico(historico);
                    item.setValor(valor);
                    item.setVetorItem(vItem);
                    item.setPos(pos);
                    System.out.println("Intem registrado com sucesso!");
                }
                break;
            case 2:
                if (item.getVetorItem() == null) {
                    JOptionPane.showMessageDialog(null, "Não exite itens registrados!", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    entrada = JOptionPane.showInputDialog(null, "Digite o histórico do item", "Histórico",
                            JOptionPane.INFORMATION_MESSAGE);
                    historico = entrada;
                    resul = item.encontraItem(historico);

                    if (resul != null) {
                        String historicoItem = resul.getHistorico();
                        float valorItem = resul.getValor();
                        String msg = "Histórico: " + historicoItem + "\nValor: " + valorItem;
                        JOptionPane.showMessageDialog(null, "Item encontrado!\n" + msg, "Achou",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Item não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            case 3:
                if (item.getVetorItem() == null) {
                    JOptionPane.showMessageDialog(null, "Não exite itens registrados!", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Total do orçamento R$" + item.getValor(), "Total Valor",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Obrigado por usar nosso programa!\nBy Lucas dos Santos",
                        "Programa Encerrado", JOptionPane.INFORMATION_MESSAGE);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, digite 1, 2, 3 ou 0 para encerrar!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                System.err.println("Opcao invalida, digite 1, 2, 3 ou 0 para encerrar!");
            }

        } while (op != 0);
    }

    public static String menu() {
        String menu;
        menu = "1 - Adicionar item\n2 - Buscar item\n3 - Valor de todos os items\n0 - Encerrar";
        return menu;
    }
}
