package org.example;

public class Flower extends Plant {
    public Flower(String name, int height, String type) {
        super(name, height, type);
    }

    public void grow() {
        System.out.println(getName() + " растет очень быстро");
    }
}
