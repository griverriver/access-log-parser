package ru.courses.courseproject;

import java.time.Duration;
import java.time.LocalDateTime;

public class Statistics {
    int totalTraffic;
    LocalDateTime minTime, maxTime;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = null;
        this.maxTime = null;
    }

    public void addEntry(LogEntry logEntry) {
        totalTraffic += logEntry.getDataSize();
        if (minTime == null || minTime.isAfter(logEntry.getDateTime())) {
            minTime = logEntry.getDateTime();
        }
        if (maxTime == null || maxTime.isBefore(logEntry.getDateTime())) {
            maxTime = logEntry.getDateTime();
        }
    }

    public double getTrafficRate() {
        return totalTraffic / (Duration.between(minTime, maxTime).toMinutes() / 60.0);
    }
}