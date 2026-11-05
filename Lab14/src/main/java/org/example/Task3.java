package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public void execute() {
        System.out.println("Задание 3");

        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        Random random = new Random();

        // --- 1. Генерация 15 случайных чисел и запись в файл 'f' ---
        try (FileWriter writerF = new FileWriter(fileF)) {
            for (int i = 0; i < 15; i++) {
                int randomNum = random.nextInt(250) - 50;
                writerF.write(randomNum + " ");
            }
            writerF.flush();
        } catch (IOException e) {
            System.err.println("Ошибка создания файла f: " + e.getMessage());
            return;
        }

        // --- 2. Чтение из 'f' и распределение по файлам 'g' и 'h' ---
        StringBuilder allNumbers = new StringBuilder();
        StringBuilder gNumbers = new StringBuilder();
        StringBuilder hNumbers = new StringBuilder();

        try (FileReader readerF = new FileReader(fileF);
             Scanner fileScanner = new Scanner(readerF);
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                allNumbers.append(num).append(" ");

                if (num % 3 == 1) {
                    writerG.write(num + " ");
                    gNumbers.append(num).append(" ");
                } else {
                    writerH.write(num + " ");
                    hNumbers.append(num).append(" ");
                }
            }

            writerG.flush();
            writerH.flush();
        } catch (IOException e) {
            System.err.println("Ошибка обработки файлов: " + e.getMessage());
            return;
        }

        // --- 3. Вывод результатов на экран ---
        System.out.println("Содержимое файла 'f' (исходные случайные числа): " + allNumbers);
        System.out.println("Содержимое файла 'g' (остаток 1 при делении на 3): " + gNumbers);
        System.out.println("Содержимое файла 'h' (остальные числа): " + hNumbers);
        System.out.println();
    }
}