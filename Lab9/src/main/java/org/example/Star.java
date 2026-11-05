package org.example;

public class Star extends CelestialBody {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Star(String name, double mass, double diameter, double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }

    public String getType() {
        return "Звезда";
    }

    public double calculateGravity() {
        return 0;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: " + getType() + " Температура: " + temperature);
    }
}