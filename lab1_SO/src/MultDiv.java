// Clasa MultDiv contine metode pentru inmultire si impartire a doua numere
public class MultDiv extends MathOperation{

    // Metoda mult returneaza produsul dintre doua numere de tip double
    @Override
    public double execute(double a, double b){
        return a * b; // inmulteste a si b
    }

    // Metoda div returneaza rezultatul impartirii dintre doua numere de tip double
    public double div(double a, double b){
        // Verifica daca b este diferit de zero pentru a evita impartirea la zero
        if(b != 0){
            return a / b; // daca b nu este zero, returneaza rezultatul impartirii
        } else {
            // In caz contrar, afiseaza un mesaj de eroare si returneaza 0
            System.out.println("Impartirea la zero nu e permisa!");
            return 0;
        }
    }
}
