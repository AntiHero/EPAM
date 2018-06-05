
public class InvalidException {
    public static void isInvalidException(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("\nNot a natural number!");
        }
    }
}
