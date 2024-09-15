import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddSub addSub = new AddSub();
        PowRoot powRoot = new PowRoot();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selectati operatia:\n 1)Adunare,\n 2)Scadere,\n 3)Exponentiare\nOptiunea:");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                System.out.println("\nIntroduceti primul numar:");
                double num1_1 = scanner.nextDouble();
                System.out.println("Introduceti al doilea numar:");
                double num2_1 = scanner.nextDouble();
                result = addSub.add(num1_1, num2_1);
                break;
            case 2:
                System.out.println("\nIntroduceti primul numar:");
                double num1_2 = scanner.nextDouble();
                System.out.println("Introduceti al doilea numar:");
                double num2_2 = scanner.nextDouble();
                result = addSub.sub(num1_2, num2_2);
                break;
            case 3:
                System.out.println("\nIntroduceti primul numar:");
                double num1_3 = scanner.nextDouble();
                System.out.println("Introduceti al doilea numar:");
                double num2_3 = scanner.nextDouble();
                result = powRoot.power(num1_3, num2_3);
                break;
            default:
                System.out.println("\nAlegerea greșita a operatiei.");
                break;
        }

        System.out.println("\nRezultat: " + result);
        scanner.close();
    }
}
