import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
class FileHandler {
    protected String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    // Metodă pentru a adăuga text într-un fișier
    public void addTextToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(text);
            writer.newLine();
            System.out.println("Text added to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Metodă pentru a citi conținutul unui fișier
    public void readFileContent() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}