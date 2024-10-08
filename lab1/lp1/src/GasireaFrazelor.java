import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GasireaFrazelor extends GasireaNumerelor {
    @Override
    public void Extragerea(String text) {
        int numarFraze = 0;
        Pattern pattern = Pattern.compile("\\bCOVID\\b", Pattern.CASE_INSENSITIVE); // patern pentru fraza concreta
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            numarFraze++;
        }

        System.out.println("Numărul de apariții a cuvântului 'COVID' în fișier este: " + numarFraze);
    }
}
