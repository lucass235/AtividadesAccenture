import javax.swing.JOptionPane;

public class Retangulo {
    private Float lado1;
    private Float lado2;
    private Float area;
    private Float perimetro;

    public Retangulo(double lado1, double lado2) {
    this.lado1 = new Float(lado1);
    this.lado2 = new Float(lado2);
       
    }


    public void setLado2(double lado2) {
        
        this.lado2 = new Float(lado2);
    }

    public void calcularArea() {

        this.area = this.lado1 * this.lado2;
        JOptionPane.showMessageDialog(null, "Lado1: "+this.lado1+"\nlado2: "+this.lado2+"\nResultado: "+this.area, "Area", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void calcularPerimetro() {

        this.perimetro = (this.lado1 * 2) + (this.lado2 * 2);
        JOptionPane.showMessageDialog(null, "Lado1: "+this.lado1+"\nlado2: "+this.lado2+"\nResultado: "+this.perimetro, "Perimetro", JOptionPane.INFORMATION_MESSAGE); 
    } 
}
