package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberParameterExtractor implements ParameterExtractor {
  @Override
  public String extract(String text, String parameter) {
    Pattern pattern = Pattern.compile("\\b" + parameter + "\\b");
    Matcher matcher = pattern.matcher(text);

    StringBuilder extractedNumbers = new StringBuilder();

    while (matcher.find()) {
      extractedNumbers.append(matcher.group()).append(" ");
    }

    return extractedNumbers.toString().trim();
  }

  @Override
  public int count(String text, String parameter) {
    Pattern pattern = Pattern.compile("\\b" + parameter + "\\b");
    Matcher matcher = pattern.matcher(text);

    int count = 0;

    while (matcher.find()) {
      count++;
    }

    return count;
  }
}
