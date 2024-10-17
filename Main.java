class StergereSpatii {
    public String stergeSpatiiInutile(String text) {
        return text.replaceAll("\\s+", " ").trim(); 
    }
}


class StergereLiniiNoi {
    public String stergeLiniiNoi(String text) {
        return text.replaceAll("\\r?\\n", " "); 
    }
}


class TextInOglinda {
    public String oglindesteTextul(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();  
    }
}


class SeparareCuvinte {
    public String[] separaCuvinte(String text) {
        return text.split("\\s+"); 
    }
}


class SchimbareCuvinte {
    public String schimbaCuvant(String text, String vechi, String nou) {
        return text.replace(vechi, nou);  
    }
}


class InversareLitere {
    public String inversareLitereCuvant(String text) {
        String[] cuvinte = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String cuvant : cuvinte) {
            StringBuilder reversedWord = new StringBuilder(cuvant);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        return result.toString().trim();  
    }
}


public class Main {
    public static void main(String[] args) {
        String text = "  Acesta este   un text   \n cu   spatii si linii noi .\n";

     
        StergereSpatii stergereSpatii = new StergereSpatii();
        StergereLiniiNoi stergereLiniiNoi = new StergereLiniiNoi();
        TextInOglinda oglindireText = new TextInOglinda();  
        SeparareCuvinte separareCuvinte = new SeparareCuvinte();
        SchimbareCuvinte schimbareCuvinte = new SchimbareCuvinte();
        InversareLitere inversareLitere = new InversareLitere();

      
        System.out.println("Text original: ");
        System.out.println(text);

      
        String textFaraSpatii = stergereSpatii.stergeSpatiiInutile(text);
        System.out.println("\nText fără spații inutile: ");
        System.out.println(textFaraSpatii);

    
        String textFaraLiniiNoi = stergereLiniiNoi.stergeLiniiNoi(text);
        System.out.println("\nText fără linii noi: ");
        System.out.println(textFaraLiniiNoi);

    
        String textInversat = oglindireText.oglindesteTextul(text); 
        System.out.println("\nText în oglindă: ");
        System.out.println(textInversat);

       
        String[] cuvinte = separareCuvinte.separaCuvinte(text);
        System.out.println("\nCuvinte separate: ");
        for (String cuvant : cuvinte) {
            System.out.println(cuvant);
        }

       
        String textSchimbat = schimbareCuvinte.schimbaCuvant(text, "text", "mesaj");
        System.out.println("\nText cu cuvântul schimbat: ");
        System.out.println(textSchimbat);

    
        String textCuLitereInversate = inversareLitere.inversareLitereCuvant(text);
        System.out.println("\nText cu litere inversate în fiecare cuvânt: ");
        System.out.println(textCuLitereInversate);
    }
}