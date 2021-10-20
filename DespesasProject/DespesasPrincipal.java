import java.util.Scanner;

public class DespesasPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Despesa despesa;
        int op, dia, mes;
        String cpf;
        boolean cpfValido;
        float[] despesaDia = new float[28];
        System.out.print("Digite seu cpf: ");
        cpf = in.nextLine();
        cpfValido = validacaoCpf(cpf);
        if (!cpfValido) {
            System.out.println("CPF invalido");
        } else {
            do {
                menu();
                op = in.nextInt();
                switch (op) {
                case 1:
                    System.out.print("Digite o dia: ");
                    dia = in.nextInt();
                    System.out.print("Digite o mes: ");
                    mes = in.nextInt();
                    despesa = new Despesa(cpf, despesaDia);
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

    }

    public static boolean validacaoCpf(String cpf) {
        int tam;
        char valor;
        boolean veri = false;
        tam = cpf.length();
        if (tam != 11) {
            return false;
        } else {
            for (int i = 0; i < tam; i++) {
                valor = cpf.charAt(i);
                if (Character.isLetter(valor) || Character.isSpaceChar(valor)) {
                    return false;
                } else if (Character.isDigit(valor)) {
                    veri = true;
                } else {
                    return false;
                }
            }
        }
        return veri; // cpf valido!
    }

    public static void menu() {
        System.out.println(" 1 - Calcular despesas\n 2 - Vereficar despesas\n 0 - Encerrar");
    }

}
