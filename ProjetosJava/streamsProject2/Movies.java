import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Movies {
    private List<Movie> movies = new ArrayList<>();

    public Movies() {

    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Movie filme) {
        this.movies.add(filme);
    }

    public int contFilmes() {
        long cont = movies.stream().count();

        return (int) cont;
    }

    public int contFilmesStanley() {
        long cont = movies.stream().filter(e -> e.getAutor().equals("Stanley")).count();

        return (int) cont;
    }

    public List<Movie> duracaoFilme100() {
        List<Movie> filme;

        filme = movies.stream().filter(e -> e.getDuracao() < 100).collect(Collectors.toList());

        return filme;
    }

    public void mapa() {

    }

    public void filmeLongoECurto() {
        OptionalInt maior = movies.stream().mapToInt(val -> val.getDuracao()).max();
        OptionalInt menor = movies.stream().mapToInt(val -> val.getDuracao()).min();

        Map<String, List<Movie>> filmeMaior = movies.stream().filter(filme -> filme.getDuracao() == maior.getAsInt())
                .collect(Collectors.groupingBy(filme -> filme.getNome()));

        Map<String, List<Movie>> filmeMenor = movies.stream().filter(filme -> filme.getDuracao() == menor.getAsInt())
                .collect(Collectors.groupingBy(filme -> filme.getNome()));

        System.out.println("Filme longo: " + filmeMaior);
        System.out.println("Filme menor: " + filmeMenor);

    }

    public void filmesCronologica() {
        movies.stream().sorted(Comparator.comparingInt(Movie::getAnoLancamento)).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
