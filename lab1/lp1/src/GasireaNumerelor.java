import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GasireaNumerelor {
    public void Extragerea(String text) {
        Pattern pattern = Pattern.compile("\\d+"); // paternul pentru numere
        Matcher matcher = pattern.matcher(text);
        System.out.print("numerele gasite:");

        while (matcher.find())
            System.out.print(' ' + matcher.group());

        System.out.println();
    }
}