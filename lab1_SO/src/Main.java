import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddSub addSub = new AddSub();
        PowRoot powRoot = new PowRoot();
        MultDiv multDiv = new MultDiv();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Selectati operatia:\n 1)Adunare,\n 2)Scadere,\n 3)Exponentiare,\n 4)Imultire,\n 5)Impartire,\n 6)Extracția rădăcinii,\n 7)Iesire\nOptiunea:");
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
                case 4:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_4 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_4 = scanner.nextDouble();
                    result = MultDiv.mult(num1_4, num2_4);
                    break;
                case 5:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_5 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_5 = scanner.nextDouble();
                    result = MultDiv.div(num1_5, num2_5);
                    break;
                case 6:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_6 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_6 = scanner.nextDouble();
                    result = powRoot.root(num1_6, num2_6);
                    break;
                case 7:
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