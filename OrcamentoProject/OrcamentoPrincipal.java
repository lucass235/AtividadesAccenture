import java.util.Scanner;

public class OrcamentoPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ItemOrcamento[] vItem = new ItemOrcamento[100];
        ItemOrcamentoComplexo item = new ItemOrcamentoComplexo("", 0, null, 0);
        ItemOrcamento resul;
        int pos = 0, op;
        String historico;
        float valor;

        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    if (pos == vItem.length) {
                        System.err.println("Vetor cheio");
                    } else {
                        System.out.print("Digite o historico do item: ");
                        historico = in.nextLine();
                        resul = item.encontraItem(historico);
                        while (resul != null) {
                            System.err.print("Ja existem um item com esse historico, digite um diferente: ");
                            historico = in.nextLine();
                            resul = item.encontraItem(historico);
                        }
                        System.out.print("Digite o valor do item: ");
                        valor = in.nextFloat();
                        while (valor <= 0) {
                            System.err.print("valor invalido, digite um valor maior que 0: ");
                            valor = in.nextFloat();
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
                        System.err.println("Nao existe item registrados!");
                    } else {
                        System.out.print("Digite o historico do item: ");
                        historico = in.nextLine();
                        resul = item.encontraItem(historico);

                        if (resul != null) {
                            System.out.println("Item encontrado!");
                        } else {
                            System.err.println("Item não encontrado!");
                        }
                    }
                    break;
                case 3:
                    if (item.getVetorItem() == null) {
                        System.err.println("Nao existe item registrados!");
                    } else {
                        System.out.println("Total do orçamento R$" + item.getValor());
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso programa!");
                    System.out.println("By Lucas dos Santos");
                    break;
                default:
                    System.err.println("Opcao invalida, digite 1, 2, 3 ou 0 para encerrar!");
            }

        } while (op != 0);
    }

    public static void menu() {
        System.out.println("====================================================");
        System.out.println("1 - Adicionar item\n2 - buscar item\n3 - Valor de todos os items\n0 - Encerrar");
        System.out.print("====================================================\n->");
    }
}
