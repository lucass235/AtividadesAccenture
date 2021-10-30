public class Funcionario {
    private String nome;
    private String sobreNome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public void nomeCompleto() {
        System.out.println("Nome completo: " + nome + " " + sobreNome);
    }

    public void calcularSalario() {
        double salario;
        salario = this.horasTrabalhadas * valorPorHora;
        System.out.println("O funcionário irá receber no mês R$" + salario);
    }

    public void incrementaHoras(double hora) {
        this.valorPorHora += hora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

}
