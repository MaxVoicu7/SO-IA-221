package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alex
 * */
public class WordsTextExtractor implements TextExtractor {

    /* Pattern matches one or more word characters */
    private final Pattern pattern = Pattern.compile("\\w+");

    @Override
    public String extract(String text) {
        StringBuilder allWords = new StringBuilder();
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            allWords.append(matcher.group()).append(", ");
        }

        return allWords.toString().trim();
    }

    @Override
    public String getPattern() {
        return pattern.pattern();
    }
}