package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Лабораторная 6:");
        Store store = new Store("Просто маркет", "Шишкина 50", 10, 1);
        System.out.println(store);
        System.out.println("Кол-во сотрудников больше 50?: " + store.isLarge());

        University[] universities = {
                new University("БГУ", 2200, 10),
                new University("БиП", 1400, 6),
                new University("БНТУ", 1800, 8)
        };

        System.out.println("\nЛабораторная 7:");
        System.out.print("Среднее число студентов на университет: " + University.getAverageStudents());
    }
}
