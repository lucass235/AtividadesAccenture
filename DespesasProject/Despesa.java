public class Despesa {
    private String cpf;
    private float[] despesas;

    public Despesa(String cpf, float[] despesas) {
        this.cpf = cpf;
        this.despesas = despesas;
    }

    public String getCpf() {
        return cpf;
    }

    public DespesaMes (int mes) {
        float totalDespesas = 0;
        DespesaMes despesaIndividuo;
        for (int i = 0;i < despesas.length;i++) {
            totalDespesas += despesas[i];
        }
        despesaIndividuo = new DespesaMes(mes, totalDespesas);
        return despesaIndividuo;
    }
}
