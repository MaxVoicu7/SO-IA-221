package utils;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private String text = null;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Read text from file");
            System.out.println("2. Display text");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            handleChoice(choice);
        } while (choice != 4);
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
                System.out.println("\nOption 3 selected.\n");
                break;
            case 4:
                System.out.println("\nThanks for using our program :)\n");
                break;
            default:
                System.out.println("\nInvalid choice. Please try again!\n");
                break;
        }
    }
}
