
public class Algorithms {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int TEN = 10;

    public static int findMaxNatural(int number) throws Exception {

        InvalidException.isInvalidException(number);

        int max_value = number % TEN;
        int last_digit = max_value;

        while ((number /= TEN) > 0) {
            last_digit = number % TEN;

            if (last_digit > max_value) {
                max_value = last_digit;
            }
        }

        return max_value;
    }

    public static String findPalindrome(int number) throws Exception {
        
        InvalidException.isInvalidException(number);

        int reverse = 0;
        int palindrome = number;

        while (palindrome > 0) {
            reverse = TEN * reverse + palindrome % TEN;
            palindrome /= TEN;
        }

        return (number == reverse) ? "It's a palindrome!" : "It's not a palindrome!";
    }

    public static boolean isSimpleNatural(int number) throws Exception {

        InvalidException.isInvalidException(number);

        boolean result = true;

        for (int i = TWO; i <= number / TWO; i++) {
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

        if (number != 1 && !isSimpleNatural(number)) {
            for (int i = TWO; i <= number / TWO; i++) {
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
            
            switch (number % TEN) {
            case 1:
                num1 = ONE;
                break;
            case 2:
                num2 = ONE;
                break;
            case 3:
                num3 = ONE;
                break;
            case 4:
                num4 = ONE;
                break;
            case 5:
                num5 = ONE;
                break;
            case 6:
                num6 = ONE;
                break;
            case 7:
                num7 = ONE;
                break;
            case 8:
                num8 = ONE;
                break;
            case 9:
                num9 = ONE;
                break;
            default:
                num0 = ONE;
                break;
            }
            number /= TEN;
        }
        return num0 + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
    }

}
