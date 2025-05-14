import br.com.dionathandev.screenmatch.classificacao.Recomendacao;
import br.com.dionathandev.screenmatch.models.Media;
import br.com.dionathandev.screenmatch.models.Movie;
import br.com.dionathandev.screenmatch.models.Series;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("FIlme1", 2005,true, 254);

        m1.viewTechnical();

        Series s1 = new Series("Teste1", 2005, true, 20,4);

        s1.viewTechnical();
        m1.rating(8.0);
        Recomendacao r1 = new Recomendacao();

        r1.filter(m1);

        ArrayList<Movie> MoviesList = new ArrayList<>();
        MoviesList.add(m1);

        System.out.println("Tamanho da Lista: " +  MoviesList.size());
        System.out.println("Primeiro Filme: " + MoviesList.get(0).getName());
    }
}