public class Despesa {
    private String cpf;
    private float[] vDespesas;
    private int pos;

    public Despesa(String cpf, float[] vDespesas, int pos) {
        this.cpf = cpf;
        this.vDespesas = vDespesas;
        this.pos = pos;
    }

    public String getCpf() {
        return cpf;
    }

    public DespesaMes DespesaDoMes(int mes) {
        float totalDespesas = 0;
        DespesaMes despesaIndividuo;
        for (int i = 0; i < this.pos; i++) {
            if (mes == vDespesas[i].ge) {
                
            }
            totalDespesas += this.vDespesas[i];
        }
        despesaIndividuo = new DespesaMes(mes, totalDespesas);
        return despesaIndividuo;
    }
}
