public class MdlToRonConverter {
    private static final double MDL_TO_RON_RATE = 0.30;

    public double convert(double mdl) {
        return mdl * MDL_TO_RON_RATE;
    }
}