public class MultDiv {

    public double mult(double a, double b){
        return a * b;
    }

    public double div(double a, double b){
        if(b != 0){
            return a / b;
        } else {
            System.out.println("Impartirea la zero nu e permisa!");
            return 0;
        }
    }
}