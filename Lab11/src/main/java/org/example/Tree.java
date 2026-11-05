package org.example;

public class Tree extends Plant {
    public Tree(String name, int height, String type) {
        super(name, height, type);
    }

    public void grow() {
        System.out.println(getName() + " растет быстро");
    }
}
