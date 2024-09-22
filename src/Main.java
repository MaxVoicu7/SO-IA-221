public class Main {
    public static void main(String[] args) {
        DiceGame game = new DiceGame();

        game.addDice(new Dice(6));
        game.addDice(new Dice(12));

        game.play();

        System.out.println("Rezultatele aruncarilor: " + game.getResults());
    }
}
