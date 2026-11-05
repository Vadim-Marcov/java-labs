package org.example;

public class Plant {
    private String name;
    private int height;
    private String type;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Plant(String name, int height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;
    }

    public void water() {
        System.out.println("Поливаю растение " + name);
    }

    public void water(int liters) {
        System.out.println("Поливаю " + name + " " + liters + " литрами");
    }

    public void water(String time) {
        System.out.println("Поливаю " + name + " в " + time);
    }

    public void grow() {
        System.out.println(name + " растет медленно");
    }
}
