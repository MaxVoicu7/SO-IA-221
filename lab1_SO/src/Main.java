import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creăm obiecte pentru fiecare clasă de operații
        AddSub addSub = new AddSub();
        PowRoot powRoot = new PowRoot();
        MultDiv multDiv = new MultDiv();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Ciclu principal pentru a continua execuția până la ieșire
        while (running) {
            System.out.println("Selectati operatia:\n 1)Adunare,\n 2)Scadere,\n 3)Exponentiare,\n 4)Imultire,\n 5)Impartire,\n 6)Extracția rădăcinii,\n 7)Iesire\nOptiunea:");
            int choice = scanner.nextInt(); // Citim alegerea utilizatorului

            double result = 0; // Inițializăm variabila pentru rezultat

            // Executăm operația în funcție de alegerea utilizatorului
            switch (choice) {
                case 1:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_1 = scanner.nextDouble(); // Citim primul număr
                    System.out.println("Introduceti al doilea numar:");
                    double num2_1 = scanner.nextDouble(); // Citim al doilea număr
                    result = addSub.add(num1_1, num2_1); // Apelăm metoda de adunare
                    break;
                case 2:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_2 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_2 = scanner.nextDouble();
                    result = addSub.sub(num1_2, num2_2); // Apelăm metoda de scădere
                    break;
                case 3:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_3 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_3 = scanner.nextDouble();
                    result = powRoot.power(num1_3, num2_3); // Apelăm metoda de exponentiere
                    break;
                case 4:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_4 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_4 = scanner.nextDouble();
                    result = multDiv.mult(num1_4, num2_4); // Apelăm metoda de înmulțire
                    break;
                case 5:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_5 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_5 = scanner.nextDouble();
                    result = multDiv.div(num1_5, num2_5); // Apelăm metoda de împărțire
                    break;
                case 6:
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_6 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_6 = scanner.nextDouble();
                    result = powRoot.root(num1_6, num2_6); // Apelăm metoda de extragere a rădăcinii
                    break;
                case 7:
                    running = false; // Setăm flag-ul pentru a opri ciclul
                    System.out.println("Iesire din program.");
                    continue; // Sărim peste restul ciclului
                default:
                    System.out.println("\nAlegerea greșita a operatiei."); // Mesaj pentru opțiune greșită
                    continue; // Sărim peste restul ciclului
            }

            System.out.println("\nRezultat: " + result + "\n"); // Afișăm rezultatul
        }

        scanner.close(); // Închidem scannerul pentru a elibera resursele
    }
}
