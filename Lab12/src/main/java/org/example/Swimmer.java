package org.example;

public class Swimmer extends Athlete {
    private int records;

    public Swimmer(String name, int id, int medals, int records) {
        super(name, id, medals);
        this.records = records;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return super.toString() + " Рекорды: " + records;
    }
}