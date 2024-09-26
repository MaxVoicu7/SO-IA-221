package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Giku
 * */
class ConsoaneStartEndExtractor implements TextExtractor {


    private final Pattern pattern = Pattern.compile("\\b[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ][a-zA-Z]*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]\\b");

    @Override
    public String extract(String text) {
        StringBuilder consonantWords = new StringBuilder();
        Matcher matcher = pattern.matcher(text);

        // Găsim toate cuvintele care încep și se termină cu o consoană
        while (matcher.find()) {
            consonantWords.append(matcher.group()).append(" ");
        }

        return consonantWords.toString().trim();
    }

    @Override
    public String getPattern() {
        return pattern.pattern();
    }
}