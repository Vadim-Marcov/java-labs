import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер задания от 1 до 2: ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.print("Введите размер массива: ");
                int n = scanner.nextInt();

                while (n <= 0) {
                    System.out.print("Введите размер массива > 0: ");
                    n = scanner.nextInt();
                }

                int[] arr1 = new int[n];
                System.out.println("Заполните элементы массива: ");

                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = scanner.nextInt();
                }

                System.out.print("Введите число X для проверки: ");
                int x = scanner.nextInt();

                boolean isHave = false;
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] == x) {
                        isHave = true;
                        break;
                    }
                }

                if (isHave)
                    System.out.print("Заданное число Х есть в массиве");
                else
                    System.out.print("Заданного числа Х нет в массиве");

                break;

            case 2:
                System.out.print("Введите размер матрицы: ");
                int m = scanner.nextInt();

                while (m <= 0) {
                    System.out.print("Введите размер матрицы > 0: ");
                    m = scanner.nextInt();
                }

                int[][] arr2 = new int[m][m];
                System.out.println("Заполните элементы матрицы: ");

                for (int i = 0; i < arr2.length; i++) {
                    for (int j = 0; j < arr2[i].length; j++) {
                        arr2[i][j] = scanner.nextInt();
                    }
                }

                int temp = 0;
                for (int j = 0; j < m; j++)
                    temp += arr2[0][j];

                boolean isMagic = true;

                for (int i = 0; i < m; i++) {
                    int row = 0, col = 0;

                    for (int j = 0; j < m; j++) {
                        row += arr2[i][j];
                        col += arr2[j][i];
                    }

                    if (row != temp || col != temp)
                        isMagic = false;
                }

                int mainDiag = 0, secDiag = 0;

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++){
                        if (i == j)
                            mainDiag += arr2[i][j];

                        if (i + j == m - 1)
                            secDiag += arr2[i][j];
                    }
                }

                if (mainDiag != temp || secDiag != temp)
                    isMagic = false;

                if (isMagic)
                    System.out.print("Магический квадрат");
                else
                    System.out.print("Не магический квадрат");

                break;

            default:
                System.out.print("Выбранного задания не существует");
        }
    }
}