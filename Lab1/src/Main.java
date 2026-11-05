import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания от 1 до 4: ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.print("Введите радиус: ");
                double radius = scanner.nextDouble();

                while (radius < 0) {
                    System.out.print("Введите радиус > 0: ");
                    radius = scanner.nextDouble();
                }

                double square = Math.PI * Math.pow(radius, 2);
                System.out.print("Площадь круга: " + square);
                break;

            case 2:
                double a, b, c;

                do {
                    System.out.println("Введите три стороны треугольника:");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    c = scanner.nextDouble();
                }
                while (a < 0 || b < 0 || c < 0);

                if (a + b > c && a + c > b && b + c > a)
                    System.out.print("Треугольник существует");
                else
                    System.out.print("Треугольник не существует");
                break;

            case 3:
                System.out.print("Введите целое число: ");
                int number = scanner.nextInt();
                int revers = 0;

                while (number != 0) {
                    int temp = number % 10;
                    revers = revers * 10 + temp;
                    number /= 10;
                }

                System.out.print("Перевернутое число: " + revers);
                break;

            case 4:
                System.out.print("Введите столицу: ");
                String city = scanner.next();

                switch (city){
                    case "Минск": System.out.print("Страна: Беларусь");
                    break;

                    case "Москва": System.out.print("Страна: Россия");
                    break;

                    default: System.out.print("Выбранной столицы не существует");
                }
                break;

            default:
                System.out.print("Выбранного задания не существует");
        }
    }
}