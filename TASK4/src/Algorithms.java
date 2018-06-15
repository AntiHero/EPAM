
public class Algorithms {
    private static final int DEFAULT_VALUE = 1;
    private static final int FIRST_PRIME_NUMBER = 2;
    private static final int DIVIDER = 2;
    private static final int DECIMAL_BASE = 10;

    public static int findMaxNatural(int number) throws Exception {

        InvalidException.isInvalidException(number);

        int maxValue = number % DECIMAL_BASE;
        int lastDigit = maxValue;

        while ((number /= DECIMAL_BASE) > 0) {
            lastDigit = number % TEN;

            if (lastDigit > maxValue) {
                maxValue = lastDigit;
            }
        }

        return max_value;
    }

    public static String findPalindrome(int number) throws Exception {
        
        InvalidException.isInvalidException(number);

        int reverse = 0;
        int palindrome = number;

        while (palindrome > 0) {
            reverse = DECIMAL_BASE * reverse + palindrome % DECIMAL_BASE;
            palindrome /= DECIMAL_BASE;
        }

        return (number == reverse) ? "It's a palindrome!" : "It's not a palindrome!";
    }

    public static boolean isSimpleNatural(int number) throws Exception {

        InvalidException.isInvalidException(number);

        boolean result = true;
        int size = number / DIVIDER;

        for (int i = FIRST_PRIME_NUMBER; i <= size; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return (number == 1) ? false : result;
    }

    public static String findSimpNatDivider(int number) throws Exception {

        InvalidException.isInvalidException(number);

        String result = "";
        int size = number / DIVIDER;

        if (number != 1 && !isSimpleNatural(number)) {
            for (int i = TWO; i <= size; i++) {
                if (number % i == 0) {
                    if (isSimpleNatural(i)) {
                        result += i + " ";
                    }
                }
            }
        } 
        else {
            result = (number > 1) ? Integer.toString(number) : "No simple dividers";
        }
        return result;
    }

    public static int findGCD(int number1, int number2) throws Exception {

        InvalidException.isInvalidException(number1);
        InvalidException.isInvalidException(number2);

        if (number1 != number2) {
            while (number1 != number2) {
                if (number1 > number2) {
                    number1 -= number2;
                } else {
                    number2 -= number1;
                }
            }
        }
        return number_1;
    }

    public static int findLCM(int number1, int number2) throws Exception {

        InvalidException.isInvalidException(number1);
        InvalidException.isInvalidException(number1);

        return number1 * number2 / findGCD(number1, number2);
    }

    public static int findDifDigits(int number) throws Exception {
     
        InvalidException.isInvalidException(number);
        
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;

        while (number > 0) {
            
            switch (number % DECIMAL_BASE) {
            case 1:
                num1 = DEFAULT_VALUE;
                break;
            case 2:
                num2 = DEFAULT_VALUE;
                break;
            case 3:
                num3 = DEFAULT_VALUE;
                break;
            case 4:
                num4 = DEFAULT_VALUE;
                break;
            case 5:
                num5 = DEFAULT_VALUE;
                break;
            case 6:
                num6 = DEFAULT_VALUE;
                break;
            case 7:
                num7 = DEFAULT_VALUE;
                break;
            case 8:
                num8 = DEFAULT_VALUE;
                break;
            case 9:
                num9 = DEFAULT_VALUE;
                break;
            default:
                num0 = DEFAULT_VALUE;
                break;
            }
            number /= DECIMAL_BASE;
        }
        return num0 + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
    }

}
