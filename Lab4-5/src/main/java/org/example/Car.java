package org.example;

public class Car {
    private String brand;
    private Color color;

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(String brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public String toString() {
        return "Бренд автомобиля: " + brand + " Цвет: " + color;
    }
}
