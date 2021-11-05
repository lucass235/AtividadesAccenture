public class MainCirculo {
    public static void main(String[] args) {
        double raio;
        raio = 10;
        Circulo novoCirculo = new Circulo(raio);

        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();
        raio = 4;
        novoCirculo.setRaio(raio);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        for(int i = 0; i < 5; i++) { // istancia 5 vezes a classe circulo.
        raio += i;
        Circulo circulo1 = new Circulo(raio);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        }
    }
}
