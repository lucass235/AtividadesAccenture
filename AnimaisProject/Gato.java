import javax.swing.JOptionPane;

public class Gato {
    private String nome;
    private int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emetirSom() {
        JOptionPane.showMessageDialog(null, "O gato faz: Miau Miauuu", "Som", JOptionPane.INFORMATION_MESSAGE);
    }
        
}
