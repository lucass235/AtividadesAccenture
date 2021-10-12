public class Cliente{

    private String nome;
    private String cpf;
    private String sobreNome;
    private int numero;
    private ContaCorrente conta;

    public Cliente(String nome, String cpf, String sobreNome, int numero, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobreNome = sobreNome;
        this.numero = numero;
        conta = new ContaCorrente(numero, saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void depositar(double valor) {
        conta.depositar(valor);
    }

    public void sacar(double valor) {
        conta.sacar(valor);
    }

    public void trasferir(Cliente c, double valor) {
        conta.trasferir(c.conta, valor);
    }

    public void exibirSaldo() {
        System.out.println("Saldo: R$"+conta.getSaldo());
        
    }

    public void exibirExtrato() {
        conta.exibirExtrato();
        
    }

    @Override
    public String toString() {
        return "Cliente [cpf = " + cpf + ", nome = " + nome + ", numero = " + numero + ", sobreNome = " + sobreNome + "]";
    }

}
