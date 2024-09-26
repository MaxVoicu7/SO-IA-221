// Clasa AddSub contine metode pentru adunarea si scaderea a doua numere
public class AddSub extends MathOperation {
    // Metodă pentru adunarea a două numere de tip double
    @Override
    public double execute(double a, double b) {
        return a + b; // Returnăm suma celor două numere
    }

    // Metodă pentru scăderea a două numere de tip double
    public double sub(double a, double b) {
        return a - b; // Returnăm diferența dintre cele două numere
    }
}
