import java.util.Scanner;

public class DriverShirt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome, cor;
        double preco;
        System.out.print("Infome o nome da blusa: ");
        nome = in.nextLine();
        System.out.print("Infome a  cor da blusa: ");
        cor = in.nextLine();
        System.out.print("Infome o preco da blusa: ");
        preco = in.nextDouble();
        while (preco <= 0) {
            System.out.print("preco invalido!, digite um valor maior que 0: ");
            preco = in.nextDouble();
        }
        Shirt s = new Shirt(nome, cor, preco);

        s.display();
    }
}
