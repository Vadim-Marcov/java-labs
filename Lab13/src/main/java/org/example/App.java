package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    public static Athlete findAthlete(List<Athlete> team, String name) throws AthleteNotFoundException {
        Iterator<Athlete> iterator = team.iterator();
        while (iterator.hasNext()) {
            Athlete athlete = iterator.next();
            if (athlete.getName().equalsIgnoreCase(name)) {
                return athlete;
            }
        }
        throw new AthleteNotFoundException("Спортсмен не найден в сборной: " + name);
    }

    public static void main(String[] args) {
        List<Athlete> team = new ArrayList<>();

        try {
            team.add(new Athlete("Александр", "Плавание", 25, 5, 4.8));
            team.add(new Athlete("Дмитрий", "Футбол", 22, 2, 4.2));
            team.add(new Athlete("Иван", "Бокс", 85, 3, 3.9));
        } catch (InvalidAthleteDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        System.out.println("\nТекущий состав сборной:");
        Iterator<Athlete> iterator = team.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        try {
            System.out.println("\nПоиск спортсмена Александр:");
            Athlete athlete = findAthlete(team, "Александр");
            athlete.addMedal();
            athlete.updateRating(4.9);
            System.out.println("Обновленные данные: " + athlete);

            System.out.println("\nПоиск несуществующего спортсмена Максим:");
            findAthlete(team, "Максим");
        } catch (AthleteNotFoundException | MedalUpdateException e) {
            System.out.println("Ошибка при выполнении операции: " + e.getMessage());
        } finally {
            System.out.println("\nРабота сборной завершена.");
        }
    }
}