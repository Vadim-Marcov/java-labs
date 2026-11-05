package org.example;

public class Pizza implements Cookable, Storable {
    private String name;
    private String toppings;
    private int cookingTime;

    public String getName() {
        return name;
    }

    public String getToppings() {
        return toppings;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Pizza(String name, String toppings, int cookingTime) {
        this.name = name;
        this.toppings = toppings;
        this.cookingTime = cookingTime;
    }

    public void cook() {
        System.out.println("Пицца " + name + " запекается");
    }

    public void store() {
        System.out.println("Пицца " + name + " хранится в холодильнике");
    }

    public String getExpirationDate() {
        return "3 дня";
    }
}
