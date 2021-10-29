import java.util.ArrayList;
import java.util.List;

public class Movies {
    private List<Movie> movies = new ArrayList<>();

    public Movies() {

    }

    public List<String> getMovies() {
        return filmes;
    }

    public void setMovies(Movie filme) {
        this.filmes.add(filme);
    }

    public int contFilmes() {
        return movies.stream().count();
    }
}
