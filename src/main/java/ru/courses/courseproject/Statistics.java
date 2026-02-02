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
    private HashSet<String> nonExistentAddress;
    private HashMap<String, Integer> frequencyBrowser;

    public Statistics() {
        this.totalTraffic = 0;
        this.minTime = null;
        this.maxTime = null;
        this.address = new HashSet<>();
        this.frequencyOS = new HashMap<>();
        this.nonExistentAddress = new HashSet<>();
        this.frequencyBrowser = new HashMap<>();
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
        if ((logEntry.getResponseCode() == 404)&&!(logEntry.getRequestPath() == null)) {
            nonExistentAddress.add(logEntry.getRequestPath());
        }
        OperatingSystem operatingSystem = logEntry.getUserAgent().getOperatingSystem();
        if (!frequencyOS.containsKey(operatingSystem)) {
            frequencyOS.put(operatingSystem, 1);
        }else frequencyOS.put(operatingSystem, frequencyOS.get(operatingSystem) + 1);

        String browser = logEntry.getUserAgent().getBrowser();
        if (!frequencyBrowser.containsKey(browser)) {
            frequencyBrowser.put(browser, 1);
        }else frequencyBrowser.put(browser, frequencyBrowser.get(browser) + 1);
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

    public HashMap<String, Double> getBrowserStatistic(){
        HashMap<String, Double> statisticFreqBrowser = new HashMap<>();
        int countBrowser = 0;
        for (Integer value : frequencyBrowser.values()) {
            countBrowser+=value;

        }
        for (Map.Entry<String, Integer> entry: frequencyBrowser.entrySet()) {
            statisticFreqBrowser.put(entry.getKey(), (entry.getValue())/(double)countBrowser);
        }
        return statisticFreqBrowser;
    }
}