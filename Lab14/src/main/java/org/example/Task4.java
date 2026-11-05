package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task4 {

    public void execute(Scanner scanner) {
        System.out.println("Задание 4");

        String fileName = "heights.txt";
        StringBuilder sb = new StringBuilder();

        // --- 1. Ввод 14 значений роста с клавиатуры ---
        System.out.println("Введите 14 вещественных значений роста учеников:");
        for (int i = 0; i < 14; i++) {
            double val;

            while (true) {
                System.out.print("Рост " + (i + 1) + ": ");

                while (!scanner.hasNextDouble()) {
                    System.out.print("Ошибка. Введите вещественное число: ");
                    scanner.next();
                }

                val = scanner.nextDouble();
                if (val > 0) {
                    break;
                }

                System.out.println("Ошибка. Рост должен быть положительным числом.");
            }

            sb.append(val).append(" ");
        }

        // --- 2. Сохранение введенных данных в файл ---
        try (OutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = sb.toString().trim().getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        // --- 3. Чтение файла и расчет среднего роста ---
        try (InputStream fis = new FileInputStream(fileName)) {
            int size = fis.available();
            byte[] buf = new byte[size];
            fis.read(buf);

            String content = new String(buf, StandardCharsets.UTF_8).trim();
            String[] tokens = content.split("\\s+");

            double sum = 0;
            int count = 0;

            for (String token : tokens) {
                if (!token.isEmpty()) {
                    sum += Double.parseDouble(token.replace(',', '.'));
                    count++;
                }
            }

            double average = count > 0 ? sum / count : 0.0;

            System.out.println("\nСчитанные значения роста: " + content);
            System.out.printf("Средний рост: %.2f%n", average);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        System.out.println();
    }
}