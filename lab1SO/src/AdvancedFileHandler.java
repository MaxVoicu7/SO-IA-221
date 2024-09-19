import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
class AdvancedFileHandler extends FileHandler {

    public AdvancedFileHandler(String filePath) {
        super(filePath);
    }

    // Metodă pentru a șterge tot conținutul fișierului
    public void clearFileContent() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(""); // Scriem un string gol pentru a șterge tot conținutul
            System.out.println("File content cleared.");
        } catch (IOException e) {
            System.out.println("Error clearing file: " + e.getMessage());
        }
    }

    // Metodă pentru a înlocui un cuvânt specific în fișier
    public void replaceWordInFile(String oldWord, String newWord) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            content = content.replaceAll(oldWord, newWord);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(content);
                System.out.println("Word replaced in file.");
            }
        } catch (IOException e) {
            System.out.println("Error replacing word in file: " + e.getMessage());
        }
    }
}