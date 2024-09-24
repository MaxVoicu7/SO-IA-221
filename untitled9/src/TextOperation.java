public abstract class TextOperation {
    protected String input;

    public TextOperation(String input) {
        this.input = input;
    }

    public abstract void execute();
}