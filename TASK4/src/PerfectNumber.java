
public class PerfectNumber {
    public static boolean isPerfectNumber(int number) throws Exception {
        InvalidException.isInvalidException(number);

        int divider = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                divider += i;
            }
        }

        return number == divider;
    }
}