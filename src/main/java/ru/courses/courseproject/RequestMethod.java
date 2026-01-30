package ru.courses.courseproject;

public enum RequestMethod {
    GET("GET"), POST("POST"), PUT("PUT"), PATCH("PATCH"), DELETE("DELETE"),
    HEAD("HEAD"), CONNECT("CONNECT"), OPTIONS("OPTIONS"), TRACE("TRACE");
    final String s;
    RequestMethod(String s) {
        this.s = s;
    }
}