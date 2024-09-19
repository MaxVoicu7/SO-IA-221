public class RonToMdlConverter {
    private static final double RON_TO_MDL_RATE = 3.90;

    public double convert(double ron) {
        return ron * RON_TO_MDL_RATE;
    }
}