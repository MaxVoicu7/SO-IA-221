package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharParameterExtractor implements ParameterExtractor {
  @Override
  public String extract(String text, String parameter) {
    Pattern pattern = Pattern.compile(Pattern.quote(parameter));
    Matcher matcher = pattern.matcher(text);

    StringBuilder extractedSpecialChars = new StringBuilder();

    while (matcher.find()) {
      extractedSpecialChars.append(matcher.group()).append(" ");
    }

    return extractedSpecialChars.toString().trim();
  }

  @Override
  public int count(String text, String parameter) {
    Pattern pattern = Pattern.compile(Pattern.quote(parameter));
    Matcher matcher = pattern.matcher(text);

    int count = 0;

    while (matcher.find()) {
      count++;
    }

    return count;
  }
}
