package org.example;

public class Basketballer extends Athlete {
    private int points;

    public Basketballer(String name, int id, int medals, int points) {
        super(name, id, medals);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return super.toString() + " Очки: " + points;
    }
}