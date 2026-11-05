import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания от 1 до 3: ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.print("Введите строку: ");
                String str = scanner.next();

                int lastIndex = str.lastIndexOf('о');

                System.out.print("Индекс последнего вхождения о: " + lastIndex);
                break;

            case 2:
                System.out.print("Введите email: ");
                String email = scanner.next();

                boolean isValid = email.matches(".+@.+\\..+");

                if (isValid)
                    System.out.print(email + " является корректным.");
                else
                    System.out.print(email + " не является корректным.");
                break;

            case 3:
                String text = "a1a a22a a333a a4444a a55555a";

                Pattern pattern = Pattern.compile("a[2-5]{2,3}a");
                Matcher matcher = pattern.matcher(text);

                System.out.println("Найденные строки:");
                while (matcher.find())
                    System.out.println(matcher.group());
                break;

            default:
                System.out.print("Выбранного задания не существует");
        }
    }
}