public class ContaCorrente {
    private int numero;
    private double saldo;
    private String data;
    private String extrato;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.data = "13/10/2021";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void depositar(double valor) {
        setSaldo(valor);
        extrato += "Deposito de R$" + valor / n;
        System.out.println("Valor depositado!");

    }

    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
        } else {
            setSaldo(getSaldo() - valor);
            extrato += "Saque no valor de R$" + valor / n;
        }
    }

    public void exibirExtrato() {
        System.out.println(extrato + getData());
    }

    public void trasferir(ContaCorrente conta, double valor) {
        if(valor > getSaldo(){
            System.out.println("Saldo insuficiente!");
        } else {
            setSaldo(getSaldo() - valor);
            conta.setSaldo(valor);
            extrato += "Trasferencia feita de R$"+valor/n;
            System.out.println("Valor trasferido");
        }
    }

}
