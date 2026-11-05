package org.example;

public class App {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Дуб", 1500, "Дерево");
        Tree tree2 = new Tree("Сосна", 2000, "Дерево");
        Tree tree3 = new Tree("Береза", 1200, "Дерево");
        Flower flower1 = new Flower("Роза", 50, "Цветок");
        Flower flower2 = new Flower("Тюльпан", 30, "Цветок");

        Plant[] plants = {tree1, tree2, tree3, flower1, flower2};

        System.out.println("Полив растений");
        for (int i = 0; i < plants.length; i++) {
            plants[i].water();
            plants[i].water(5);
            plants[i].water("утром");
            System.out.println();
        }

        System.out.println("Рост растений");
        for (int i = 0; i < plants.length; i++) {
            plants[i].grow();
        }
    }
}
