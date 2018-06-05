
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

    public static int findGCD(int number_1, int number_2) throws Exception {

        InvalidException.isInvalidException(number_1);
        InvalidException.isInvalidException(number_2);

        if (number_1 != number_2) {
            while (number_1 != number_2) {
                if (number_1 > number_2) {
                    number_1 -= number_2;
                } else {
                    number_2 -= number_1;
                }
            }
        }
        return number_1;
    }

    public static int findLCM(int number_1, int number_2) throws Exception {

        InvalidException.isInvalidException(number_1);
        InvalidException.isInvalidException(number_1);

        return number_1 * number_2 / findGCD(number_1, number_2);
    }

    public static int findDifDigits(int number) throws Exception {
     
        InvalidException.isInvalidException(number);
        
        int remainder = 0;

        int num_0 = 0;
        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        int num_4 = 0;
        int num_5 = 0;
        int num_6 = 0;
        int num_7 = 0;
        int num_8 = 0;
        int num_9 = 0;

        while (number > 0) {
            remainder = number % TEN;
            switch (remainder) {
            case 1:
                num_1 = ONE;
                break;
            case 2:
                num_2 = ONE;
                break;
            case 3:
                num_3 = ONE;
                break;
            case 4:
                num_4 = ONE;
                break;
            case 5:
                num_5 = ONE;
                break;
            case 6:
                num_6 = ONE;
                break;
            case 7:
                num_7 = ONE;
                break;
            case 8:
                num_8 = ONE;
                break;
            case 9:
                num_9 = ONE;
                break;
            default:
                num_0 = ONE;
                break;
            }
            number /= TEN;
        }
        return num_0 + num_1 + num_2 + num_3 + num_4 + num_5 + num_6 + num_7 + num_8 + num_9;
    }

}
