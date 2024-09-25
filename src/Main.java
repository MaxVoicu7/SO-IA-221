import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Adaugă zar cu 6 fețe");
            System.out.println("2. Adaugă zar cu 12 fețe");
            System.out.println("3. Aruncă zarurile");
            System.out.println("4. Ieșire");
            System.out.print("Alege o opțiune: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    game.addDice(new SixSidedDice());
                    System.out.println("Ai adăugat un zar cu 6 fețe.");
                    break;
                case 2:
                    game.addDice(new TwelveSidedDice());
                    System.out.println("Ai adăugat un zar cu 12 fețe.");
                    break;
                case 3:
                    game.play();
                    System.out.println("Rezultatele aruncărilor: " + game.getResults());
                    break;
                case 4:
                    System.out.println("Ieșire...");
                    break;
                default:
                    System.out.println("Opțiune invalidă. Încearcă din nou.");
            }
        } while (option != 4);

        scanner.close();
    }
}