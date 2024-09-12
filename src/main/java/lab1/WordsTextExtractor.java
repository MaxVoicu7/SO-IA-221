package main.java.lab1;

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
        Matcher matcher = pattern.matcher(text);
        return matcher.find() ? matcher.group() : "";
    }

    public Pattern getPattern() {
        return pattern;
    }

}
