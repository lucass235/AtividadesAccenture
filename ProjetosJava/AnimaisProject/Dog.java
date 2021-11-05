import javax.swing.JOptionPane;

public class Dog {
    private String nome;
    private int idade;

    public Dog(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emetirSom() {
        JOptionPane.showMessageDialog(null, "O Dog faz: Au Auuuuu", "Som",JOptionPane.INFORMATION_MESSAGE);
    }
        
}
