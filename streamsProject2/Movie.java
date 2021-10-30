public class Movie {
    private String nome;
    private int duracao;
    private int anoLancamento;
    private String autor;

    public Movie(String nome, int duracao, int anoLancamento, String autor) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return " [anoLancamento= " + anoLancamento + " nome= " + nome + "] ";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
