package src;
import src.forme.*;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Patrat
        System.out.print("Introdu lungimea laturii patratului: ");
        double laturaPatrat = scanner.nextDouble();
        Patrat patrat = new Patrat(laturaPatrat);
        System.out.println("Suprafata patratului: " + patrat.calculeazaSuprafata());
        System.out.println("Perimetrul patratului: " + patrat.calculeazaPerimetru());

        // Dreptunghi
        System.out.print("Introdu lungimea dreptunghiului: ");
        double lungimeDreptunghi = scanner.nextDouble();
        System.out.print("Introdu latimea dreptunghiului: ");
        double latimeDreptunghi = scanner.nextDouble();
        Dreptunghi dreptunghi = new Dreptunghi(lungimeDreptunghi, latimeDreptunghi);
        System.out.println("Suprafata dreptunghiului: " + dreptunghi.calculeazaSuprafata());
        System.out.println("Perimetrul dreptunghiului: " + dreptunghi.calculeazaPerimetru());

        // Cerc
        System.out.print("Introdu raza cercului: ");
        double razaCerc = scanner.nextDouble();
        Cerc cerc = new Cerc(razaCerc);
        System.out.println("Suprafata cercului: " + cerc.calculeazaSuprafata());
        System.out.println("Perimetrul cercului: " + cerc.calculeazaPerimetru());

        // Triunghi
        System.out.print("Introdu baza triunghiului: ");
        double bazaTriunghi = scanner.nextDouble();
        System.out.print("Introdu inaltimea triunghiului: ");
        double inaltimeTriunghi = scanner.nextDouble();
        System.out.print("Introdu cele trei laturi ale triunghiului: ");
        double latura1 = scanner.nextDouble();
        double latura2 = scanner.nextDouble();
        double latura3 = scanner.nextDouble();
        Triunghi triunghi = new Triunghi(bazaTriunghi, inaltimeTriunghi, latura1, latura2, latura3);
        System.out.println("Suprafata triunghiului: " + triunghi.calculeazaSuprafata());
        System.out.println("Perimetrul triunghiului: " + triunghi.calculeazaPerimetru());

        scanner.close();
    }
}