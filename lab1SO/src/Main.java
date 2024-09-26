import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "example.txt";
        AdvancedFileHandler fileHandler = new AdvancedFileHandler(filePath);

        int option = 0;
        while (option != 8) {
            System.out.println("\n==== Meniu ====");
            System.out.println("1. Adaugă text în fișier");
            System.out.println("2. Citește conținutul fișierului");
            System.out.println("3. Înlocuiește un cuvânt în fișier");
            System.out.println("4. Șterge tot conținutul fișierului");
            System.out.println("5. Numără cuvintele din fișier");
            System.out.println("6. Verifică dacă un cuvânt există în fișier");
            System.out.println("7. Afișează prima linie din fișier");
            System.out.println("8. Ieșire");
            System.out.print("Selectează o opțiune: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Introduceți textul de adăugat: ");
                    String textToAdd = scanner.nextLine();
                    fileHandler.addTextToFile(textToAdd);
                    break;

                case 2:
                    fileHandler.readFileContent();
                    break;

                case 3:
                    System.out.print("Introduceți cuvântul de înlocuit: ");
                    String oldWord = scanner.nextLine();
                    System.out.print("Introduceți cuvântul nou: ");
                    String newWord = scanner.nextLine();
                    fileHandler.replaceWordInFile(oldWord, newWord);
                    break;

                case 4:
                    fileHandler.clearFileContent();
                    break;

                case 5:
                    System.out.println("Ieșire din aplicație.");
                    break;

                default:
                    System.out.println("Opțiune invalidă. Încearcă din nou.");
                    break;
            }
        }

        scanner.close();
    }
}