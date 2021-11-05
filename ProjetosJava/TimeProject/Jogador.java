import java.util.Date;
import java.util.Random;

public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private boolean suspenso;
    private boolean treinamentoFeito;

    public Jogador() {
    }

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numero, String posicao, int qualidade,
            int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
        this.treinamentoFeito = false;
    }

    public boolean verificarCondicaoDeJogo() {
        if (this.cartoes == 3 || this.suspenso == true) {
            return false;
        }
        return true;
    }

    public void aplicarCartao(int qtd) {
        this.cartoes += qtd;
        if (this.cartoes >= 3) {
            this.suspenso = true;
        }
    }

    public void cumprirSuspensao() {
        this.cartoes = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        Random grauLesao = new Random();
        double perda;
        switch (grauLesao.nextInt(5) + 1) {
        case 1:
            perda = this.qualidade * 0.15;
            this.qualidade -= perda;
            break;
        case 2:
            perda = this.qualidade * 0.10;
            this.qualidade -= perda;
            break;
        case 3:
            perda = this.qualidade * 0.05;
            this.qualidade -= perda;
            break;
        case 4:
            this.qualidade -= 2;
            break;

        default:
            this.qualidade -= 1;

        }
    }

    public void executarTreinamento() {
        if (this.treinamentoFeito == true) {
            System.out.println("Treinamento ja executado");
        } else {
            Random grauQualidade = new Random();
            switch (grauQualidade.nextInt(5) + 1) {
            case 1:
                if (this.qualidade < 100) {
                    this.qualidade += 5;
                }
                break;
            case 2:
                if (this.qualidade < 100) {
                    this.qualidade += 4;
                }
                break;
            case 3:
                if (this.qualidade < 100) {
                    this.qualidade += 3;
                }
                break;
            case 4:
                if (this.qualidade < 100) {
                    this.qualidade += 2;
                }
                break;

            default:
                if (this.qualidade < 100) {
                    this.qualidade += 1;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", qualidade=" + qualidade + "]";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public boolean getSuspenso() {
        return this.suspenso;
    }

}
