package utils;

import lab1.*;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

  private final Scanner scanner;
  private String text = null;

  String result;
  int count;
  String parameter;

  NumberBasicExtractor nrBasicExtractor = new NumberBasicExtractor();
  NumberParameterExtractor nrParameterExtractor = new NumberParameterExtractor();
  SpecialCharBasicExtractor specialCharBasicExtractor = new SpecialCharBasicExtractor();
  SpecialCharParameterExtractor specialCharParameterExtractor = new SpecialCharParameterExtractor();
  CharParameterExtractor charParameterExtractor = new CharParameterExtractor();
  WordParameterExtractor wordParameterExtractor = new WordParameterExtractor();

  public Menu() {
    this.scanner = new Scanner(System.in);
  }

  public void display() {
    int choice;
    do {
      System.out.println("Menu");
      System.out.println("1. Read text from file");
      System.out.println("2. Display text");
      System.out.println("3. Extract numbers from text");
      System.out.println("4. Count numbers from text");
      System.out.println("5. Extract specific number from text");
      System.out.println("6. Count specific number from text");
      System.out.println("7. Extract special characters from text");
      System.out.println("8. Count special characters from text");
      System.out.println("9. Extract specific special character from text");
      System.out.println("10. Count specific special character from text");
      System.out.println("11. Extract specific character from text");
      System.out.println("12. Count specific character from text");
      System.out.println("13. Extract word from text");
      System.out.println("14. Count word from text");
      System.out.println("15. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      handleChoice(choice);
    } while (choice != 15);
  }

  private void handleChoice(int choice) {
    switch (choice) {
      case 1:
        System.out.println("\nReading text from input.txt\n");

        text = ReadFile.readFile();

        if (ReadFile.isValidText(text)) {
          System.out.println("Text read successful\n");
        } else {
          text = null;
          System.out.println("Invalid text\n");
        }

        break;

      case 2:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
        } else {
          System.out.println("\nText from input.txt:\n");
          System.out.println(text);
        }

        break;

      case 3:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nExtracting all numbers from text\n");

        result = nrBasicExtractor.extract(text);

        if (Objects.equals(result, "")) {
          System.out.println("No numbers found\n");
        } else {
          System.out.println("Numbers found: " + result + "\n");
        }

        result = null;

        break;

      case 4:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nCounting all numbers from text\n");

        count = nrBasicExtractor.count(text);

        if (count == 0) {
          System.out.println("No numbers found\n");
        } else {
          System.out.println("Numbers found: " + count+ "\n");
        }

        count = 0;

        break;

      case 5:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nExtracting a specific number from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the specific number to extract (digits only): ");
          parameter = scanner.nextLine();

          if (!parameter.matches("\\d+")) {
            System.out.println("Invalid input. Please enter digits only.");
          }

        } while (!parameter.matches("\\d+"));

        result = nrParameterExtractor.extract(text, parameter);

        if (Objects.equals(result, "")) {
          System.out.println("No occurrences of the number '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the number '" + parameter + "' found: " + result + "\n");
        }

        result = null;
        parameter = null;

        break;

      case 6:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nCounting a specific number from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the specific number to extract (digits only): ");
          parameter = scanner.nextLine();

          if (!parameter.matches("\\d+")) {
            System.out.println("Invalid input. Please enter digits only.");
          }

        } while (!parameter.matches("\\d+"));

        count = nrParameterExtractor.count(text, parameter);

        if (count == 0) {
          System.out.println("No occurrences of the number '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the number '" + parameter + "' found: " + count + "\n");
        }

        count = 0;
        parameter = null;

        break;

      case 7:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nExtracting all special characters from text\n");

        result = specialCharBasicExtractor.extract(text);

        if (Objects.equals(result, "")) {
          System.out.println("No special characters found\n");
        } else {
          System.out.println("Special characters found: " + result + "\n");
        }

        result = null;

        break;

      case 8:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nCounting all special characters from text\n");

        count = specialCharBasicExtractor.count(text);

        if (count == 0) {
          System.out.println("No special characters found\n");
        } else {
          System.out.println("Special characters found: " + count+ "\n");
        }

        count = 0;

        break;

      case 9:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nExtracting a specific special character from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the specific special character to extract: ");
          parameter = scanner.nextLine();

          if (!parameter.matches("[^a-zA-Z0-9\\s]") || parameter.length() != 1) {
            System.out.println("Invalid input. Please enter exactly one special character.");
          }

        } while (!parameter.matches("[^a-zA-Z0-9\\s]") || parameter.length() != 1);

        result = specialCharParameterExtractor.extract(text, parameter);

        if (Objects.equals(result, "")) {
          System.out.println("No occurrences of the special character '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the special character '" + parameter + "' found: " + result + "\n");
        }

        result = null;
        parameter = null;

        break;

      case 10:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nCounting a specific special character from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the specific special character to count: ");
          parameter = scanner.nextLine();

          if (!parameter.matches("[^a-zA-Z0-9\\s]") || parameter.length() != 1) {
            System.out.println("Invalid input. Please enter exactly one special character.");
          }

        } while (!parameter.matches("[^a-zA-Z0-9\\s]") || parameter.length() != 1);

        count = specialCharParameterExtractor.count(text, parameter);

        if (count == 0) {
          System.out.println("No occurrences of the special character '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the special character '" + parameter + "' found: " + count + "\n");
        }

        count = 0;
        parameter = null;

        break;

      case 11:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nExtracting a specific character from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the specific character to extract: ");
          parameter = scanner.nextLine();

          if (!parameter.matches("[a-zA-Z\\s]") || parameter.length() != 1) {
            System.out.println("Invalid input. Please enter exactly one character.");
          }

        } while (!parameter.matches("[a-zA-Z\\s]") || parameter.length() != 1);

        result = charParameterExtractor.extract(text, parameter);

        if (Objects.equals(result, "")) {
          System.out.println("No occurrences of the character '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the character '" + parameter + "' found: " + result + "\n");
        }

        result = null;
        parameter = null;

        break;

      case 12:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nCounting a specific character from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the specific character to count: ");
          parameter = scanner.nextLine();

          if (!parameter.matches("[a-zA-Z\\s]") || parameter.length() != 1) {
            System.out.println("Invalid input. Please enter exactly one special character.");
          }

        } while (!parameter.matches("[a-zA-Z\\s]") || parameter.length() != 1);

        count = charParameterExtractor.count(text, parameter);

        if (count == 0) {
          System.out.println("No occurrences of the character '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the character '" + parameter + "' found: " + count + "\n");
        }

        count = 0;
        parameter = null;

        break;

      case 13:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nExtracting a word from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the word to extract: ");
          parameter = scanner.nextLine();

          if (!parameter.matches("[a-zA-Z]{2,20}")) {
            System.out.println("Invalid input. Please enter a word consisting only of letters, with length between 2 and 20.");
          }

        } while (!parameter.matches("[a-zA-Z]{2,20}"));

        result = wordParameterExtractor.extract(text, parameter);

        if (Objects.equals(result, "")) {
          System.out.println("No occurrences of the word '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the word '" + parameter + "' found: " + result + "\n");
        }

        result = null;
        parameter = null;

        break;

      case 14:
        if (text == null) {
          System.out.println("\nNo text read from input.txt\n");
          break;
        }

        System.out.println("\nCounting a word from text\n");

        if (scanner.hasNextLine()) {
          scanner.nextLine();
        }

        do {
          System.out.print("Enter the word to extract: ");
          parameter = scanner.nextLine();

          if (!parameter.matches("[a-zA-Z]{2,20}")) {
            System.out.println("Invalid input. Please enter a word consisting only of letters, with length between 2 and 20.");
          }

        } while (!parameter.matches("[a-zA-Z]{2,20}"));

        count = wordParameterExtractor.count(text, parameter);

        if (count == 0) {
          System.out.println("No occurrences of the word '" + parameter + "' found\n");
        } else {
          System.out.println("Occurrences of the word '" + parameter + "' found: " + count + "\n");
        }

        count = 0;
        parameter = null;

        break;
      case 15:
        System.out.println("\nThanks for using our program\n");
        break;

      default:
        System.out.println("\nInvalid choice. Please try again!\n");
        break;
    }
  }
}
