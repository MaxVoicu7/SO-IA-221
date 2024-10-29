// Clasa Inmultire extinde clasa Operatii
public class Inmultire extends Operatii {

    // Suprascrierea metodei mathop din clasa părinte
    @Override
    public double mathop(double x, double y) {
        // Returnează produsul celor două numere
        return x * y;
    }
}
