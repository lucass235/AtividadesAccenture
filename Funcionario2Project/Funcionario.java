import java.util.Date;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;
    private Date admisao;
    private String cpf;

    public Funcionario(String nome, int matricula, double salario, Date admisao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.admisao = admisao;
        this.cpf = cpf;
    }

    public void receberAumento(double valor) {
        this.salario += valor;
        System.out.println("Aumento de R$" + valor + " Recebido!");
    }

    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }

    public double calcularImposto() {
        return 0;
    }

    public double calcularGanhoLiquidoMensal() {
        double valorLiquido = this.salario;
        valorLiquido *= 0.89;
        if (this.salario > 2.500) {
            valorLiquido += this.salario * 0.825;
        }

        return valorLiquido;
    }

    public double calcularGanhoLiquidoAnual() {
        double valorLiquido = this.calcularGanhoLiquidoMensal();
        return valorLiquido * 12;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
