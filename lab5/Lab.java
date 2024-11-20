import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        String desktopPath;
        String os = System.getProperty("os.name").toLowerCase();

        try {
            if (os.contains("windows")) {
                String userHome = System.getProperty("user.home");
                desktopPath = userHome + "\\OneDrive\\Desktop\\so.txt";
                File desktop = new File(userHome + "\\OneDrive\\Desktop");

                if (!desktop.exists() || !desktop.isDirectory()) {
                    desktop = new File(userHome + "\\Desktop");
                    desktopPath = userHome + "\\Desktop\\so.txt";
                }
                if (!desktop.exists() || !desktop.isDirectory()) {
                    throw new IOException("Desktop not found!");
                }
            } else {
                desktopPath = System.getProperty("user.home") +
                        File.separator + "Desktop" +
                        File.separator + "so.txt";
                File desktop = new File(System.getProperty("user.home") + File.separator + "Desktop");
                if (!desktop.exists() || !desktop.isDirectory()) {
                    throw new IOException("Desktop not found!");
                }
            }

            FileWriter writer = new FileWriter(desktopPath, true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println("Choose operation: ");
            System.out.println("1. Restart");
            System.out.println("2. Shutdown");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            ProcessBuilder processBuilder;
            String logMessage;

            if (os.contains("windows")) {
                if (choice == 1) {
                    processBuilder = new ProcessBuilder("shutdown", "/r", "/t", "60");
                    logMessage = "Restart: " + now.format(formatter) + "\n";
                } else {
                    processBuilder = new ProcessBuilder("shutdown", "/s", "/t", "60");
                    logMessage = "Shutdown: " + now.format(formatter) + "\n";
                }
            } else {
                if (choice == 1) {
                    processBuilder = new ProcessBuilder("shutdown", "-r", "+1");
                    logMessage = "Restart: " + now.format(formatter) + "\n";
                } else {
                    processBuilder = new ProcessBuilder("shutdown", "-h", "+1");
                    logMessage = "Shutdown: " + now.format(formatter) + "\n";
                }
            }

            writer.write(logMessage);
            writer.close();

            processBuilder.inheritIO();
            Process process = processBuilder.start();

            System.out.println("Wait 1 minute...");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
