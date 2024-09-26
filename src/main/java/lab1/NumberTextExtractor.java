package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alex
 * */
public class NumberTextExtractor implements TextExtractor {

    private final Pattern pattern = Pattern.compile("[1-9]+");

    @Override
    public String extract(String text) {
        StringBuilder allNumbers = new StringBuilder();
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            allNumbers.append(matcher.group());
        }

        return allNumbers.toString().trim();
    }

    @Override
    public String getPattern() {
        return pattern.pattern();
    }
}
