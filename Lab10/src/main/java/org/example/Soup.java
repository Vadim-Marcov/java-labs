package org.example;

public class Soup implements Cookable, Storable {
    private String name;
    private String ingredients;
    private int cookingTime;

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Soup(String name, String ingredients, int cookingTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }

    public void cook() {
        System.out.println("Суп " + name + " варится");
    }

    public void store() {
        System.out.println("Суп " + name + " хранится в холодильнике");
    }

    public String getExpirationDate() {
        return "2 дня";
    }
}
