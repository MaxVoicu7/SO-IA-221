package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Giku
 * */
class SpecialCharacterExtractor implements TextExtractor {

    // Definim un pattern pentru caractere speciale
    private final Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]+");

    @Override
    public String extract(String text) {
        StringBuilder allSpecialCharacters = new StringBuilder();
        Matcher matcher = pattern.matcher(text);

        // Găsim toate caracterele speciale
        while (matcher.find()) {
            allSpecialCharacters.append(matcher.group());
        }

        return allSpecialCharacters.toString().trim();
    }

    @Override
    public String getPattern() {
        return pattern.pattern();
    }
}
