package org.example;

public class Athlete {
    private String name;
    private int id;
    private int medals;

    public Athlete(String name, int id, int medals) {
        this.name = name;
        this.id = id;
        this.medals = medals;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMedals() {
        return medals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Имя: " + name + " Медали: " + medals;
    }
}
