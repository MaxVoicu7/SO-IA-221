
public class UsdConverter extends Converter {
    private double rateToEur;

    public UsdConverter(double rateToEur) {
        this.rateToEur = rateToEur;
    }

    @Override
    public double convertTo(double amount) {
        return amount * rateToEur;  // USD -> EUR
    }

    @Override
    public double convertFrom(double amount) {
        return amount / rateToEur;  // EUR -> USD
    }
}
