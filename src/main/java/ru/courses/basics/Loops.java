package ru.courses.basics;

import java.io.File;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*System.out.println(listNums(8));
        System.out.println(reverseListNums(5));
        System.out.println(chet(8));
        System.out.println(pow(2, 5));
        System.out.println(numLen(53942));
        System.out.println(equalNum(5555));
        square(4);
        leftTriangle(4);
        rightTriangle(5);
        guessGame();*/
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу");
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указанный путь является путём к папке");
                continue;
            }
            System.out.println("Путь указан верно");
            count++;
            System.out.println("Это файл номер "+count);
        }
    }

    /*public static String listNums(int x){
        String strListNums = "";
        for (int i = 0; i <= x; i++) {
            strListNums += i + " ";
        }
        return strListNums;
    }

    public static String reverseListNums(int x){
        String strReverseListNums = "";
        for (int i = x; i >= 0 ; i--) {
            strReverseListNums += i + " ";
        }
        return strReverseListNums;
    }

    public static String chet(int x) {
        String strChet = "";
        for (int i = 0; i <= x; i += 2) {
            strChet += i + " ";
        }
        return strChet;
    }

    public static int pow(int x, int y) {
        int finPow = 1;
        for (int i = 1; i <= y; i++) {
            finPow = finPow * x;
        }
        return finPow;
    }

    public static int numLen(long x) {
        int i;
        for (i = 0; x != 0; i++) {
            x = x / 10;
        }
        return i;
    }

    public static boolean equalNum(int x) {
        boolean boolEqualNum = true;
        while (boolEqualNum && x > 9) {
            boolEqualNum = x % 10 == (x / 10) % 10;
            x = x / 10;
        }
        return boolEqualNum;
    }

    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x){
        String strLeftTriangle = "*";
        for (int i = 0; i < x; i++) {
            System.out.println(strLeftTriangle);
            strLeftTriangle += "*";
        }
    }

    public static void rightTriangle(int x) {
        String strRightTriangle = "*";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(strRightTriangle);
            strRightTriangle += "*";
        }
    }

    public static void guessGame() {
        int randomNum = 3;
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            }
        } while (x != randomNum);
        System.out.println("Yes, it`s " + randomNum);
    }*/

}
