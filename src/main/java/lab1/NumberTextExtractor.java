package main.java.lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alex
 * */
public class NumberTextExtractor implements TextExtractor {

    private final Pattern pattern = Pattern.compile("[1-9]+");

    @Override
    public String extract(String text) {
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group() : "";
    }

    public Pattern getPattern() {
        return pattern;
    }
}
