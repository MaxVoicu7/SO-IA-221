public class Main {
    public static void main(String[] args) {
        String text = """
                ANSP: Peste 820 de cazuri de COVID-19 în R. Moldova, în luna septembrie
                Reprezentanții ANSP au declarat că în Republica Moldova, în perioada 11-17 septembrie (săptămâna 37), au fost înregistrate 825 de cazuri de COVID-19, de 1,9 ori mai multe comparativ cu săptămâna 36 (424 de cazuri), de 4,1 ori mai multe comparativ cu săptămâna 35 (202 cazuri) și de 4,8 ori mai multe cazuri comparativ cu săptămâna 34 (173 de cazuri), transmite Știri.md cu referire la newsmaker.md.
                „În săptămâna 37, cazuri de deces nu au fost înregistrate”, au precizat reprezentanții instituției.
                Potrivit ANSP, în perioada 1-31 august au fost înregistrate 522 de cazuri de COVID-19, dintre care 1,3% (șapte cazuri) - în regiunea transnistreană, cu o creștere de circa 5,5 ori comparativ cu luna iulie 2023 (95 de cazuri, inclusiv două în regiunea transnistreană).
                „În legătură cu migrația sporită, începerea anului școlar, revenirea elevilor din vacanțe și formarea colectivităților în instituțiile de educație timpurie și învățământ, se manifestă o creștere a numărului de cazuri de infecții respiratorii și COVID-19”, au comunicat reprezentanții Agenției.""";

        GasireaNumerelor Numere = new GasireaNumerelor();
        GasireaFrazelor Fraza = new GasireaFrazelor();
        GasireaPunctuatiilor Punctuatii = new GasireaPunctuatiilor();
        Numere.Extragerea(text);
        Fraza.Extragerea(text);
        Punctuatii.Extragerea(text);
    }
}