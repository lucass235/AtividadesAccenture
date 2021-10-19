import java.util.Scanner;

public class DespesasPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Despesa despesa;
        int op, dia, mes;
        String cpf;
        float[] despesaMes = new float[11];
        System.out.print("Digite seu cpf: ");
        cpf = in.nextLine();
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite o dia: ");
                    dia = in.nextInt();
                    System.out.print("Digite o mes: ");
                    mes = in.nextInt();
                    despesa = new Despesa(cpf, despesaMes);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso programa!");
                    System.out.println("By Lucas dos Santos");
                    break;
                default:
                    System.err.println("Opcao invalida, digite 1, 2 ou 0 para encerrar!");
            }

        } while (op != 0);

    }

    public static void menu() {
        System.out.println(" 1 - Calcular despesas\n 2 - Vereficar despesas\n 0 - Encerrar");
    }
    
}
