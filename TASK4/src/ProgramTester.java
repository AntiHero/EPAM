
public class ProgramTester {
    public static void headstailsTester() {
        int number_of_throws = 15;

        String result = Heads_n_Tails.calcHeadsTails(number_of_throws);
        
        Print.print("***Heads N Tails***\n");
        Print.print(result + "\n");
    }

    public static void algorithmsTest() {
        int number = 777;
        
        Print.print("\n***Algorithms***");

        String task1 = "\nMax value in number " + number + " is " + Algorithms.findMaxNatural(number);
        
        Print.print(task1);

        String task2= Algorithms.findPalindrome(number);
        Print.print("\n" + task2 + "\n");

        String task3 = Algorithms.isSimpleNatural(number);
        Print.print(task3 + "\n");

        String task4 = "Simple deviders of number " + number + " are: " + Algorithms.findSimpNatDivider(number);
        Print.print(task4);

        int number_1 = 60;
        int number_2 = 15;

        String task5 = Algorithms.findGCD(number_1, number_2);
        Print.print("\nNumbers are: " + number_1 + " and " + number_2 + ". " + task5);

        String task6 = "The number of different digits in " + number + " is " + Algorithms.findDifDigits(number);
        Print.print("\n" + task6 + "\n");

       
    }

    public static void perfectnumberTest() {
        int number = 28;
        
        Print.print("\n***Perfect Number***");
        
        String result = Perfect_Number.isPerfectNumber(number);
        
        Print.print("\nYour number is: " + number  + result + "\n");
    }
}
