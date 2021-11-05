import java.util.Date;
import java.text.*;

public class MainJogador {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyy");
        Date data = date.parse("00/00/000");
        data = date.parse("15/12/1999");
        Jogador jogador1 = new Jogador(1, "Lucas", "Luquinhas", data, 00, "Goleiro", 5, 0, false);
        data = date.parse("14/11/1995");
        Jogador jogador2 = new Jogador(2, "Marcos", "Marquinhos", data, 20, "Zagueiro", 10, 0, false);
        data = date.parse("13/10/1996");
        Jogador jogador3 = new Jogador(3, "Wesley", "Wess", data, 20, "Zagueiro", 5, 3, false);
        data = date.parse("12/09/1997");
        Jogador jogador4 = new Jogador(4, "Matheus", "Beto", data, 20, "Zagueiro", 8, 1, false);
        data = date.parse("05/08/1998");
        Jogador jogador5 = new Jogador(5, "Ze", "Gaturro", data, 20, "Zagueiro", 8, 0, true);
        data = date.parse("11/07/1993");
        Jogador jogador6 = new Jogador(6, "Djalma", "DJ Alma", data, 06, "Meio Campista", 2, 3, false);
        data = date.parse("10/06/1992");
        Jogador jogador7 = new Jogador(7, "Davi", "Charreteiro", data, 06, "Meio Campista", 10, 1, true);
        data = date.parse("18/05/1991");
        Jogador jogador8 = new Jogador(8, "Rafael", "Apple Boy", data, 06, "Meio Campista", 9, 0, false);
        data = date.parse("05/04/1969");
        Jogador jogador9 = new Jogador(9, "Pedro", "O Sumido", data, 06, "Meio Campista", 10, 0, false);
        data = date.parse("02/03/1979");
        Jogador jogador10 = new Jogador(10, "Joao", "Matador de Onça", data, 07, "Atacante", 10, 0, true);
        data = date.parse("07/02/1989");
        Jogador jogador11 = new Jogador(11, "Rhaylene", "BB", data, 07, "Atacante", 10, 0, false);

        exibirJogador(jogador1);
        exibirJogador(jogador2);
        exibirJogador(jogador3);
        exibirJogador(jogador4);
        exibirJogador(jogador5);
        exibirJogador(jogador6);
        exibirJogador(jogador7);
        exibirJogador(jogador8);
        exibirJogador(jogador9);
        exibirJogador(jogador10);
        exibirJogador(jogador11);

        jogador1.aplicarCartao(1);

        jogador7.cumprirSuspensao();

        jogador2.sofrerLesao();

        jogador6.executarTreinamento();

        System.out.println("=======DEPOIS DAS MODIFICAÇÕES==========");

        exibirJogador(jogador1);
        exibirJogador(jogador2);
        exibirJogador(jogador3);
        exibirJogador(jogador4);
        exibirJogador(jogador5);
        exibirJogador(jogador6);
        exibirJogador(jogador7);
        exibirJogador(jogador8);
        exibirJogador(jogador9);
        exibirJogador(jogador10);
        exibirJogador(jogador11);

    }

    public static void exibirJogador(Jogador jogador) {
        String condicao;
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyy");
        String data = date.format(jogador.getDataNascimento());
        if (jogador.getSuspenso() == false) {
            condicao = "TA PRA JOGAR";
        } else {
            condicao = "SUSPENSO";
        }
        String jogado = jogador.getPosicao() + ": " + jogador.getId() + " - " + jogador.getNome() + " - " + data
                + " Condição: " + condicao;
        System.out.println(jogado);
    }
}
