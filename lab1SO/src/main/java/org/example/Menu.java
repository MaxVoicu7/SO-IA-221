package org.example;

import java.util.Scanner;

/**
 * In this class I implemented a simple menu with the choice of arithmetic operations
 *
 * @author TaneaT
 */
public class Menu {
  Scanner scanner = new Scanner(System.in);
  private double firstNumber;
  private double secondNumber;

  public void initializeNumbers() {
    System.out.println("Introduce first number: ");
    firstNumber = scanner.nextDouble();
    System.out.println("Introduce second number: ");
    secondNumber = scanner.nextDouble();
  }

  public void open() {
    var arithmeticOperations = new ArithmeticOperationsImpl();
    int choice;

    do {
      System.out.println("===MENU===");
      System.out.println("1. Division");
      System.out.println("2. Exponentiation");
      System.out.println("3. Root extraction");
      System.out.println("4. Exit");
      System.out.println("Enter your choice:");

      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          initializeNumbers();
          System.out.println(
              "The division result is " + arithmeticOperations.division(firstNumber, secondNumber));
          break;
        case 2:
          initializeNumbers();
          System.out.println(
              "The exponentiation result is "
                  + arithmeticOperations.exponentiation(firstNumber, secondNumber));
          break;
        case 3:
          initializeNumbers();
          System.out.println(
              "The root extraction result is "
                  + arithmeticOperations.rootExtraction(firstNumber, secondNumber));
          break;
        case 4:
          System.out.println("Exiting the program...");
          break;
        default:
          System.out.println("Invalid choice. Please select a valid option.");
      }

      System.out.println();

    } while (choice != 4);
  }
}
