import java.util.Scanner;

public class DespesasPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Despesa despesa = new Despesa("null", null, 0);
        DespesaDia despesaDia = null;
        DespesaMes despesaMes;
        int op, mes, dia, pos = 0;
        String cpf;
        boolean cpfValido, diaValido;
        float valor;
        DespesaDia[] vDespesaDia = new DespesaDia[100];
        System.out.print("Digite seu cpf: ");
        cpf = in.nextLine();
        cpfValido = validacaoCpf(cpf);
        while (!cpfValido) {
            System.out.println("CPF inválido, digite novamente: ");
            cpf = in.nextLine();
            cpfValido = validacaoCpf(cpf);
        }
        despesa.setCpf(cpf);
        do {
            menu();
            op = in.nextInt();
            switch (op) {
            case 1:
                System.out.print("Digite o mês: ");
                mes = in.nextInt();
                while (mes <= 0 || mes > 12) {
                    System.out.print("Mes inválido, digite novamente: ");
                    mes = in.nextInt();
                }
                System.out.print("Digite o dia: ");
                dia = in.nextInt();
                diaValido = verificaDia(mes, dia);
                while (!diaValido) {
                    System.out.print("Dia inválido, digite novamente: ");
                    dia = in.nextInt();
                    diaValido = verificaDia(mes, dia);
                }
                System.out.println("Digite o valor: ");
                valor = in.nextFloat();
                while (valor <= 0) {
                    System.out.println("Valor inválido, digite novamente: ");
                    valor = in.nextFloat();
                }
                despesaDia = new DespesaDia(dia, mes, valor);
                vDespesaDia[pos] = despesaDia;
                pos++;
                despesa.setvDespesas(vDespesaDia);
                despesa.setPos(pos);
                System.out.println("Despesa adicionada!");
                break;
            case 2:
                if (despesaDia == null) {
                    System.out.println("Nada foi Cadastrado");
                } else {
                    System.out.print("Digite o mês: ");
                    mes = in.nextInt();
                    despesaMes = despesa.DespesaDoMes(mes);
                    if (despesaMes != null) {
                        System.out.println("Total mês: " + despesaMes.getValor());
                    } else {
                        System.out.println("Não existe despesa nesse mês!");
                    }
                }
                break;
            case 0:
                System.out.println("Obrigado por usar nosso programa!");
                System.out.println("By Lucas dos Santos");
                break;
            default:
                System.err.println("Opção inválida, digite 1, 2, 3 ou 0 para encerrar!");
            }

        } while (op != 0);

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
        System.out.println("1 - Adicionar despesas\n2 - Vereficar despesas\n0 - Encerrar");
    }

    public static boolean verificaDia(int mes, int dia) {
        if (dia <= 0 || dia > 31) {
            return false;
        } else {
            if (mes == 2) {
                if (dia > 28) {
                    return false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia == 31) {
                    return false;
                }
            }
        }
        return true;
    }

}
