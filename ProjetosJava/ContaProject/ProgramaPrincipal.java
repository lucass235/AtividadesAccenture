import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, cpf, sobreNome;
        int numero, op, opConta;
        double saldo, valor;
        Cliente c1, c2;
        System.out.print("Infome o nome do 1 usuario: ");
        nome = in.nextLine();
        System.out.print("Infome o CPF do 1 usuario: ");
        cpf = in.nextLine();
        System.out.print("Infome o sobrenome do 1 usuario: ");
        sobreNome = in.nextLine();
        System.out.print("Infome o numero da conta do 1 usuario: ");
        numero = in.nextInt();
        System.out.print("Infome o saldo do 1 usuario: ");
        saldo = in.nextDouble();
        c1 = new Cliente(nome, cpf, sobreNome, numero, saldo);
        in.nextLine();
        ////////////////////////////////////////////////////////////////////
        System.out.print("Infome o nome do 2 usuario: ");
        nome = in.nextLine();
        System.out.print("Infome o CPF do 2 usuario: ");
        cpf = in.nextLine();
        System.out.print("Infome o sobrenome do 2 usuario: ");
        sobreNome = in.nextLine();
        System.out.print("Infome o numero da conta do 2 usuario: ");
        numero = in.nextInt();
        System.out.print("Infome o saldo do 2 usuario: ");
        saldo = in.nextDouble();
        c2 = new Cliente(nome, cpf, sobreNome, numero, saldo);
        do {
            System.out.print("Digite qual conta deseja utilizar conta 1 ou conta 2: ");
            opConta = in.nextInt();
            while (opConta != 1 || opConta != 2) {
                System.out.print("Valor invalido. Digite  1 ou  2: ");
                opConta = in.nextInt();
            }
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite o valor para deposito: ");
                    valor = in.nextDouble();
                    while (valor <= 0) {
                        System.out.print("Valor invalido. Digite  um valor maior que 0: ");
                        valor = in.nextInt();
                    }
                    if (opConta == 1) {
                        c1.depositar(valor);
                    } else {
                        c2.depositar(valor);
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    valor = in.nextDouble();
                    while (valor <= 0) {
                        System.out.print("Valor invalido. Digite  um valor maior que 0: ");
                        valor = in.nextInt();
                    }
                    if (opConta == 1) {
                        c1.sacar(valor);
                    } else {
                        c2.sacar(valor);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para trasferir: ");
                    valor = in.nextDouble();
                    while (valor <= 0) {
                        System.out.print("Valor invalido. Digite  um valor maior que 0: ");
                        valor = in.nextInt();
                    }
                    if (opConta == 1) {
                        c1.trasferir(c2, valor);
                    } else {
                        c2.trasferir(c1, valor);
                    }
                    break;
                case 4:
                    if (opConta == 1) {
                        c1.exibirSaldo();
                    } else {
                        c2.exibirSaldo();
                    }
                    break;
                case 5:
                    if (opConta == 1) {
                        c1.exibirExtrato();
                    } else {
                        c2.exibirExtrato();
                    }
                    break;
                case 6:
                    if (opConta == 1) {
                        System.out.println(c1);
                    } else {
                        System.out.println(c2);
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso programa!");
                    System.out.println("By Lucas dos Santos");
                    break;
                default:
                    System.out.println("Opcao invalida!");

            }

        } while (op != 0);

    }

    public static void menu() {
        System.out.println(
                "1 - Depositar\n2 - Sacar\n3 - Trasferir\n4 - Exibir saldo\n5 - Exibir extrato\n6 - Exibir dados\n0 - Encerrar");
    }
}
