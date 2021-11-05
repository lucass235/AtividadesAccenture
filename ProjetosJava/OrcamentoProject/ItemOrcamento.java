public class ItemOrcamento {
    private String historico;
    private float valor;

    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }

}
