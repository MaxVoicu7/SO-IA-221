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

    // Noua metodă 1: Numără cuvintele din fișier
    public int countWordsInFile() {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Separa cuvintele pe baza spațiilor
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error counting words: " + e.getMessage());
        }
        System.out.println("Total words in file: " + wordCount);
        return wordCount;
    }

    // Noua metodă 2: Verifică dacă un cuvânt există în fișier
    public boolean isWordInFile(String word) {
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error searching for word: " + e.getMessage());
        }
        System.out.println("Word " + word + " found: " + found);
        return found;
    }

    // Noua metodă 3: Extragerea primei linii din fișier
    public String getFirstLineFromFile() {
        String firstLine = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            firstLine = reader.readLine(); // Citim prima linie
        } catch (IOException e) {
            System.out.println("Error reading first line: " + e.getMessage());
        }
        System.out.println("First line: " + firstLine);
        return firstLine;
    }
}