
public class Reversing {
    private static int digit1, digit2, digit3, digit4, digit5, digit6, digit7;
    
    public static void makeDigits(int number) {
        digit1 = (number / 1000000) % 10;
        digit2 = (number / 100000) % 10;
        digit3 = (number / 10000) % 10;
        digit4 = (number / 1000) % 10;
        digit5 = (number / 100) % 10;
        digit6 = (number / 10) % 10;
        digit7 = number % 10;
    }
    
    public static int invertNum(int number) {
        return (digit7*1000000 + digit6*100000 + digit5*10000 + digit4*1000 
                + digit3*100 + digit2*10 + digit1);
    }
}
