import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, cpf, sobreNome;
        int numero;
        double saldo;
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
        int op;

        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:

            }

        } while (op != 0);

    }

    public static void menu() {
        System.out
                .println("1 - Depositar\n2 - Sacar\n3 - Trasferir\n4 - Exibir saldo\n5 - Exibir extrato\n0 - Encerrar");
    }
}
