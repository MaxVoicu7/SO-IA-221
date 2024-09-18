import java.util.Random;

class Dice {
    private int numFaces;
    private Random random;

    public Dice(int numFaces) {
        this.numFaces = numFaces;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(numFaces) + 1;
    }

    public int getNumFaces() {
        return numFaces;
    }
}
