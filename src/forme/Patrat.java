package src.forme;


public class Patrat {
    private double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    public double calculeazaSuprafata() {
        return latura * latura;
    }

    public double calculeazaPerimetru() {
        return 4 * latura;
    }
}

