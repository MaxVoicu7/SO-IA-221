class SixSidedDice extends Dice {
    public SixSidedDice() {
        super(6);  // Setează 6 fețe
    }

    @Override
    public String getDescription() {
        return "Zar cu 6 fețe";
    }
}

class TwelveSidedDice extends Dice {
    public TwelveSidedDice() {
        super(12);  // Setează 12 fețe
    }

    @Override
    public String getDescription() {
        return "Zar cu 12 fețe";
    }
}