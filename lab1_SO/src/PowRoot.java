// Clasa PowRoot contine metode pentru ridicarea la putere si extragerea radacinii unui numar
public class PowRoot extends MathOperation{

    // Metoda power returneaza rezultatul ridicarii la putere a numarului a la exponentul b
    @Override
    public double execute(double a, double b) {
        return Math.pow(a, b); // utilizeaza metoda Math.pow pentru ridicarea lui a la puterea b
    }

    // Metoda root returneaza rezultatul extragerii radacinii n din numarul a
    public double root(double a, double n) {
        return Math.pow(a, 1.0 / n); // foloseste Math.pow pentru a calcula radacina n-a din a
    }
}
