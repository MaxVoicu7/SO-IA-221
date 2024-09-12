public class TextOperations {
    public static String mirrorText(String input) {
        // Întoarcem textul în oglindă
        return new StringBuilder(input).reverse().toString();
    }

    public static String[] separateWords(String input) {
        // Separam cuvintele din text
        return input.split("\\s+");
    }
}