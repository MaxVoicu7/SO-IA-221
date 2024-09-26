package lab1;

import java.util.regex.Pattern;

/**
 * @author Alex
 * */
public interface TextExtractor {

    /**
     * The pattern that should be overridden by each implementation
     * */
    Pattern pattern = null;

    /**
     * Extracts text from a given input string using the specified pattern.
     *
     * @param text The input string to be extracted from.
     * @return The extracted text, or empty string if no match is found.
     */
    String extract(String text);

    default String getPattern() {
        return pattern == null ? "" : pattern.pattern();
    };

}
