package org.example;

public abstract class CelestialBody {
    private String name;
    private double mass;
    private double diameter;

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public CelestialBody(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    public abstract String getType();

    public abstract double calculateGravity();

    public void displayInfo() {
        System.out.println("Название: " + name + " Масса: " + mass + " Диаметр: " + diameter);
    }
}
