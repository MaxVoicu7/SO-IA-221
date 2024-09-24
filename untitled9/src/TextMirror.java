public class TextMirror extends TextOperation {
    public TextMirror(String input) {
        super(input);
    }

    @Override
    public void execute() {
        String result = new StringBuilder(input).reverse().toString();
        System.out.println("Textul în oglindă: " + result);
    }
}