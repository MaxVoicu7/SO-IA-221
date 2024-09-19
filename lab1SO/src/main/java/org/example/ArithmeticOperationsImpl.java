package org.example;

/**
 * In this class I implemented arithmetic operations such as: division, exponentiation and root extraction.
 * The division method is covered with exception handling, however I couldn't find such cases in the last two methods
 *
 * @author TaneaT
 */

public class ArithmeticOperationsImpl implements ArithmeticOperations{

    public Double division(double firstNumber, double secondNumber){
        if(secondNumber == 0){
            throw new ArithmeticException("The number can't be divided by 0");
        }
        return firstNumber/secondNumber;
    }

    public Double exponentiation(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public Double rootExtraction(double number, double ordinRadacina) {
        return Math.pow(number, 1 / ordinRadacina);
    }



}
