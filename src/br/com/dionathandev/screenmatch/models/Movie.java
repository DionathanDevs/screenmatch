    package br.com.dionathandev.screenmatch.models;

    public class Movie extends Media {

        private int durationMinutes;

        public Movie(String name, int year, boolean sessionPlus, int durationMinutes) {
            super(name, year, sessionPlus);
            this.durationMinutes = durationMinutes;
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





