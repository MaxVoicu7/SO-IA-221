package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParameterExtractor implements ParameterExtractor {
  @Override
  public String extract(String text, String parameter) {
    String normalizedText = text.toLowerCase();
    String normalizedParam = parameter.toLowerCase();

    Pattern pattern = Pattern.compile("\\b" + normalizedParam + "\\b");
    Matcher matcher = pattern.matcher(normalizedText);

    StringBuilder extractedWords = new StringBuilder();

    while (matcher.find()) {
      extractedWords.append(matcher.group()).append(" ");
    }

    return extractedWords.toString().trim();
  }

  @Override
  public int count(String text, String parameter) {
    String normalizedText = text.toLowerCase();
    String normalizedParam = parameter.toLowerCase();

    Pattern pattern = Pattern.compile("\\b" + normalizedParam + "\\b");
    Matcher matcher = pattern.matcher(normalizedText);

    int count = 0;

    while (matcher.find()) {
      count++;
    }

    return count;
  }
}