import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

// Interfață pentru fantome
interface Fantoma {
    void descrieFantoma();
}

// Enum pentru culori predefinite
enum Culoare {
    ALB, ROSU, VERDE, ALBASTRU, NEGRU, TRANSPARENT
}

// Clasă abstractă - Fantoma de bază
abstract class FantomaDeBaza implements Fantoma {
    protected String nume;
    protected int intensitate;
    protected Culoare culoare;

    public FantomaDeBaza(String nume, int intensitate, Culoare culoare) {
        this.nume = nume;
        this.intensitate = intensitate;
        this.culoare = culoare;
    }

    // Metodă comună pentru toate fantomele
    public void descrieFantoma() {
        System.out.println("Fantoma " + nume + " are o intensitate de " + intensitate + " și culoarea " + culoare + ".");
    }
}