package org.example;

public class Planet extends CelestialBody {
    private int moons;

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    public Planet(String name, double mass, double diameter, int moons) {
        super(name, mass, diameter);
        this.moons = moons;
    }

    public String getType() {
        return "Планета";
    }

    public double calculateGravity() {
        double radius = getDiameter() / 2;
        return 9.8 * (getMass() / (radius * radius));
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип: " + getType() + " Спутники: " + moons + " Гравитация: " + calculateGravity());
    }
}