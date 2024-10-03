package var1.src;

public class Impartire extends OperatiiAritmetice {
    @Override
    public double operatie(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Împărțire la zero nu este permisă.");
        }
        return a / b;
    }
}
