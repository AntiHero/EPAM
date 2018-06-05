
public class Perfect_Number {
    public static boolean isPerfectNumber(int number) throws Exception {
        InvalidException.isInvalidException(number);

        boolean result = false;
        int divider = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divider += i;
            }
        }
        if (number == divider) {
            result = true;
        }
        return result;
    }
}
