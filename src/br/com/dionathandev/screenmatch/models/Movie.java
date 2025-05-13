package br.com.dionathandev.screenmatch.models;

public class Movie {

    private String name;
    private int year;
    private boolean sessionPlus;
    private double review;
    private int totalReviews;
    private int durationMinutes;

    public Movie(String name, int year, boolean sessionPlus, double review, int durationMinutes) {
        this.name = name;
        this.year = year;
        this.sessionPlus = sessionPlus;
        this.review = review;
        this.durationMinutes = durationMinutes;
    }

    public void viewTechnical(){
        System.out.println("Nome do filme: " + getName());
        System.out.println("Year do Filme: " + getYear());
        System.out.println("Session Plus: " + getSessionPlus());
        System.out.println("Review: " + getReview());
        System.out.println("Total Reviews: " + getTotalReviews());
        System.out.println("Duration Minutes: " + getDurationMinutes());
        System.out.println("Média Filme: " + averageRating());
    }

    public void rating(double rating){
        review += rating;
        totalReviews++;
    }

    double averageRating(){
        return review/totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReview(double review) {
        this.review = review;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    public void setSessionPlus(boolean sessionPlus) {
        this.sessionPlus = sessionPlus;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public double getReview() {
        return review;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public boolean getSessionPlus() {
        return sessionPlus;
    }
    public int getTotalReviews() {
        return totalReviews;
    }
    public int getYear() {
        return year;
    }

}





