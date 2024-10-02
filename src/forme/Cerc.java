package src.forme;

import src.FormaGeometrica;

public class Cerc extends FormaGeometrica {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double calculeazaSuprafata() {
        return Math.PI * raza * raza;
    }

    public double calculeazaPerimetru() {
        return 2 * Math.PI * raza;
    }
}
