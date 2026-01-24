package ru.courses.courseproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public static void FileReaderMethod() {
        int count = 0;
        int maxLineLength = 0;
        int minLineLength = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String path = scanner.nextLine();
        try {
            java.io.FileReader fileReader = new java.io.FileReader(path);
            BufferedReader reader =
                    new BufferedReader(fileReader);
            String line;
            maxLineLength = reader.readLine().length();
            minLineLength = reader.readLine().length();
            while ((line = reader.readLine()) != null) {
                if (line.length() > 1024) {
                    throw new InvalidLineLengthException();
                }
                if (line.length() < minLineLength) {
                    minLineLength = line.length();
                } else if (line.length() > maxLineLength) {
                    maxLineLength = line.length();
                }
                count++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Общее количество строк в файле: " + count);
        System.out.println("Длина самой длинной строки в файле: " + maxLineLength);
        System.out.println(("Длина самой короткой строки в файле " + minLineLength));
    }
}