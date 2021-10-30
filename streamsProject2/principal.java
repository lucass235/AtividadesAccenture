import java.util.List;

public class principal {
    public static void main(String[] args) {
        Movies filmes = new Movies();
        Movie filme1 = new Movie("lucas o ADM", 100, 2021, "Luquinhas");
        Movie filme2 = new Movie("O rei Delas", 90, 2020, "Marquinhos");
        Movie filme3 = new Movie("O Tradutor", 150, 2022, "Cachorao");
        Movie filme4 = new Movie("Sergio MIPS", 60, 1955, "Beto Agua");
        filmes.setMovies(filme1);
        filmes.setMovies(filme2);
        filmes.setMovies(filme3);
        filmes.setMovies(filme4);

        int contFilmes = filmes.contFilmes();
        System.out.println(contFilmes);

        int contFilmesS = filmes.contFilmesStanley();
        System.out.println(contFilmesS);

        List<Movie> filmesDuracao100 = filmes.duracaoFilme100();
        System.out.println(filmesDuracao100);

        filmes.filmeLongoECurto();

        filmes.filmesCronologica();

    }
}
