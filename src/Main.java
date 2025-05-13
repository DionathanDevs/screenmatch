import br.com.dionathandev.screenmatch.models.Media;
import br.com.dionathandev.screenmatch.models.Movie;
import br.com.dionathandev.screenmatch.models.Series;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("FIlme1", 2005,true, 254);

        m1.viewTechnical();

        Series s1 = new Series("Teste1", 2005, true, 20,4);

        s1.viewTechnical();

    }
}