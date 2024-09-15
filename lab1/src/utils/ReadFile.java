package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  public static String readFile() {
    StringBuilder text = new StringBuilder();
    BufferedReader reader = null;

    try {
      reader = new BufferedReader(new FileReader("./src/input.txt"));
      String line;

      while ((line = reader.readLine()) != null) {
        text.append(line).append("\n");
      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          System.err.println("Error closing file reader: " + e.getMessage());
        }
      }
    }

    return text.toString();
  }

  public static boolean isValidText(String text) {
    return text != null && !text.trim().isEmpty();
  }
}
