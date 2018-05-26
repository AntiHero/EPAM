
public class Sequence {
    private static int digit1, digit2, digit3, digit4;
    
    public static void makeDigits(int number) {
        digit1 = (number / 1000) % 10;
        digit2 = (number / 100) % 10;
        digit3 = (number / 10) % 10;
        digit4 = number % 10;
    }
    
    public static String toDigitSequence() {
        String str;

        str = ((digit1 > digit2) & (digit2 > digit3) & (digit3 > digit4)) ? "decreasing" : "increasing";

        return str;
    }
}

