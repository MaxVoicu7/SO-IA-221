public class TextSeparator extends TextOperation {
    public TextSeparator(String input) {
        super(input);
    }

    @Override
    public void execute() {
        String[] result = input.split("\\s+");
        System.out.println("Cuvintele separate din text: " + String.join(", ", result));
    }
}