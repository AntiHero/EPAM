
public class ProgramTester {
    public static void equalNumbersTest() {
        int a = 2;
        int b = 2;
        int c = 5;
        
        System.out.print("\"Equal Numbers(Task1)\"\n");
        
        System.out.printf("Numbers a = %d and b = %d are %s\n", a, b, EqualNumbers.compareTwoNumbers(a, b));
        System.out.printf("Numbers b = %d and c = %d are %s\n", b, c, EqualNumbers.compareTwoNumbers(b, c));
        System.out.printf("Numbers c = %d and a = %d are %s\n", c, a, EqualNumbers.compareTwoNumbers(c, a));
    }
    
    public static void dinosaurTest() {
        int weight = 11;

        System.out.print("\n\"Dinosaur(Task2)\"\n");
        
        int kilos = Dinosaur.tonsToKilos(weight);
        int grams = Dinosaur.tonsToGrams(weight);

        System.out.printf("Dinosaur weights %d kilos\n", kilos);
        System.out.printf("Dinosaur weights %d grams\n", grams);
    }

    public static void circlesTest() {
        double r1 = 8.0;
        double r2 = 1.0;

        System.out.print("\n\"Circles(Task3)\"\n");
        
        double square = Circles.calcSquare(r1, r2);

        System.out.printf("Area of ring (inner radius = %.2f, outer radius = %.2f) is %.2f\n", r2, r1, square);
    }

    public static void numSequenceTest() {
        
        int number = 8765;    // number should be 4 digit

        System.out.print("\n\"4 Digital Number(Task4)\"");
        
       Sequence.makeDigits(number);
        
        System.out.printf("\nNumber sequence in %d is %s\n", number, Sequence.toDigitSequence());
    }

    public static void arithmGeomAvrTest() {
        
        int number = 111111;   // number should be 6 digit

        System.out.print("\n\"Arithmetic and Geometric Average(Task5)\"\n");
        
        ArithmGeomAvr.makeDigits(number);
        
        double arithmAvr = ArithmGeomAvr.calcArithmAvr();
        double geomAvr = ArithmGeomAvr.calcGeommAvr();

        System.out.printf("Arithmetic average of number %d is %.4f\n", number, arithmAvr);
        System.out.printf("Geometric average of number %d is %.4f\n", number, geomAvr);
    }

    public static void reverseTest() {
        int number = 5678934; // number should be 7 digit

        System.out.print("\n\"Reversing(Task6)\"\n");
        
        Reversing.makeDigits(number);
        
        int revNum = Reversing.invertNum(number);

        System.out.printf("Number is %d --> reversed number is %d\n", number, revNum);
    }
    
    public static void numberSwappingTest() {
        int a = 22;
        int b = 55;
        
        System.out.print("\n\"Number Swapping(Task7)\"\n");
                
        System.out.printf("a was %d, b was %d ", a, b);
        
        NumberSwapping.swapTwoNum(a, b);
    }
}
