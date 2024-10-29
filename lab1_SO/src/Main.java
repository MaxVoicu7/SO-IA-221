import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crearea instanțelor pentru operațiile de adunare și înmulțire
        AdunareScadere addscad = new AdunareScadere();
        Inmultire inmult = new Inmultire();
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Variabilă pentru controlul buclei principale

        // Bucla principală a programului
        while (running) {
            // Afișarea meniului
            System.out.println("==MENU==\n 1.Adunare\n 2.Scadere\n 3.Imultire\n 4)Exit\n\n Optiunea:");
            int choice = scanner.nextInt(); // Citirea opțiunii utilizatorului

            double result = 0; // Inițializarea rezultatului

            // Se verifică opțiunea aleasă
            switch (choice) {
                case 1: // Adunare
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_1 = scanner.nextDouble(); // Citirea primului număr
                    System.out.println("Introduceti al doilea numar:");
                    double num2_1 = scanner.nextDouble(); // Citirea celui de-al doilea număr
                    result = addscad.mathop(num1_1, num2_1); // Calcularea rezultatului
                    break;
                case 2: // Scădere
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_2 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_2 = scanner.nextDouble();
                    result = addscad.scadere(num1_2, num2_2); // Calcularea rezultatului
                    break;
                case 3: // Înmulțire
                    System.out.println("\nIntroduceti primul numar:");
                    double num1_4 = scanner.nextDouble();
                    System.out.println("Introduceti al doilea numar:");
                    double num2_4 = scanner.nextDouble();
                    result = inmult.mathop(num1_4, num2_4); // Calcularea rezultatului
                    break;
                case 4: // Ieșire
                    running = false; // Oprește bucla
                    System.out.println("Iesire din program.");
                    continue; // Revine la începutul buclei
                default: // Opțiune invalidă
                    System.out.println("\nAlegerea greșita a operatiei.");
                    continue; // Revine la începutul buclei
            }

            // Afișarea rezultatului
            System.out.println("\nRezultat: " + result + "\n");
        }

        scanner.close(); // Închide scanner-ul la final
    }
}
