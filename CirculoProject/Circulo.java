import javax.swing.JOptionPane;

public class Circulo {
    private Float raio;
    private Float area;
    private Float perimetro;

    public Circulo(double raio) {

    this.raio = new Float(raio);

    }


    public void setRaio(double newRaio) {
        
        this.raio = new Float(newRaio);
    }

    public void calcularArea() {

        this.area = new Float(Math.pow(this.raio, 2) * Math.PI);
        JOptionPane.showMessageDialog(null, "Raio: "+this.raio+"\nResultado: "+this.area, "Area", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void calcularPerimetro() {

        this.perimetro = new Float(2 * Math.PI * this.raio);
        JOptionPane.showMessageDialog(null, "Raio: "+this.raio+"\nResultado: "+this.perimetro, "Perimetro", JOptionPane.INFORMATION_MESSAGE); 
    } 
}
