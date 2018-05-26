
public class NumberSwapping {
    public static void swapTwoNum(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.printf("after swapping a is %d, b is %d", a, b);
    }
}
