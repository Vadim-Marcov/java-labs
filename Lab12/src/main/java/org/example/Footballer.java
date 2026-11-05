package org.example;

public class Footballer extends Athlete {
    private int goals;

    public Footballer(String name, int id, int medals, int goals) {
        super(name, id, medals);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return super.toString() + " Голы: " + goals;
    }
}