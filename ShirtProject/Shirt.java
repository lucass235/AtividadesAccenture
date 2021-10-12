public class Shirt {
    private String description;
    private String colorCode;
    private double price;

    public Shirt(String description, String colorCode, double price) {
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void display() {
        System.out.println("Dados do produto: ");
        System.out.println("Descricao: " + this.description + " Cor: " + this.colorCode + " preco: R$" + this.price);
    }
}
