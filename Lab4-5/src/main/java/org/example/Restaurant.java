package org.example;

public class Restaurant {
    private String name;
    private String cuisine;
    private double rating;

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Restaurant(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String toString() {
        return "Название ресторана: " + name + " Кухня: " + cuisine + " Рейтинг: " + rating + "\n";
    }
}
