import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double eurToUsdRate = 1.1;  // 1 EUR = 1.1 USD
        double usdToEurRate = 0.91; // 1 USD = 0.91 EUR

        //Adaugarea cursului MDL,RON
        double ronToMdlRate = 3.8;  // 1 RON = 3.8 MDL
        double mdlToRonRate = 0.26; // 1 MDL = 0.26 RON


        EuroConverter euroConverter = new EuroConverter(eurToUsdRate);
        UsdConverter usdConverter = new UsdConverter(usdToEurRate);

        //Adaugarea conversiei
        RonConverter ronConverter = new RonConverter(ronToMdlRate);
        MdlConverter mdlConverter = new MdlConverter(mdlToRonRate);

        Scanner scanner = new Scanner(System.in);
        String continuaConversia;

        do {

            System.out.println("Alegeți tipul de conversie:");
            System.out.println("1: EUR -> USD");
            System.out.println("2: USD -> EUR");
            System.out.println("3: RON -> MDL");
            System.out.println("4: MDL -> RON");

            System.out.print("Introduceți opțiunea (1, 2, 3, 4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    System.out.print("Introduceți suma în EUR pentru a fi convertită în USD: ");
                    double amountInEur = scanner.nextDouble();
                    double amountInUsd = euroConverter.convertTo(amountInEur);
                    System.out.println(amountInEur + " EUR = " + amountInUsd + " USD");
                    break;

                case 2:

                    System.out.print("Introduceți suma în USD pentru a fi convertită în EUR: ");
                    amountInUsd = scanner.nextDouble();
                    amountInEur = usdConverter.convertTo(amountInUsd);
                    System.out.println(amountInUsd + " USD = " + amountInEur + " EUR");
                    break;

                case 3:
                    System.out.print("Introduceți suma în RON pentru a fi convertită în MDL: ");
                    double amountInRon = scanner.nextDouble();
                    double amountInMdl = ronConverter.convertTo(amountInRon);
                    System.out.println(amountInRon + " RON = " + amountInMdl + " MDL");
                    break;

                case 4:
                    System.out.print("Introduceți suma în MDL pentru a fi convertită în RON: ");
                    amountInMdl = scanner.nextDouble();
                    amountInRon = mdlConverter.convertTo(amountInMdl);
                    System.out.println(amountInMdl + " MDL = " + amountInRon + " RON");
                    break;

                default:
                    System.out.println("Opțiune invalidă! Te rog să alegi 1, 2, 3, 4.");
                    break;
            }

            System.out.print("Doriți să efectuați o altă conversie? (da/nu): ");
            continuaConversia = scanner.next();

        } while (continuaConversia.equalsIgnoreCase("da"));

        scanner.close();
    }
}
