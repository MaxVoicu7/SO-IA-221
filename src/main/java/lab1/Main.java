package lab1;

public class Main {

    private static final NumberTextExtractor numExtractor = new NumberTextExtractor();
    private static final WordsTextExtractor wordsExtractor = new WordsTextExtractor();
    private static final SpecialCharacterExtractor specialExtractor = new SpecialCharacterExtractor();

    private static final ConsoaneStartEndExtractor consoaneExtractor = new ConsoaneStartEndExtractor();

    public static void main(String[] args) {
        printResults(numExtractor, "ask2385msdAB93Md3");
        printResults(numExtractor, "3 guys 1 hammer");
        printResults(wordsExtractor, "There once was a ship that put to sea The name of the ship was the Billy O' Tea");
        printResults(specialExtractor, "As#t3Z! prezint ()proiectul 2!");
        printResults(consoaneExtractor, "ANA are mere, mere n-are rahat lucum, eu am cumparat din america");
    }

    private static void printResults(TextExtractor extractor, String text) {
        System.out.printf("""
                        Text={'%s'}
                          Pattern{'%s'}
                          Extracted={'%s'}
                        %s
                        """,
                text, extractor.getPattern(), extractor.extract(text), "-".repeat(100));
    }

}
