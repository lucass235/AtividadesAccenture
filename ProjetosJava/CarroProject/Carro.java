public class Carro {
    private String marca;
    private String colorCode;
    private double price;

    public Carro(String marca, String colorCode, double price) {
        this.marca = marca;
        this.colorCode = colorCode;
        this.price = price;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void exibir() {
        System.out.println("Dados do carro: ");
        System.out.println("Marca: " + this.marca + " Cor: " + this.colorCode + " preco: R$" + this.price);
    }

    public void buzinar() {
        System.out.println("Bir Birrrrr");
    }
}
