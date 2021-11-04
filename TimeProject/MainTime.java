import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.*;

public class MainTime {
    public static void main(String[] args) throws ParseException {
        List<Jogador> jogadores1 = new ArrayList<Jogador>();
        List<Jogador> jogadores2 = new ArrayList<Jogador>();
        Time time1;
        Time time2;
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

        data = date.parse("15/12/1999");
        Jogador jogador12 = new Jogador(1, "Lucas", "Luquinhas", data, 00, "Goleiro", 5, 0, false);
        data = date.parse("14/11/1995");
        Jogador jogador13 = new Jogador(2, "Marcos", "Marquinhos", data, 20, "Zagueiro", 10, 0, false);
        data = date.parse("13/10/1996");
        Jogador jogador14 = new Jogador(3, "Wesley", "Wess", data, 20, "Zagueiro", 5, 3, false);
        data = date.parse("12/09/1997");
        Jogador jogador15 = new Jogador(4, "Matheus", "Beto", data, 20, "Zagueiro", 8, 1, false);
        data = date.parse("05/08/1998");
        Jogador jogador16 = new Jogador(5, "Ze", "Gaturro", data, 20, "Zagueiro", 8, 0, true);
        data = date.parse("11/07/1993");
        Jogador jogador17 = new Jogador(6, "Djalma", "DJ Alma", data, 06, "Meio Campista", 2, 3, false);
        data = date.parse("10/06/1992");
        Jogador jogador18 = new Jogador(7, "Davi", "Charreteiro", data, 06, "Meio Campista", 10, 1, true);
        data = date.parse("18/05/1991");
        Jogador jogador19 = new Jogador(8, "Rafael", "Apple Boy", data, 06, "Meio Campista", 9, 0, false);
        data = date.parse("05/04/1969");
        Jogador jogador20 = new Jogador(9, "Pedro", "O Sumido", data, 06, "Meio Campista", 10, 0, false);
        data = date.parse("02/03/1979");
        Jogador jogador21 = new Jogador(10, "Joao", "Matador de Onça", data, 07, "Atacante", 10, 0, true);
        data = date.parse("07/02/1989");
        Jogador jogador22 = new Jogador(11, "Rhaylene", "BB", data, 07, "Atacante", 10, 0, false);
        data = date.parse("07/02/1989");
        Jogador jogador23 = new Jogador(11, "Rhaylene", "BB", data, 07, "Atacante", 10, 0, false);

        jogadores1.add(jogador1);
        jogadores1.add(jogador2);
        jogadores1.add(jogador3);
        jogadores1.add(jogador4);
        jogadores1.add(jogador5);
        jogadores1.add(jogador6);
        jogadores1.add(jogador7);
        jogadores1.add(jogador8);
        jogadores1.add(jogador9);
        jogadores1.add(jogador10);
        jogadores1.add(jogador11);
        jogadores1.add(jogador12);
        jogadores1.add(jogador13);
        jogadores1.add(jogador14);
        jogadores1.add(jogador15);
        jogadores1.add(jogador16);
        jogadores1.add(jogador17);
        jogadores1.add(jogador18);
        jogadores1.add(jogador19);
        jogadores1.add(jogador20);
        jogadores1.add(jogador21);
        jogadores1.add(jogador22);
        jogadores1.add(jogador23);

        data = date.parse("15/09/1968");
        time1 = new Time("Los porocas", "Poroca", jogadores1, data);

        data = date.parse("15/12/1999");
        Jogador jogador1a = new Jogador(1, "Lucas", "Luquinhas", data, 00, "Goleiro", 5, 0, false);
        data = date.parse("14/11/1995");
        Jogador jogador2a = new Jogador(2, "Marcos", "Marquinhos", data, 20, "Zagueiro", 10, 0, false);
        data = date.parse("13/10/1996");
        Jogador jogador3a = new Jogador(3, "Wesley", "Wess", data, 20, "Zagueiro", 5, 3, false);
        data = date.parse("12/09/1997");
        Jogador jogador4a = new Jogador(4, "Matheus", "Beto", data, 20, "Zagueiro", 8, 1, false);
        data = date.parse("05/08/1998");
        Jogador jogador5a = new Jogador(5, "Ze", "Gaturro", data, 20, "Zagueiro", 8, 0, true);
        data = date.parse("11/07/1993");
        Jogador jogador6a = new Jogador(6, "Djalma", "DJ Alma", data, 06, "Meio Campista", 2, 3, false);
        data = date.parse("10/06/1992");
        Jogador jogador7a = new Jogador(7, "Davi", "Charreteiro", data, 06, "Meio Campista", 10, 1, true);
        data = date.parse("18/05/1991");
        Jogador jogador8a = new Jogador(8, "Rafael", "Apple Boy", data, 06, "Meio Campista", 9, 0, false);
        data = date.parse("05/04/1969");
        Jogador jogador9a = new Jogador(9, "Pedro", "O Sumido", data, 06, "Meio Campista", 10, 0, false);
        data = date.parse("02/03/1979");
        Jogador jogador10a = new Jogador(10, "Joao", "Matador de Onça", data, 07, "Atacante", 10, 0, true);
        data = date.parse("07/02/1989");
        Jogador jogador11a = new Jogador(11, "Rhaylene", "BB", data, 07, "Atacante", 10, 0, false);

        data = date.parse("15/12/1999");
        Jogador jogador12a = new Jogador(1, "Lucas", "Luquinhas", data, 00, "Goleiro", 5, 0, false);
        data = date.parse("14/11/1995");
        Jogador jogador13a = new Jogador(2, "Marcos", "Marquinhos", data, 20, "Zagueiro", 10, 0, false);
        data = date.parse("13/10/1996");
        Jogador jogador14a = new Jogador(3, "Wesley", "Wess", data, 20, "Zagueiro", 5, 3, false);
        data = date.parse("12/09/1997");
        Jogador jogador15a = new Jogador(4, "Matheus", "Beto", data, 20, "Zagueiro", 8, 1, false);
        data = date.parse("05/08/1998");
        Jogador jogador16a = new Jogador(5, "Ze", "Gaturro", data, 20, "Zagueiro", 8, 0, true);
        data = date.parse("11/07/1993");
        Jogador jogador17a = new Jogador(6, "Djalma", "DJ Alma", data, 06, "Meio Campista", 2, 3, false);
        data = date.parse("10/06/1992");
        Jogador jogador18a = new Jogador(7, "Davi", "Charreteiro", data, 06, "Meio Campista", 10, 1, true);
        data = date.parse("18/05/1991");
        Jogador jogador19a = new Jogador(8, "Rafael", "Apple Boy", data, 06, "Meio Campista", 9, 0, false);
        data = date.parse("05/04/1969");
        Jogador jogador20a = new Jogador(9, "Pedro", "O Sumido", data, 06, "Meio Campista", 10, 0, false);
        data = date.parse("02/03/1979");
        Jogador jogador21a = new Jogador(10, "Joao", "Matador de Onça", data, 07, "Atacante", 10, 0, true);
        data = date.parse("07/02/1989");
        Jogador jogador22a = new Jogador(11, "Rhaylene", "BB", data, 07, "Atacante", 10, 0, false);
        data = date.parse("07/02/1989");
        Jogador jogador23a = new Jogador(11, "Rhaylene", "BB", data, 07, "Atacante", 10, 0, false);

        jogadores2.add(jogador1a);
        jogadores2.add(jogador2a);
        jogadores2.add(jogador3a);
        jogadores2.add(jogador4a);
        jogadores2.add(jogador5a);
        jogadores2.add(jogador6a);
        jogadores2.add(jogador7a);
        jogadores2.add(jogador8a);
        jogadores2.add(jogador9a);
        jogadores2.add(jogador10a);
        jogadores2.add(jogador11a);
        jogadores2.add(jogador12a);
        jogadores2.add(jogador13a);
        jogadores2.add(jogador14a);
        jogadores2.add(jogador15a);
        jogadores2.add(jogador16a);
        jogadores2.add(jogador17a);
        jogadores2.add(jogador18a);
        jogadores2.add(jogador19a);
        jogadores2.add(jogador20a);
        jogadores2.add(jogador21a);
        jogadores2.add(jogador22a);
        jogadores2.add(jogador23a);

        data = date.parse("12/11/1955");
        time2 = new Time("Os matador", "Mortais", jogadores2, data);

        Jogador[] relacionados1 = time1.relacionarJogadores();

        Jogador[] relacionados2 = time2.relacionarJogadores();

        for (int i = 0; i < relacionados1.length; i++) {
            System.out.println(relacionados1[i]);
        }
        System.out.println();

        for (int i = 0; i < relacionados2.length; i++) {
            System.out.println(relacionados2[i]);
        }

    }
}
