package ru.courses.courseproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {
    public static void FileReaderMethod() {
        //2d version
        /*int count = 0;
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
        System.out.println(("Длина самой короткой строки в файле " + minLineLength));*/

        //_____________________________________________________________________________________________________
        //3d version
        /*int count = 0;
        int countGoogle = 0;
        int countYandex = 0;
        String strIP = "";
        String strFeature = "";
        String strDateTime = "";
        String strRequest = "";
        String strStatus = "";
        String strDataSize = "";
        String strReferer = "";
        String strUserAgent = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String path = scanner.nextLine();
        try {
            java.io.FileReader fileReader = new java.io.FileReader(path);
            BufferedReader reader =
                    new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() > 1024) {
                    throw new InvalidLineLengthException();
                }
                Pattern patternIP = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
                Matcher matcherIP = patternIP.matcher(line);
                Pattern patternFeature = Pattern.compile("-\\s-");
                Matcher matcherFeature = patternFeature.matcher(line);
                Pattern patternFeature2 = Pattern.compile("\"\"\\s\"\"");
                Matcher matcherFeature2 = patternFeature2.matcher(line);
                Pattern patternDateTime = Pattern.compile("\\[.+]");
                Matcher matcherDateTime = patternDateTime.matcher(line);
                Pattern patternRequest = Pattern.compile("\".+?\"");
                Matcher matcherRequest = patternRequest.matcher(line);
                Pattern patternStatus = Pattern.compile("\".+?\"\\s(\\d{3})");
                Matcher matcherStatus = patternStatus.matcher(line);
                Pattern patternDataSize = Pattern.compile("\".+?\"\\s\\d{3}\\s(\\d+)");
                Matcher matcherDataSize = patternDataSize.matcher(line);
                Pattern patternReferer  = Pattern.compile("\".+?\"\\s\\d{3}\\s\\d+\\s(\".+?\")");
                Matcher matcherReferer = patternReferer.matcher(line);
                Pattern patternUserAgent  = Pattern.compile("\"([^\"]+)\"$");
                Matcher matcherUserAgent = patternUserAgent.matcher(line);

                if (matcherIP.find()) {
                    strIP = matcherIP.group();
                }
                if (matcherFeature.find()) {
                    strFeature = matcherFeature.group();
                } else if (matcherFeature2.find()) {
                    strFeature = matcherFeature2.group();
                }
                if (matcherDateTime.find()) {
                    strDateTime = matcherDateTime.group();
                }
                if (matcherRequest.find()) {
                    strRequest = matcherRequest.group();
                }
                if (matcherStatus.find()) {
                    strStatus = matcherStatus.group(1);
                }
                if (matcherDataSize.find()) {
                    strDataSize = matcherDataSize.group(1);
                }
                if (matcherReferer.find()) {
                    strReferer = matcherReferer.group(1);
                }
                if (matcherUserAgent.find()) {
                    strUserAgent = matcherUserAgent.group(1);
                    Pattern patternFirstBrackets  = Pattern.compile("\\(.+?\\)");
                    Matcher matcherFirstBrackets = patternFirstBrackets.matcher(strUserAgent);
                    if (matcherFirstBrackets.find()) {
                        String strSecondFragment = "";
                        String firstBrackets = matcherFirstBrackets.group();
                        String[] parts = firstBrackets.split(";");
                        for (int i = 0; i < parts.length; i++) {
                            parts[i] = parts[i].trim();
                        }
                        if (parts.length >= 2) {
                            String fragment = parts[1];
                            Pattern patternSecondFragment  = Pattern.compile("(\\D+)/");
                            Matcher matcherSecondFragment = patternSecondFragment.matcher(fragment);
                            if (matcherSecondFragment.find()) {
                                strSecondFragment = matcherSecondFragment.group(1);
                            }
                            if (Objects.equals(strSecondFragment, "Googlebot")) {
                                countGoogle++;
                            } else if (Objects.equals(strSecondFragment, "YandexBot")) {
                                countYandex++;
                            }
                        }
                    }
                }
                count++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Общее количество строк в файле: " + count);
        System.out.println(strIP);
        System.out.println(strFeature);
        System.out.println(strDateTime);
        System.out.println(strRequest);
        System.out.println(strStatus);
        System.out.println(strDataSize);
        System.out.println(strReferer);
        System.out.println(strUserAgent);
        System.out.println("Доля запросов от YandexBot: " + ((double)countYandex/count));
        System.out.println("Доля запросов от Googlebot: " + ((double)countGoogle/count));
    }*/

        //_____________________________________________________________________________________________________
        //4th version
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String path = scanner.nextLine();

        try {
            java.io.FileReader fileReader = new java.io.FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            Statistics statistics = new Statistics();
            while ((reader.readLine()) != null) {
                LogEntry logEntry = new LogEntry(reader.readLine());
                statistics.addEntry(logEntry);
            }
            //System.out.println("getTrafficRate = " + statistics.getTrafficRate());
            //System.out.println("getAllAddresses = " + statistics.getAllAddresses());
            //System.out.println("getFrequencyOS = "+ statistics.getFrequencyOS());
            //System.out.println("getBrowserStatistic = " + statistics.getBrowserStatistic());
            System.out.println("siteVisitsPerHour = " + statistics.siteVisitsPerHour());
            System.out.println("wrongRequestPerHour = " + statistics.wrongRequestPerHour());
            System.out.println("averageVisitsPerUser = " + statistics.averageVisitsPerUser());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}