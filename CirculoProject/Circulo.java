import javax.swing.JOptionPane;

public class Circulo {
    private float raio;
    private float area;
    private float perimetro;

    public Circulo(double raio) {

    this.raio = (float) raio;
    }

    public float getRaio() {
        return raio;
    }


    public void setRaio(double newRaio) {
        
        this.raio = (float) newRaio;
    }

    public void calcularArea() {

        this.area = (Math.pow(this.raio, 2) * Math.PI);
        JOptionPane.showMessageDialog(null, "Raio: "+this.raio+"\nResultado: "+this.area, "Area", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void calcularPerimetro() {

        this.perimetro = (2 * Math.PI * this.raio);
        JOptionPane.showMessageDialog(null, "Raio: "+this.raio+"\nResultado: "+this.perimetro, "Perimetro", JOptionPane.INFORMATION_MESSAGE); 
    } 
}
