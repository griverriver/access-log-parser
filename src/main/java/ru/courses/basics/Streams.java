package ru.courses.basics;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
}