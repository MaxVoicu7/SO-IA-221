import java.util.Random;

abstract class Dice {
    protected int numFaces;
    private Random random;

    public Dice(int numFaces) {
        this.numFaces = numFaces;
        this.random = new Random();
    }
    public int roll() {
        return random.nextInt(numFaces) + 1;
    }

    public abstract String getDescription();
}
