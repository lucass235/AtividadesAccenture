public class MainRetangulo {
    public static void main(String[] args) {
        double lado1, lado2;
        lado1 = 10;
        lado2 = 5;
        Retangulo novoRetangulo = new Retangulo(lado1, lado2);

        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        lado2 = 7;
        novoRetangulo.setLado2(lado2);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        for (int i = 0; i < 5; i++) { // istancia 5 vezes a classe retangulo.
            lado2 += i;
            Retangulo novoRetangulo1 = new Retangulo(lado1, lado2);
            novoRetangulo1.calcularArea();
            novoRetangulo1.calcularPerimetro();
        }
    }
}
