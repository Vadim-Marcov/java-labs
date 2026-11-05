package org.example;

public class App {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Маргарита", "Сыр, томаты", 20);
        Pizza pizza2 = new Pizza("Пепперони", "Колбаса, сыр", 25);
        Pizza pizza3 = new Pizza("4 сыра", "Моцарелла, пармезан", 22);

        Soup soup1 = new Soup("Борщ", "Свекла, мясо", 60);
        Soup soup2 = new Soup("Куриный", "Курица, картофель", 40);

        Cookable[] cookables = {pizza1, pizza2, pizza3, soup1, soup2};
        Storable[] storables = {pizza1, pizza2, pizza3, soup1, soup2};

        System.out.println("Приготовление");
        for (int i = 0; i < cookables.length; i++) {
            cookables[i].cook();
            System.out.println("Время приготовления: " + cookables[i].getCookingTime() + " мин.");
            System.out.println();
        }

        System.out.println("Хранение");
        for (int i = 0; i < storables.length; i++) {
            storables[i].store();
            System.out.println("Срок годности: " + storables[i].getExpirationDate());
            System.out.println();
        }
    }
}
