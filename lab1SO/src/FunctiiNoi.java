import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
class FunctiiNoi extends FileHandler {
    public FunctiiNoi(String filePath) {
        super(filePath);
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
}