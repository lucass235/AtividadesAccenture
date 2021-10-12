public class Cliente {

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

    public string getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(string sobreNome) {
        this.sobreNome = sobreNome;
    }

}
