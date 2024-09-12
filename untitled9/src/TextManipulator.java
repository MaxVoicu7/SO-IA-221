import java.util.Scanner;

public class TextManipulator {

    // Metodă pentru a șterge spațiile și liniile noi din text
    public static String removeSpacesAndNewLines(String input) {
        // Înlocuim toate spațiile albe și liniile noi (\s include și spațiile și tab-urile)
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        // Citim textul de la utilizator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți textul:");
        String inputText = scanner.nextLine();

        // Apelăm metoda care elimină spațiile și liniile noi
        String result = removeSpacesAndNewLines(inputText);

        // Afișăm rezultatul
        System.out.println("Textul după eliminarea spațiilor și liniilor noi: " + result);

        // Apelăm metoda care întoarce textul în oglindă
        String mirroredText = TextOperations.mirrorText(inputText);
        System.out.println("Textul în oglindă: " + mirroredText);

        // Apelăm metoda care separă cuvintele din text
        String[] separatedWords = TextOperations.separateWords(inputText);
        System.out.println("Cuvintele separate din text: " + String.join(", ", separatedWords));

        scanner.close();
    }
}