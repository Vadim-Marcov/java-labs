package org.example;

public class Athlete {
    private String name;
    private String sport;
    private int age;
    private int medals;
    private double rating;

    public Athlete(String name, String sport, int age, int medals, double rating) throws InvalidAthleteDataException {
        this.name = name;
        this.sport = sport;
        setAge(age);
        setMedals(medals);
        this.rating = rating;
    }

    public void setAge(int age) throws InvalidAthleteDataException {
        if (age < 10 || age > 80) {
            throw new InvalidAthleteDataException("Возраст спортсмена должен быть от 10 до 80 лет: " + age);
        }
        this.age = age;
    }

    public void setMedals(int medals) throws InvalidAthleteDataException {
        if (medals < 0) {
            throw new InvalidAthleteDataException("Количество медалей не может быть отрицательным: " + medals);
        }
        this.medals = medals;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public int getAge() {
        return age;
    }

    public int getMedals() {
        return medals;
    }

    public double getRating() {
        return rating;
    }

    public void addMedal() throws MedalUpdateException {
        this.medals++;
    }

    public void updateRating(double newRating) {
        this.rating = newRating;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Спорт: " + sport + " Возраст: " + age + " Медали: " + medals + " Рейтинг: " + rating;
    }
}