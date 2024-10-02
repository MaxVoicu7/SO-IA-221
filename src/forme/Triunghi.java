package src.forme;

import src.FormaGeometrica;

public class Triunghi extends FormaGeometrica {
    private double baza;
    private double inaltime;
    private double latura1, latura2, latura3;

    public Triunghi(double baza, double inaltime, double latura1, double latura2, double latura3) {
        this.baza = baza;
        this.inaltime = inaltime;
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public double calculeazaSuprafata() {
        return (baza * inaltime) / 2;
    }

    public double calculeazaPerimetru() {
        return latura1 + latura2 + latura3;
    }
}