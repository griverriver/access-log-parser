package ru.courses.courseproject;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Statistics {
    private int totalTraffic;
    private LocalDateTime minTime, maxTime;
    private HashSet<String> address;
    private HashMap<OperatingSystem, Integer> frequencyOS;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = null;
        this.maxTime = null;
        this.address = new HashSet<>();
        this.frequencyOS = new HashMap<>();
    }

    public void addEntry(LogEntry logEntry) {
        totalTraffic += logEntry.getDataSize();
        if (minTime == null || minTime.isAfter(logEntry.getDateTime())) {
            minTime = logEntry.getDateTime();
        }
        if (maxTime == null || maxTime.isBefore(logEntry.getDateTime())) {
            maxTime = logEntry.getDateTime();
        }
        if ((logEntry.getResponseCode() == 200)&&!(logEntry.getRequestPath() == null)) {
            address.add(logEntry.getRequestPath());
        }
        OperatingSystem operatingSystem = logEntry.getUserAgent().getOperatingSystem();
        if (!frequencyOS.containsKey(operatingSystem)) {
            frequencyOS.put(operatingSystem, 1);
        }else frequencyOS.put(operatingSystem, frequencyOS.get(operatingSystem) + 1);
    }

    public HashSet<String> getAllAddresses(){
        return address;
    }

    public HashMap<OperatingSystem, Double> getFrequencyOS(){
        HashMap<OperatingSystem, Double> statisticFreqOS = new HashMap<>();
        int countOS = 0;
        for (Integer value : frequencyOS.values()) {
            countOS+=value;

        }
        for (Map.Entry<OperatingSystem, Integer> entry: frequencyOS.entrySet()) {
            statisticFreqOS.put(entry.getKey(), (entry.getValue())/(double)countOS);
        }
        return statisticFreqOS;
    }

    public double getTrafficRate() {
        return totalTraffic / (Duration.between(minTime, maxTime).toMinutes() / 60.0);
    }
}