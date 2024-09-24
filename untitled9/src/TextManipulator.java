import java.util.Scanner;

public class TextManipulator {

    public static String removeSpacesAndNewLines(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți textul:");
        String inputText = scanner.nextLine();

        String result = removeSpacesAndNewLines(inputText);
        System.out.println("Textul după eliminarea spațiilor și liniilor noi: " + result);

        TextOperation textMirror = new TextMirror(inputText);
        TextOperation textSeparator = new TextSeparator(inputText);

        textMirror.execute();
        textSeparator.execute();

        scanner.close();
    }
}