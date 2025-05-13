package br.com.dionathandev.screenmatch.models;

public class Series extends Media {
    private int episodes;
    private int seasons;

    public Series(String name, int year, boolean sessionPlus, int episodes, int seasons) {
        super(name, year, sessionPlus);
        this.episodes = episodes;
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public void viewTechnical() {
        super.viewTechnical();
        System.out.println("Episodes: " + episodes);
        System.out.println("Seasons: " + seasons);
    }
}
