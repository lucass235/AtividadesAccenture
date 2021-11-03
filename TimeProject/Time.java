import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Time {
    private String nome;
    private String apelido;
    private Date fundacao;
    private List plantel = new ArrayList<Jogador>();
    private List relacionados = new ArrayList<Jogador>();

    
    public Time() {
    }

    public Time(String nome, String apelido, List plantel, List relacionados, Date fundacao) {
        this.nome = nome;
        this.apelido = apelido;
        this.plantel = plantel;
        this.relacionados = relacionados;
        this.fundacao = fundacao;
    }

    public List<Jogador> relacionarJogadores () {

        this.plantel.sort(Comparator.comparing(Jogador::getQualidade).reversed());
        
        // for (int i = 0; i < 11; i++) {
        //     relacionados.add(plantel.get(i));
        // }
        relacionados = plantel;

        return relacionados;
        
    }

    

    
}
