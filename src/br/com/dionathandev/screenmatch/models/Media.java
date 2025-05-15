package br.com.dionathandev.screenmatch.models;

public class Media implements Comparable<Media> {

    private String name;
    private int year;
    private boolean sessionPlus;
    private double review;
    private int totalReviews;


    public Media(String name, int year, boolean sessionPlus) {
        this.name = name;
        this.year = year;
        this.sessionPlus = sessionPlus;
        this.review = 0;
        this.totalReviews = 0;

    }

    public void viewTechnical(){
        System.out.println("Nome do filme: " + getName());
        System.out.println("Year do Filme: " + getYear());
        System.out.println("Session Plus: " + getSessionPlus());
        System.out.println("Review: " + getReview());
        System.out.println("Total Reviews: " + getTotalReviews());

        System.out.println("Média Filme: " + this.averageRating());
    }

    public void rating(double rating){
        review += rating;
        totalReviews += 1;
    }

    double averageRating(){
            if (totalReviews <= 0){
                return 0;
            } else{
                return review/totalReviews;
            }




    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReview(double review) {
        this.review = review;
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

    public boolean getSessionPlus() {
        return sessionPlus;
    }
    public int getTotalReviews() {
        return totalReviews;
    }
    public int getYear() {
        return year;
    }


    @Override
        public int compareTo(Media otherMedia) {
        return this.getName().compareTo(otherMedia.getName());
    }
}
