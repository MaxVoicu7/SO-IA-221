import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lab {
    public static void main(String[] args) {
        String desktopPath;
        String os = System.getProperty("os.name").toLowerCase();
        
        try {

                desktopPath = System.getProperty("user.home") + 
                    File.separator + "Desktop" + 
                    File.separator + "so.txt";
                
                File desktop = new File(System.getProperty("user.home") + File.separator + "Desktop");
                if (!desktop.exists() || !desktop.isDirectory()) {
                    throw new IOException("Desktop not found!");
                }
            

            FileWriter writer = new FileWriter(desktopPath, true);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            
            System.out.println("Choose operation: ");
            System.out.println("1. Restart");
            System.out.println("2. Shutdown");
            
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            
            ProcessBuilder processBuilder;
            String logMessage;

                if (choice == 1) {
                    processBuilder = new ProcessBuilder("shutdown", "-r", "+1");
                    logMessage = "restart: " + now.format(formatter) + "\n";
                } else {
                    processBuilder = new ProcessBuilder("shutdown", "-h", "+1");
                    logMessage = "shutdown: " + now.format(formatter) + "\n";
                }
            
            
            writer.write(logMessage);
            writer.close();
            
            processBuilder.inheritIO();
            Process process = processBuilder.start();
            
            System.out.println("wait 1 minute...");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

