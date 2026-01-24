package ru.courses.courseproject;

public class InvalidLineLengthException extends RuntimeException{

    public InvalidLineLengthException() {
        super("Строка длиннее 1024 символов");
    }
}