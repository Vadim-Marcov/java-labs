package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {

    public void execute() {
        System.out.println("Задание 5");

        String fileName = "f.txt";
        int[] numbers = {12, 55, 34, 78, 90, 50, -10, 49, 102, 61};

        // --- 1. Запись 10 целых чисел в файл 'f' ---
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int num : numbers) {
                writer.write(num + " ");
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл f: " + e.getMessage());
            return;
        }

        // --- 2. Чтение из файла и подсчет чисел, больших 50 ---
        int countGreaterThan50 = 0;
        StringBuilder readNumbers = new StringBuilder();

        try (FileReader reader = new FileReader(fileName);
             Scanner fileScanner = new Scanner(reader)) {

            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                readNumbers.append(num).append(" ");

                if (num > 50) {
                    countGreaterThan50++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла f: " + e.getMessage());
            return;
        }

        // --- 3. Вывод результатов ---
        System.out.println("Числа в файле 'f': " + readNumbers);
        System.out.println("Количество чисел, больших 50: " + countGreaterThan50);
        System.out.println();
    }
}