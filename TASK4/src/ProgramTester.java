
public class ProgramTester {
    public static void headstailsTester() throws Exception {
        int number_of_throws = 10;

        View.print("***Heads N Tails***\n");
        
        String result = Heads_n_Tails.calcHeadsTails(number_of_throws);

        View.print(result + "\n");
    }

    public static void algorithmsTest() throws Exception {
        int number = 66966;
        
        View.print("\n***Algorithms***");
        
        String task1 = "\nMax value in natural number " + number + " is " + Algorithms.findMaxNatural(number);
        View.print(task1);

        String task2 = Algorithms.findPalindrome(number);
        View.print("\n" + task2 + "\n");

        String task3 = "Number " + number + " is prime: " + Algorithms.isSimpleNatural(number);
        View.print(task3 + "\n");

        String task4 = "Simple deviders of number " + number + " are: " + Algorithms.findSimpNatDivider(number);
        View.print(task4);

        int number_1 = 10;
        int number_2 = 12;

        String task5 = "Numbers are: " + number_1 + ", " + number_2 + ". GCD is: "
                            + Algorithms.findGCD(number_1, number_2) + " LCM is: " + Algorithms.findLCM(number_1, number_2);
        View.print("\n" + task5);

        String task6 = "The number of different digits in " + number + " is " + Algorithms.findDifDigits(number);
        View.print("\n" + task6 + "\n");
    }

    public static void perfectnumberTest() throws Exception {
        int number = 8128;

        View.print("\n***Perfect Number***");

        View.print("\nYour number " + number + " is perfect: " + Perfect_Number.isPerfectNumber(number));
    }
}
