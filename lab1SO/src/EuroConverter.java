public class EuroConverter extends Converter {
    private double eurToUsdRate;

    public EuroConverter(double eurToUsdRate) {
        this.eurToUsdRate = eurToUsdRate;
    }

    @Override
    public double convertTo(double amount) {
        // Convertim EUR la USD
        return amount * eurToUsdRate;
    }

    @Override
    public double convertFrom(double amount) {
        // Convertim USD la EUR
        return amount / eurToUsdRate;
    }
}
