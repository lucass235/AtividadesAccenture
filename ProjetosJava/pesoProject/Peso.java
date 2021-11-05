import javax.swing.JOptionPane;

public class Peso {
    public static void main(String[] args) {
        String nome, alturaInput, idadeInput, pesoInput, dados;
        double altura, peso, imc;
        int idade;
        nome =  JOptionPane.showInputDialog("Digite seu Nome:");
        idadeInput = JOptionPane.showInputDialog("Digite sua idade:");
        idade = Integer.parseInt(idadeInput);
        while(idade <= 0) {
        idadeInput = JOptionPane.showInputDialog("Idade inválida, digite novamente:");
        idade = Integer.parseInt(idadeInput);
        }
        alturaInput = JOptionPane.showInputDialog("Digite sua altura:");
        altura = Double.parseDouble(alturaInput);
        while (altura <= 0) {
        alturaInput = JOptionPane.showInputDialog("Altura inválida, digite novamente:");
        altura = Double.parseDouble(alturaInput);
        }
        pesoInput = JOptionPane.showInputDialog("Digite seu peso:");
        peso = Double.parseDouble(pesoInput);
        while (peso <= 0) {
            pesoInput = JOptionPane.showInputDialog("Peso inválido, digite novamente:");
            peso = Double.parseDouble(pesoInput);
        }
        dados = "Nome: " +nome+ "\nIdade: " +idade+ "\nAltura: " +altura+ "\nPeso: " +peso+ "\n";
        
        imc = peso / (Math.pow(altura, 2));

        if(imc < 18.5) {
            JOptionPane.showMessageDialog(null, dados+ "Classificação: Abaixo do Peso","IMC", JOptionPane.INFORMATION_MESSAGE);
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, dados+ "Classificação: Peso Normal","IMC", JOptionPane.INFORMATION_MESSAGE);
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, dados+ "Classificação: Sobrepeso","IMC", JOptionPane.WARNING_MESSAGE);
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, dados+ "Classificação: Obesidade Grau I","IMC", JOptionPane.WARNING_MESSAGE);
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, dados+ "Classificação: Obesidade Grau II","IMC", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, dados+ "Classificação: Obesidade Grau III ou Mórbida","IMC", JOptionPane.WARNING_MESSAGE);
        }
    }
}