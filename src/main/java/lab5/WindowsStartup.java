package main.java.lab5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WindowsStartup implements AutoStartup {

    private static final String FILE_NAME = "helloWorld.bat";
    private static final String BATCHFILE_FULL_PATH = System.getProperty("user.home") + "\\" + FILE_NAME;
    private static final String SHUTDOWN_COMMAND = "shutdown -r -t 0";
    private static final String REGISTER_ADDRESS = "HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\Run";

    @Override
    public void run() {
        try {
            createBatchFile();
            addFileToRegisterStartup();
            restartComputer();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createBatchFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BATCHFILE_FULL_PATH))) {
            writer.write("@echo off");
            writer.newLine();
            writer.write("echo Hello World");
            writer.newLine();
            writer.write("pause");
        }

        System.out.println("Fișierul batch a fost creat la: " + BATCHFILE_FULL_PATH);
    }

    private static void addFileToRegisterStartup() throws IOException, InterruptedException {
        String addToRegisterCommand = "reg add %s /v HelloWorldApp /t REG_SZ /d \"%s\" /f"
                .formatted(REGISTER_ADDRESS, BATCHFILE_FULL_PATH);

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