import java.util.Scanner;

public class CarroPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String marca, cor;
        double preco;
        System.out.print("Infome a marca do carro: ");
        marca = in.nextLine();
        System.out.print("Infome a  cor do carro: ");
        cor = in.nextLine();
        System.out.print("Infome o preco do carro: ");
        preco = in.nextDouble();
        while (preco <= 0) {
            System.out.print("preco invalido!, digite um valor maior que 0: ");
            preco = in.nextDouble();
        }
        Carro car = new Carro(marca, cor, preco);

        car.exibir();
        car.buzinar();
    }
}
