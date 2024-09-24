public class MdlConverter extends Converter {
    private double mdlToRonRate;

    public MdlConverter(double mdlToRonRate) {
        this.mdlToRonRate = mdlToRonRate;
    }

    @Override
    public double convertTo(double amount) {
        return amount * mdlToRonRate;  // MDL -> RON
    }

    @Override
    public double convertFrom(double amount) {
        return amount / mdlToRonRate;  // RON -> MDL
    }
}