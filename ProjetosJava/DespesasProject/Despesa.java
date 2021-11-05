public class Despesa {
    private String cpf;
    private DespesaDia[] vDespesas;
    private int pos;

    public Despesa(String cpf, DespesaDia[] vDespesas, int pos) {
        this.cpf = cpf;
        this.vDespesas = vDespesas;
        this.pos = pos;
    }

    public void setvDespesas(DespesaDia[] vDespesas) {
        this.vDespesas = vDespesas;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public DespesaMes DespesaDoMes(int mes) {
        float totalDespesas = 0;
        DespesaMes despesaIndividuo;
        for (int i = 0; i < this.pos; i++) {
            if (vDespesas[i].getMes() == mes) {
                totalDespesas += this.vDespesas[i].getValor();
            }
        }
        if (totalDespesas == 0) {
            return null;
        } else {
            despesaIndividuo = new DespesaMes(mes, totalDespesas);
            return despesaIndividuo;
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
