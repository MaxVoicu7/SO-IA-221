import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Lab {
	public static void main(String args[]) {
		try {
			FileWriter writer = new FileWriter("/home/voicu/Desktop/message.txt" , true);
			
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			
			System.out.println("Choose operation: ");
			System.out.println("\t1. Shutdown");
			System.out.println("\t2. Reboot");
			
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			int choice = scanner.nextInt();
		
			
			ProcessBuilder processBuilder;
			String logMessage;
			
			if (choice == 1) {
				processBuilder = new ProcessBuilder("shutdown", "-h", "+1");
				logMessage = "Shutdown at " + now.format(formatter) + "\n";
				
				writer.write(logMessage);
				writer.close();

				processBuilder.inheritIO();
				Process process = processBuilder.start();
				
				System.out.println("operation in 1 minute");
			} else if (choice == 2) {
				processBuilder = new ProcessBuilder("shutdown", "-r", "+1");
				logMessage = "Reboot at " + now.format(formatter) + "\n";
				
				writer.write(logMessage);
				writer.close();

				processBuilder.inheritIO();
				Process process = processBuilder.start();
				
				System.out.println("operation in 1 minute");
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
