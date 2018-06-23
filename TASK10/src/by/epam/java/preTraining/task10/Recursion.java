package by.epam.java.preTraining.Task10;

public class Recursion {
    static final int DECIMAL_BASE = 10;
    static final int FIRST_FIBONACCI_NUMBER = 1;
    static final int SECOND_FIBONACCI_NUMBER = 2;

    public static int calcSumOfDigits(int number) {

        if (number < 0)
            return -1;

        return number == 0 ? 0 : number % 10 + calcSumOfDigits(number / DECIMAL_BASE);
    }

    protected static double calcPower(double number, int power) {

        if (number == 0 || power < 0)
            return -1;

        return power == 0 ? 1 : number * calcPower(number, power - 1);
    }

    public static boolean equals(int n, int s) {

        if (n < 0 || s < 0)
            return false;

        return n == 0 ? s = 0 : equals(n / DECIMAL_BASE, s - n % DECIMAL_BASE);
    }

    public static int getFibonacciNum(int index) {
            
        if (index < 1) {
            return -1;
        } else if (index == 1) {
            return FIRST_FIBONACCI_NUMBER;
        } else if (index == 2) {
            return SECOND_FIBONACCI_NUMBER;
        }
        return getFibonacciNum(index - 1) + getFibonacciNum(index - 2);
    }
}
