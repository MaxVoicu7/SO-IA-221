// Clasa AdunareScadere extinde clasa Operatii
public class AdunareScadere extends Operatii {

    // Suprascrierea metodei mathop din clasa părinte pentru adunare
    @Override
    public double mathop(double x, double y) {
        // Returnează suma celor două numere
        return x + y;
    }

    // Metodă pentru scădere
    public double scadere(double x, double y) {
        // Această metodă ar trebui să returneze diferența
        return x - y; // Corectat: trebuie să fie x - y, nu x + y
    }
}
