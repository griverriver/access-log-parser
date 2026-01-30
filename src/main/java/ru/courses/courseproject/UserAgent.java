package ru.courses.courseproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAgent {
    private final OperatingSystem operatingSystem;
    private final String browser;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public String getBrowser() {
        return browser;
    }

    public UserAgent(String strUserAgent) {
        Pattern patternBrowser = Pattern.compile("(\\w+)/");
        Matcher matcherBrowser = patternBrowser.matcher(strUserAgent);

        if (matcherBrowser.find()) {
            this.browser = matcherBrowser.group(1);
        }else this.browser = null;

        if (strUserAgent.contains(OperatingSystem.MACOS.s[0]) || strUserAgent.contains(OperatingSystem.MACOS.s[1])) {
            this.operatingSystem = OperatingSystem.MACOS;
        } else if (strUserAgent.contains(OperatingSystem.LINUX.s[0])) {
            this.operatingSystem = OperatingSystem.LINUX;
        } else if (strUserAgent.contains(OperatingSystem.WINDOWS.s[0])) {
            this.operatingSystem = OperatingSystem.WINDOWS;
        }else this.operatingSystem = OperatingSystem.UNKNOWN;
    }
}