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
        double imposto  ;
        imposto = this.salario * 0.11;
        if (this.salario > 2.500) {
            imposto += this.salario * 0.175;
        }
        return imposto;
    }

    public double calcularGanhoLiquidoMensal() {
        double ivalorLiquido = this.salario;
        ivalorLiquido *= 0.89;
        if (this.salario > 2.500) {
            ivalorLiquido += this.salario * 0.825;
        }

        return ivalorLiquido;
    }

    public double calcularGanhoLiquidoAnual() {
        double ivalorLiquido = this.calcularGanhoLiquidoMensal();
        return ivalorLiquido * 12;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
