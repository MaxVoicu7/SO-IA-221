package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharBasicExtractor implements BasicExtractor {
  @Override
  public String extract(String text) {
    Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]+");
    Matcher matcher = pattern.matcher(text);

    StringBuilder specialChars = new StringBuilder();

    while (matcher.find()) {
      specialChars.append(matcher.group()).append(" ");
    }

    return specialChars.toString().trim();
  }

  @Override
  public int count(String text) {
    Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]+");
    Matcher matcher = pattern.matcher(text);

    int count = 0;

    while (matcher.find()) {
      count++;
    }

    return count;
  }
}