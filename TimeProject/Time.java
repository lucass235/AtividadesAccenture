import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Time {
    private String nome;
    private String apelido;
    private Date fundacao;
    private List<Jogador> plantel = new ArrayList<Jogador>();
    private Jogador[] relacionados;

    public Time() {
    }

    public Time(String nome, String apelido, List<Jogador> plantel, Date fundacao) {
        this.nome = nome;
        this.apelido = apelido;
        this.plantel = plantel;
        this.fundacao = fundacao;
        this.relacionados = new Jogador[11];
    }

    public Jogador[] relacionarJogadores() {
        this.plantel.sort(Comparator.comparing(Jogador::getQualidade).reversed());

        for (int i = 0; i < 11; i++) {
            relacionados[i] = this.plantel.get(i);
        }

        return relacionados;

    }

    public List<Jogador> getPlantel() {
        return plantel;
    }

    public void setPlantel(List<Jogador> plantel) {
        this.plantel = plantel;
    }

    public Jogador[] getRelacionados() {
        return relacionados;
    }

    public void setRelacionados(Jogador[] relacionados) {
        this.relacionados = relacionados;
    }

}
