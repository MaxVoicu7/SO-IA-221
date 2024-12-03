package main.java.lab5;

import java.io.IOException;

public class AutoStartupApp {

    private static final String USER_OPERATING_SYSTEM = System.getProperty("os.name").toUpperCase();
    private static final String WINDOWS_OS = "WINDOWS";
    private static final String LINUX_OS = "LINUX";

    public static void main(String[] args) throws IOException, InterruptedException {
        AutoStartup autoStartup;

        if (USER_OPERATING_SYSTEM.contains(WINDOWS_OS)) {
            autoStartup = new WindowsStartup();
        } else if (USER_OPERATING_SYSTEM.contains(LINUX_OS)) {
            autoStartup = new LinuxStartup();
        } else {
            throw new UnsupportedOperationException("Nu se potriveste astfel de sistem de operare: " + USER_OPERATING_SYSTEM);
        }

        autoStartup.run();
    }

}
