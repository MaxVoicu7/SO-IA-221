import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GasireaPunctuatiilor extends GasireaFrazelor {
    @Override
    public void Extragerea(String text) {
        Pattern pattern = Pattern.compile("[^\\w\\s]"); // paternul pentru punctuatie
        Matcher matcher = pattern.matcher(text);
        System.out.print("Punctuation Marks: ");

        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}