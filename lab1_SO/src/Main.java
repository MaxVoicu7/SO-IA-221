import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdunareScadere addscad = new AdunareScadere();
        Inmultire inmult = new Inmultire();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("==MENU==\n 1.Adunare\n 2.Scadere\n 3.Imultire\n 4)Exit\n\n Optiunea:");
            int choice = scanner.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_1 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_1 = scanner.nextDouble();
                    result = addscad.mathop(num1_1, num2_1);
                    break;
                case 2:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_2 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_2 = scanner.nextDouble();
                    result = addscad.scadere(num1_2, num2_2);
                    break;
                case 3:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_4 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_4 = scanner.nextDouble();
                    result = inmult.mathop(num1_4, num2_4);
                    break;
                case 4:
                    running = false;
                    System.out.println("Iesire din program.");
                    continue;
                default:
                    System.out.println("\nAlegerea greșita a operatiei.");
                    continue;
            }

            System.out.println("\nRezultat: " + result + "\n");
        }

        scanner.close();
    }
}