package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Vadim!");

        Apartment apartment = new Apartment("Шишкина 1", 3, 100.00);
        System.out.println("\nЗадание 1:");
        System.out.print(apartment);
        System.out.println("Цена за квадратный метр: " + apartment.pricePerSquareMeter(1000.00));

        Restaurant[] restaurants = {
                new Restaurant("Хрючево", "Русская", 2.9),
                new Restaurant("Хинкаль", "Грузинская", 4.1),
                new Restaurant("Odi", "Сверхъестественная", 1.6),
                new Restaurant("Багет", "Французская", 3.9),
                new Restaurant("Сир пицца", "Итальянская", 4.7)
        };

        Restaurant maxRating = restaurants[0];
        double sumRating = 0;

        for (int i = 0; i < restaurants.length; i++) {
            sumRating += restaurants[i].getRating();

            if (restaurants[i].getRating() > maxRating.getRating())
                maxRating = restaurants[i];
        }

        double avgRating = sumRating / restaurants.length;

        System.out.println("\nЗадание 2:");
        System.out.print("Ресторан с максимальным рейтингом: " + maxRating);
        System.out.println("Средний рейтинг всех ресторанов: " + avgRating);

        Car[] cars = {
                new Car("Ауди", Color.RED),
                new Car("БМВ", Color.BLACK),
                new Car("Мерседес", Color.WHITE),
                new Car("Феррари", Color.RED),
                new Car("Тойота", Color.BLUE),
                new Car("Порш", Color.RED)
        };

        System.out.println("\nЗадание 3:");
        System.out.println("Красные автомобили:");

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getColor() == Color.RED)
                System.out.println(cars[i]);
        }
    }
}
