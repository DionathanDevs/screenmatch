package br.com.dionathandev.screenmatch.models;

public class Episode {
    private int number;
    private String title;
    private String description;
    private Series series;

    public Episode(int number, String title, String description, Series series) {
        this.number = number;
        this.title = title;
        this.description = description;
        this.series = series;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }
}
