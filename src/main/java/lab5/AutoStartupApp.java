package main.java.lab5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AutoStartupApp {

    private static final String FILE_NAME = "helloWorld.bat";
    private static final String SHUTDOWN_COMMAND = "shutdown -r -t 0";

    public static void main(String[] args) throws IOException, InterruptedException {
        createBatchFile();
        addAppToStartup();
        restartComputer();
    }

    private static void createBatchFile() throws IOException {
        String batchFilePath = System.getProperty("user.home") + "\\" + FILE_NAME;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(batchFilePath))) {
            writer.write("@echo off");
            writer.newLine();
            writer.write("echo Hello World");
            writer.newLine();
            writer.write("pause");
        }

        System.out.println("Fișierul batch a fost creat la: " + batchFilePath);
    }

    private static void addAppToStartup() throws IOException, InterruptedException {
        String batchFilePath = System.getProperty("user.home") + "\\" + FILE_NAME;

        String addToRegisterCommand = "reg add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run /v HelloWorldApp /t REG_SZ /d \"%s\" /f".formatted(batchFilePath);

        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", addToRegisterCommand);
        processBuilder.inheritIO();
        processBuilder.start().waitFor();

        System.out.println("Aplicația a fost adăugată la pornirea automată.");
    }

    private static void restartComputer() throws IOException, InterruptedException {
        System.out.println("Calculatorul se va reporni...");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }

        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", SHUTDOWN_COMMAND);
        processBuilder.inheritIO();
        processBuilder.start();
    }
}
