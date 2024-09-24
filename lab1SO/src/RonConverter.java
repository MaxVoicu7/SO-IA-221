public class RonConverter extends Converter {
    private double ronToMdlRate;

    public RonConverter(double ronToMdlRate) {
        this.ronToMdlRate = ronToMdlRate;
    }

    @Override
    public double convertTo(double amount) {
        return amount * ronToMdlRate;  // RON -> MDL
    }

    @Override
    public double convertFrom(double amount) {
        return amount / ronToMdlRate;  // MDL -> RON
    }
}