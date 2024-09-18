package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharParameterExtractor implements ParameterExtractor {
  @Override
  public String extract(String text, String parameter) {
    String normalizedText = text.toLowerCase();
    String normalizedParam = parameter.toLowerCase();

    Pattern pattern = Pattern.compile(Pattern.quote(normalizedParam));
    Matcher matcher = pattern.matcher(normalizedText);

    StringBuilder extractedChars = new StringBuilder();

    while (matcher.find()) {
      extractedChars.append(matcher.group()).append(" ");
    }

    return extractedChars.toString().trim();
  }

  @Override
  public int count(String text, String parameter) {
    String normalizedText = text.toLowerCase();
    String normalizedParam = parameter.toLowerCase();

    Pattern pattern = Pattern.compile(Pattern.quote(normalizedParam));
    Matcher matcher = pattern.matcher(normalizedText);

    int count = 0;

    while (matcher.find()) {
      count++;
    }

    return count;
  }
}