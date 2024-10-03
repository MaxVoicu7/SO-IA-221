import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperatiiAritmetice operatie = null;

        // Afișăm meniul
        System.out.println("Alege operația dorită:");
        System.out.println("1. Adunare");
        System.out.println("2. Scădere");

        int optiune = scanner.nextInt();

        // Alegem operația în funcție de opțiunea utilizatorului
        switch (optiune) {
            case 1:
                operatie = new Adunare();
                break;
            case 2:
                operatie = new Scadere();
                break;
            default:
                System.out.println("Opțiune invalidă!");
                return;
        }

        // Introducerea valorilor de la tastatură
        System.out.print("Introdu primul număr: ");
        double numar1 = scanner.nextDouble();
        System.out.print("Introdu al doilea număr: ");
        double numar2 = scanner.nextDouble();

        // Calculul rezultatului folosind metoda `operatie`
        try {
            double rezultat = operatie.operatie(numar1, numar2);
            System.out.println("Rezultatul: " + rezultat);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
