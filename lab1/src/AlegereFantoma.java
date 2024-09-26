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
// Meniul principal pentru alegerea fantomelor
public class AlegereFantoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fantoma> fantome = new ArrayList<>();
        int optiune = 0;

        while (optiune != 8) {
            // Meniul principal
            System.out.println("\n---- Meniu Principal ----");
            System.out.println("1. Creează o fantomă fricoasă");
            System.out.println("2. Creează o fantomă zgomotoasă");
            System.out.println("3. Creează o fantomă prietenoasă");
            System.out.println("4. Creează o fantomă vicleană");
            System.out.println("5. Creează o fantomă tristă");
            System.out.println("6. Creează o fantomă eterică");
            System.out.println("7. Alege o fantomă creată");
            System.out.println("8. Ieșire");
            System.out.println("Alegeți o opțiune: ");
            optiune = scanner.nextInt();

            if (optiune == 8) {
                System.out.println("Ieșire din program...");
                break;
            }

            // Creare de fantome
            if (optiune >= 1 && optiune <= 6) {
                // Citirea numelui fantomei
                scanner.nextLine(); // Consumă newline rămas
                Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
                System.out.println("Introduceți numele fantomei: ");
                String nume = scanner.nextLine();
                while (!pattern.matcher(nume).matches()) {
                    System.out.println("Nume invalid. Introduceți un nume valid (doar litere): ");
                    nume = scanner.nextLine();
                }

                // Citirea intensității
                System.out.println("Introduceți intensitatea fantomei (1-10): ");
                int intensitate = scanner.nextInt();
                while (intensitate < 1 || intensitate > 10) {
                    System.out.println("Intensitate invalidă. Introduceți o valoare între 1 și 10: ");
                    intensitate = scanner.nextInt();
                }

                // Alegerea culorii
                System.out.println("Alegeți culoarea fantomei (1-ALB, 2-ROSU, 3-VERDE, 4-ALBASTRU, 5-NEGRU, 6-TRANSPARENT): ");
                int optiuneCuloare = scanner.nextInt();
                Culoare culoare = Culoare.values()[optiuneCuloare - 1];

                // Crearea fantomelor în funcție de opțiune
                switch (optiune) {
                    case 1:
                        Fantoma fricoasa = new FantomaFricoasa(nume, intensitate, culoare);
                        fantome.add(fricoasa);
                        break;
                    case 2:
                        System.out.println("Introduceți volumul fantomei zgomotoase (în decibeli): ");
                        int volum = scanner.nextInt();
                        Fantoma zgomotoasa = new FantomaZgomotoasa(nume, intensitate, culoare, volum);
                        fantome.add(zgomotoasa);
                        break;
                    case 3:
                        Fantoma prietenoasa = new FantomaPrietenoasa(nume, intensitate, culoare);
                        fantome.add(prietenoasa);
                        break;
                    case 4:
                        Fantoma vicleana = new FantomaVicleana(nume, intensitate, culoare);
                        fantome.add(vicleana);
                        break;
                    case 5:
                        scanner.nextLine(); // Consumă newline
                        System.out.println("Introduceți starea de spirit a fantomei (tristă/fericită): ");
                        String stareDeSpirit = scanner.nextLine();
                        Fantoma trista = new FantomaTrista(nume, intensitate, culoare, stareDeSpirit);
                        fantome.add(trista);
                        break;
                    case 6:
                        System.out.println("Introduceți volumul fantomei eterice (în decibeli): ");
                        int volumEteric = scanner.nextInt();
                        Fantoma eterica = new FantomaEterica(nume, intensitate, culoare, volumEteric);
                        fantome.add(eterica);
                        break;
                }
            }
            // Alege o fantomă creată și interacționează cu aceasta
            else if (optiune == 7) {
                if (fantome.isEmpty()) {
                    System.out.println("Nu există fantome create.");
                } else {
                    // Afișarea fantomelor create
                    System.out.println("Alegeți o fantomă creată:");
                    for (int i = 0; i < fantome.size(); i++) {
                        System.out.println((i + 1) + ". " + fantome.get(i).getClass().getSimpleName() + " - " + ((FantomaDeBaza) fantome.get(i)).nume);
                    }
                    // Selectarea fantomei
                    System.out.println("Introduceți numărul fantomei pe care doriți să o selectați: ");
                    int fantomaAlesa = scanner.nextInt();
                    if (fantomaAlesa >= 1 && fantomaAlesa <= fantome.size()) {
                        Fantoma fantomaSelectata = fantome.get(fantomaAlesa - 1);
                        fantomaSelectata.descrieFantoma();

                        // Interacțiune cu fantoma selectată
                        System.out.println("Ce doriți să faceți cu această fantomă?");
                        System.out.println("1. Schimbați culoarea (pentru fantomele vicleane)");
                        System.out.println("2. Schimbați volumul (pentru fantomele zgomotoase și eterice)");
                        System.out.println("3. Ieșiți");
                        int optiuneInteractie = scanner.nextInt();

                        if (optiuneInteractie == 1 && fantomaSelectata instanceof FantomaVicleana) {
                            // Schimbarea culorii pentru fantoma vicleană
                            System.out.println("Alegeți noua culoare (1-ALB, 2-ROSU, 3-VERDE, 4-ALBASTRU, 5-NEGRU, 6-TRANSPARENT): ");
                            int optiuneNouaCuloare = scanner.nextInt();
                            Culoare nouaCuloare = Culoare.values()[optiuneNouaCuloare - 1];
                            ((FantomaVicleana) fantomaSelectata).schimbaCuloarea(nouaCuloare);
                        }
                        else if (optiuneInteractie == 2 && (fantomaSelectata instanceof FantomaZgomotoasa || fantomaSelectata instanceof FantomaEterica)) {
                            // Schimbarea volumului pentru fantomele zgomotoase și eterice
                            System.out.println("Introduceți noul volum (în decibeli): ");
                            int nouVolum = scanner.nextInt();
                            if (fantomaSelectata instanceof FantomaZgomotoasa) {
                                ((FantomaZgomotoasa) fantomaSelectata).schimbaVolum(nouVolum);
                            } else if (fantomaSelectata instanceof FantomaEterica) {
                                ((FantomaEterica) fantomaSelectata).schimbaVolum(nouVolum);
                            }
                        }
                        else if (optiuneInteractie == 3) {
                            System.out.println("Ieșire din meniul de interacțiune...");
                        }
                        else {
                            System.out.println("Opțiune invalidă.");
                        }
                    } else {
                        System.out.println("Opțiune invalidă.");
                    }
                }
            }
            else {
                System.out.println("Opțiune invalidă.");
            }
        }

        scanner.close();
    }
}