package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberBasicExtractor implements BasicExtractor {
  @Override
  public String extract(String text) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(text);

    StringBuilder numbers = new StringBuilder();

    while (matcher.find()) {
      numbers.append(matcher.group()).append(" ");
    }

    return numbers.toString().trim();
  }

  @Override
  public int count(String text) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(text);

    int count = 0;

    while (matcher.find()) {
      count++;
    }

    return count;
  }
}
