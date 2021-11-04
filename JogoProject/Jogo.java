import AtividadeAccenture.TimeProject;
import java.util.Date;

public class Jogo {
    private Time mandante;
    private Time visitante;
    private Date dataDoJogo;
    private String estadio;
    private int placarMandante;
    private int placarVisitante;

    public Jogo() {
    }

    public Jogo(Time mandante, Time visitante, Date dataDoJogo, String estadio, int placarMandante, int placarVisitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
    }

    public void gerarResultado() {
        int golsMandante = (int) (Math.random() * 5);
        int golsVisitante = (int) (Math.random() * 5);
        this.placarMandante = golsMandante;
        this.placarVisitante = golsVisitante;
    }

    public void gerarLesoes () {
        int lesoesMandante = (int) (Math.random() * 5);
        int lesoesVisitante = (int) (Math.random() * 5);
        this.mandante.setLesoes(lesoesMandante);
        this.visitante.setLesoes(lesoesVisitante);
    }

    public void gerarCartoes () {
        int cartoesMandante = (int) (Math.random() * 5);
        int cartoesVisitante = (int) (Math.random() * 5);
        this.mandante.setCartoes(cartoesMandante);
        this.visitante.setCartoes(cartoesVisitante);
    }

    public void permitirTreinamento () {
        this.mandante.treinar();
        this.visitante.treinar();
    }
}