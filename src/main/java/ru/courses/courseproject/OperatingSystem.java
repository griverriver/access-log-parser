package ru.courses.courseproject;

public enum OperatingSystem {
    WINDOWS("Windows NT"), MACOS("Macintosh", "Mac OS X"), LINUX("Linux"), UNKNOWN("");
    final String[] s;
    OperatingSystem(String... s) {
        this.s = s;
    }
}