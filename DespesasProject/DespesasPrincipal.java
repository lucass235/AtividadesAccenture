import java.util.Scanner;

import javax.swing.JOptionPane;

public class DespesasPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Despesa despesa = new Despesa("null", null, 0);
        DespesaDia despesaDia = null;
        DespesaMes despesaMes;
        int op, mes, dia, pos = 0;
        String cpf, entrada;
        boolean cpfValido, diaValido;
        float valor;
        DespesaDia[] vDespesaDia = new DespesaDia[100];
        entrada = JOptionPane.showInputDialog(null, "Digite seu cpf:", "CPF", JOptionPane.INFORMATION_MESSAGE);
        cpf = entrada;
        cpfValido = validacaoCpf(cpf);
        while (!cpfValido) {
            entrada = JOptionPane.showInputDialog(null, "CPF invalido,Digite novamente:", "CPF",
                    JOptionPane.INFORMATION_MESSAGE);
            cpf = entrada;
            cpfValido = validacaoCpf(cpf);
        }
        despesa.setCpf(cpf);
        do {
            entrada = JOptionPane.showInputDialog(null, "1 - Adicionar despesas\n2 - Vereficar despesas\n0 - Encerrar",
                    "MENU", JOptionPane.INFORMATION_MESSAGE);
            op = Integer.parseInt(entrada);

            switch (op) {
            case 1:
                entrada = JOptionPane.showInputDialog(null, "Digite o mes:", "Mes", JOptionPane.INFORMATION_MESSAGE);
                mes = Integer.parseInt(entrada);
                while (mes <= 0 || mes > 12) {
                    entrada = JOptionPane.showInputDialog(null, "Mes invalido, Digite novamente:", "Mes",
                            JOptionPane.INFORMATION_MESSAGE);
                    mes = Integer.parseInt(entrada);
                }
                entrada = JOptionPane.showInputDialog(null, "Digite o dia:", "Dia", JOptionPane.INFORMATION_MESSAGE);
                dia = Integer.parseInt(entrada);
                diaValido = verificaDia(mes, dia);
                while (!diaValido) {
                    entrada = JOptionPane.showInputDialog(null, "Dia invalido, Digite novamente:", "Dia",
                            JOptionPane.INFORMATION_MESSAGE);
                    dia = Integer.parseInt(entrada);
                    diaValido = verificaDia(mes, dia);
                }
                entrada = JOptionPane.showInputDialog(null, "Digite o valor:", "Valor",
                        JOptionPane.INFORMATION_MESSAGE);
                valor = Float.parseFloat(entrada);
                while (valor <= 0) {
                    entrada = JOptionPane.showInputDialog(null, "Valor invalido, Digite novamente:", "Valor",
                            JOptionPane.INFORMATION_MESSAGE);
                    valor = Float.parseFloat(entrada);
                }
                despesaDia = new DespesaDia(dia, mes, valor);
                vDespesaDia[pos] = despesaDia;
                pos++;
                despesa.setvDespesas(vDespesaDia);
                despesa.setPos(pos);
                JOptionPane.showMessageDialog(null, "Despesa adicionada!", "Despesa Cadastrada",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                if (despesaDia == null) {
                    JOptionPane.showMessageDialog(null, "Nada foi Casdastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    entrada = JOptionPane.showInputDialog(null, "Digite o mes:", "Mes",
                            JOptionPane.INFORMATION_MESSAGE);
                    mes = Integer.parseInt(entrada);
                    despesaMes = despesa.DespesaDoMes(mes);
                    if (despesaMes != null) {
                        JOptionPane.showMessageDialog(null, "Total mês: " + despesaMes.getValor(), "Total Despesas",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não existe despesas nesse mês!", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Obrigado por usar nosso programa!\nBy Lucas dos Santos",
                        "Total Despesas", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, digite 1, 2 ou 0 para encerrar!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
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
