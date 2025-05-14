    package br.com.dionathandev.screenmatch.models;

    import br.com.dionathandev.screenmatch.classificacao.Classificavel;

    public class Movie extends Media implements Classificavel {

        private int durationMinutes;

        public Movie(String name, int year, boolean sessionPlus, int durationMinutes) {
            super(name, year, sessionPlus);
            this.durationMinutes = durationMinutes;
        }

        @Override
        public String toString() {
            return "Filme: " + this.getName() + "\nAno de Lançamento: " + this.getYear();
        }

        @Override
        public int getClassificacao() {
            return (int) averageRating() / 2;
        }

        public void setDurationMinutes(int durationMinutes) {
            this.durationMinutes = durationMinutes;

        }
        public int getDurationMinutes() {
            return durationMinutes;
        }

        @Override
        public void viewTechnical() {
            super.viewTechnical();
            System.out.println("Duration Minutes: " + durationMinutes);
        }
    }





