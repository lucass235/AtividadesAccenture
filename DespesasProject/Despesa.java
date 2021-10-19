public class Despesa  {
    private String cpf;
    private float[] vDespesaMes;

    public Despesa(String cpf, float[] vDespesaTotal) {
        this.cpf = cpf;
        this.vDespesaMes = vDespesaTotal;
    }

    public String getCpf() {
        return cpf;
    }

    public DespesaMes DespesaDoMes (int mes) {
        float totalDespesas = 0;
        DespesaMes despesaIndividuo;
        for (int i = 0;i < vDespesaMes.length;i++) {
            totalDespesas += vDespesaMes[i];
        }
        despesaIndividuo = new DespesaMes(mes, totalDespesas);
        return despesaIndividuo;
    }
}
