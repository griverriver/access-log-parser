package ru.courses.objects.animals;

import java.util.Arrays;

public class DataReset {
    public static void dataReset(Object obj) {
        Arrays.stream(obj.getClass().getDeclaredFields())
                .filter(entry -> !entry.getType().isPrimitive())
                .forEach(entry -> {
                    entry.setAccessible(true);
                    try {
                        entry.set(obj, null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }
}
