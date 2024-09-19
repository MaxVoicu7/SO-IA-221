import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Alegeți opțiunea de conversie:");
        System.out.println("1. MDL în RON");
        System.out.println("2. RON în MDL");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Introduceți suma în MDL: ");
            double mdlAmount = scanner.nextDouble();
            MdlToRonConverter converter = new MdlToRonConverter();
            double ronAmount = converter.convert(mdlAmount);
            System.out.printf("%.2f MDL este egal cu %.2f RON%n", mdlAmount, ronAmount);
        } else if (option == 2) {
            System.out.print("Introduceți suma în RON: ");
            double ronAmount = scanner.nextDouble();
            RonToMdlConverter converter = new RonToMdlConverter();
            double mdlAmount = converter.convert(ronAmount);
            System.out.printf("%.2f RON este egal cu %.2f MDL%n", ronAmount, mdlAmount);
        } else {
            System.out.println("Opțiune invalidă.");
        }

        scanner.close();
    }
}