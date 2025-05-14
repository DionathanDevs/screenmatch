package br.com.dionathandev.screenmatch.main;

import br.com.dionathandev.screenmatch.models.Media;
import br.com.dionathandev.screenmatch.models.Movie;
import br.com.dionathandev.screenmatch.models.Series;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {
        Movie m1 = new Movie("FIlme1", 2005,true, 254);
        Series s1 = new Series("Teste1", 2005, true, 20,4);

        ArrayList<Media> ViewList = new ArrayList<>();
        ViewList.add(m1);
        ViewList.add(s1);
        for (Media m : ViewList) {
            if(m instanceof Movie) {
                Movie movie = (Movie) m;
                System.out.println(movie.getClassificacao());
            }else if(m instanceof Series) {
                Series series = (Series) m;
                System.out.println(series.getEpisodes());
            }
        }
    }
}
