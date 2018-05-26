
public class ArithmGeomAvr {
    private static int digit1, digit2, digit3, digit4, digit5, digit6;
    
    public static void makeDigits(int number) {
        digit1 = (number / 100000) % 10;
        digit2 = (number / 10000) % 10;
        digit3 = (number / 1000) % 10;
        digit4 = (number / 100) % 10;
        digit5 = (number / 10) % 10;
        digit6 = number % 10;
    }
    
    public static double calcArithmAvr() {
        return (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / 6.;
    }
    
    public static double calcGeommAvr() {
        return Math.pow((digit1*digit2*digit3*digit4*digit5*digit6), 1. / 6.);
    }
}
