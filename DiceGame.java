import java.util.ArrayList;
import java.util.List;

class DiceGame {
    private List<Dice> diceList;
    private List<Integer> results;


    public DiceGame() {
        diceList = new ArrayList<>();
        results = new ArrayList<>();
    }

    public void addDice(Dice dice) {
        diceList.add(dice);
    }

    public void play() {
        System.out.println("Arunc zarurile...");
        results.clear();

        for (Dice dice : diceList) {
            int result = dice.roll();
            results.add(result);
            System.out.println("Zar cu " + dice.getNumFaces() + " fețe a dat: " + result);
        }
    }

    public List<Integer> getResults() {
        return results;
    }
}