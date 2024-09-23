package src.forme;

public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double calculeazaSuprafata() {
        return lungime * latime;
    }

    public double calculeazaPerimetru() {
        return 2 * (lungime + latime);
    }
}
