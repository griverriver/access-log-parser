package ru.courses.courseproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogEntry {
    private final String ip;
    private final String feature;
    private final LocalDateTime dateTime;
    private final RequestMethod requestMethod;
    private final String requestPath;
    private final int responseCode;
    private final int dataSize;
    private final String referer;
    private final UserAgent userAgent;

    public String getIp() {
        return ip;
    }

    public String getFeature() {
        return feature;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public int getDataSize() {
        return dataSize;
    }

    public String getReferer() {
        return referer;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public LogEntry(String str) {
        Pattern patternIP = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher matcherIP = patternIP.matcher(str);
        Pattern patternFeature = Pattern.compile("-\\s-");
        Matcher matcherFeature = patternFeature.matcher(str);
        Pattern patternFeature2 = Pattern.compile("\"\"\\s\"\"");
        Matcher matcherFeature2 = patternFeature2.matcher(str);
        Pattern patternDateTime = Pattern.compile("\\[(.+?)\\s");
        Matcher matcherDateTime = patternDateTime.matcher(str);
        Pattern patternRequestMethod = Pattern.compile("\"(\\w+?)\\s");
        Matcher matcherRequestMethod = patternRequestMethod.matcher(str);
        Pattern patternRequestPath = Pattern.compile("\"(GET|POST|PUT|PATCH|DELETE|HEAD|CONNECT|OPTIONS|TRACE)\\s(/\\S+)\\sHTTP/");
        Matcher matcherRequestPath = patternRequestPath.matcher(str);
        Pattern patternStatus = Pattern.compile("\".+?\"\\s(\\d{3})");
        Matcher matcherStatus = patternStatus.matcher(str);
        Pattern patternDataSize = Pattern.compile("\".+?\"\\s\\d{3}\\s(\\d+)");
        Matcher matcherDataSize = patternDataSize.matcher(str);
        Pattern patternReferer = Pattern.compile("\".+?\"\\s\\d{3}\\s\\d+\\s(\".+?\")");
        Matcher matcherReferer = patternReferer.matcher(str);
        Pattern patternUserAgent = Pattern.compile("\"([^\"]+)\"$");
        Matcher matcherUserAgent = patternUserAgent.matcher(str);

        if (matcherIP.find()) {
            this.ip = matcherIP.group();
        }else this.ip = null;

        if (matcherFeature.find()) {
            this.feature = matcherFeature.group();
        } else if (matcherFeature2.find()) {
            this.feature = matcherFeature2.group();
        }else this.feature = null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH);
        if (matcherDateTime.find()) {
            this.dateTime = LocalDateTime.parse(matcherDateTime.group(1), formatter);
        }else this.dateTime = null;

        if (matcherRequestMethod.find()) {
            this.requestMethod = RequestMethod.valueOf(matcherRequestMethod.group(1));
        }else this.requestMethod = null;

        if (matcherRequestPath.find()) {
            this.requestPath = matcherRequestPath.group(2);
        }else this.requestPath = null;

        if (matcherStatus.find()) {
            this.responseCode = Integer.parseInt(matcherStatus.group(1));
        }else this.responseCode = 0;

        if (matcherDataSize.find()) {
            this.dataSize = Integer.parseInt(matcherDataSize.group(1));
        }else this.dataSize = 0;

        if (matcherReferer.find()) {
            this.referer = matcherReferer.group(1);
        }else this.referer = null;

        if (matcherUserAgent.find()) {
            this.userAgent = new UserAgent(matcherUserAgent.group(1));
        }else this.userAgent = null;
    }

    @Override
    public String toString() {
        return "";
    }
}