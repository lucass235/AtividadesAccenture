public class ItemOrcamentoComplexo extends ItemOrcamento {
   
    private ItemOrcamento[] vetorItem;

    public ItemOrcamentoComplexo (String historico, float valor, ItemOrcamento[] vetor) {
        super(historico, valor);
        this.vetorItem = vetor;
    }

    @Override
    public float getValor() {
        float totalValor = 0;
        for (int i = 0;i < vetorItem.length;i++) {
            totalValor += vetorItem[i].getValor();
        }
        return totalValor;
    }

    public ItemOrcamento encontraItem (String historico) {
        ItemOrcamento item = null;
        for (int i = 0;i < vetorItem.length;i++) {
            if (vetorItem[i].getHistorico() == historico) {
                item = vetorItem[i];
                return item;
            }
        }
        return item;
    }
}
