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
// Moștenire simplă - Fantoma Fricoasă
class FantomaFricoasa extends FantomaDeBaza {
    public FantomaFricoasa(String nume, int intensitate, Culoare culoare) {
        super(nume, intensitate, culoare);
    }

    @Override
    public void descrieFantoma() {
        System.out.println("Fantoma fricoasă " + nume + " tremură cu o intensitate de " + intensitate + " și este de culoare " + culoare + ".");
    }
}

// Moștenire ierarhică - Fantoma Zgomotoasă
class FantomaZgomotoasa extends FantomaDeBaza {
    private int volum;

    public FantomaZgomotoasa(String nume, int intensitate, Culoare culoare, int volum) {
        super(nume, intensitate, culoare);
        this.volum = volum;
    }

    @Override
    public void descrieFantoma() {
        System.out.println("Fantoma zgomotoasă " + nume + " urlă cu o intensitate de " + intensitate + " și un volum de " + volum + " decibeli, fiind de culoare " + culoare + ".");
    }

    public void schimbaVolum(int nouVolum) {
        this.volum = nouVolum;
        System.out.println(nume + " a schimbat volumul la " + volum + " decibeli.");
    }
}

// Moștenire simplă - Fantoma Prietenoasă
class FantomaPrietenoasa extends FantomaDeBaza {
    public FantomaPrietenoasa(String nume, int intensitate, Culoare culoare) {
        super(nume, intensitate, culoare);
    }

    @Override
    public void descrieFantoma() {
        System.out.println("Fantoma prietenoasă " + nume + " te întâmpină cu o intensitate de " + intensitate + " și este de culoare " + culoare + ".");
    }
}

// Fantoma Vicleana - Schimbă culoarea
class FantomaVicleana extends FantomaDeBaza {
    public FantomaVicleana(String nume, int intensitate, Culoare culoare) {
        super(nume, intensitate, culoare);
    }

    // Metodă specifică pentru a schimba culoarea
    public void schimbaCuloarea(Culoare nouaCuloare) {
        this.culoare = nouaCuloare;
        System.out.println(nume + " și-a schimbat culoarea în " + culoare + "!");
    }
    @Override
    public void descrieFantoma() {
        System.out.println("Fantoma vicleană " + nume + " poate schimba culoarea și are intensitatea de " + intensitate + ".");
    }
}

// Fantoma Tristă - Variază intensitatea
class FantomaTrista extends FantomaDeBaza {
    private String stareDeSpirit;

    public FantomaTrista(String nume, int intensitate, Culoare culoare, String stareDeSpirit) {
        super(nume, intensitate, culoare);
        this.stareDeSpirit = stareDeSpirit;
        ajusteazaIntensitatea();
    }

    private void ajusteazaIntensitatea() {
        if (stareDeSpirit.equalsIgnoreCase("trista")) {
            this.intensitate -= 2;
        } else if (stareDeSpirit.equalsIgnoreCase("fericita")) {
            this.intensitate += 2;
        }
    }

    @Override
    public void descrieFantoma() {
        System.out.println("Fantoma tristă " + nume + " este în starea de spirit " + stareDeSpirit + " și are intensitatea de " + intensitate + ".");
    }
}

// Fantoma Eterică - Invizibilă, dar zgomotoasă
class FantomaEterica extends FantomaDeBaza {
    private int volum;

    public FantomaEterica(String nume, int intensitate, Culoare culoare, int volum) {
        super(nume, intensitate, culoare);
        this.volum = volum;
    }

    @Override
    public void descrieFantoma() {
        System.out.println("Fantoma eterică " + nume + " aproape invizibilă cu intensitatea " + intensitate + " și volumul de " + volum + " decibeli.");
    }

    public void schimbaVolum(int nouVolum) {
    }
}   