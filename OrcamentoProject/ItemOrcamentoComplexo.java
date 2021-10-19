public class ItemOrcamentoComplexo extends ItemOrcamento {

    private ItemOrcamento[] vetorItem;
    private int pos;

    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] vetor, int pos) {
        super(historico, valor);
        this.vetorItem = vetor;
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public float getValor() {
        float totalValor = 0;
        for (int i = 0; i < pos; i++) {
            totalValor += vetorItem[i].getValor();
        }
        return totalValor;
    }

    public ItemOrcamento encontraItem(String historico) {
        ItemOrcamento item = null;
        for (int i = 0; i < pos; i++) {
            if (vetorItem[i].getHistorico().equals(historico)) {
                item = vetorItem[i];
                return item;
            }
        }
        return item;
    }

    public ItemOrcamento[] getVetorItem() {
        return vetorItem;
    }

    public void setVetorItem(ItemOrcamento[] vetorItem) {
        this.vetorItem = vetorItem;
    }
}
