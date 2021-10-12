import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double rendaA = 50.00, rendaB = 30.00, rendaC = 20.00;
        double totalRendaA = 0, totalRendaB = 0, totalRendaC = 0;
        int qtdVendasA = 0, qtdVendasB = 0, qtdVendasC = 0;
        int op;
        menu();
        do {
            System.out.print("Informe qual Classe voce deseja comprar: ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    qtdVendasA++;
                    totalRendaA += rendaA;
                    System.out.println("Classe A vendida com Sucesso!!");
                    break;
                case 2:
                    qtdVendasB++;
                    totalRendaB += rendaB;
                    System.out.println("Classe B vendida com Sucesso!!");
                    break;
                case 3:
                    qtdVendasC++;
                    totalRendaC += rendaC;
                    System.out.println("Classe C vendida com Sucesso!!");
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso programa!");
                    System.out.println("By Lucas dos Santos");
                    break;
                default:
                    System.err.println("Opcao invalida, digite 1, 2, 3 ou 0 para encerrar!");
            }

        } while (op != 0);

        if (qtdVendasA >= 1 || qtdVendasB >= 1 || qtdVendasC >= 1) {
            System.out.println(
                    "Foram vendidos (" + qtdVendasA + ") da classe A, e ela teve uma Renda de R$" + totalRendaA);
            System.out.println(
                    "Foram vendidos (" + qtdVendasB + ") da classe B, e ela teve uma Renda de R$" + totalRendaB);
            System.out.println(
                    "Foram vendidos (" + qtdVendasC + ") da classe C, e ela teve uma Renda de R$" + totalRendaC);
        }
    }

    public static void menu() {
        System.out.println(" 1 - ClasseA = R$50,00\n 2 - ClaseB = R$30,00\n 3 - ClasseC = R$20,00\n 0 - Encerrar");
    }
}
