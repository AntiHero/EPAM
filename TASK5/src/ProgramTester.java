import java.util.Arrays;

public class ProgramTester {
    public static void maxElementTest(){
        int size = 5;
        int[] array = new int[size];
        ArrayInitializer.initArray(array, -10, 10);
        
        String result = "Max value in array " + Arrays.toString(array) + " is: " + OneDimentionalArray.findMaxElement(array);
        View.print(result);
    }
    
    public static void minElementTest() {
        int size = 5;
        int[] array = new int[size];
        ArrayInitializer.initArray(array, -10, 10);
        
        String result = "\nMin value in array " + Arrays.toString(array) + " is: " + OneDimentionalArray.findMinElement(array);
        View.print(result);
    }

    public static void findArithmTest() {
        int size = 5;
        int[] array = new int[size];
        ArrayInitializer.initArray(array, -10, 10);
        
        String result = "\nArithmetic average of array " + Arrays.toString(array) + " is: "
                            + OneDimentionalArray.findArithmeticAvr(array);
        View.print(result);
    }
    
    public static void findGeomTest() {
        int size = 5;
        int[] array = new int[size];
        ArrayInitializer.initArray(array, -10, 10);
        
        String result = "\nGeometric average of array " + Arrays.toString(array) + " is: "
                            + OneDimentionalArray.findGeomAvr(array);
        View.print(result);
    }

    public static void isSortedAscTest() {
        int[] array = {0, 1, 2, 3, 4, 5, 6};

        String result = "\nArray " + Arrays.toString(array) + " is sorted in ascending order: "
                            + OneDimentionalArray.isSortedAsc(array);
        View.print(result);
    }

    public static void isSortedDescTest() {
        int[] array = {-1, -2, -3, -5};

        String result = "\nArray " + Arrays.toString(array) + " is sorted in descending order: "
                        + OneDimentionalArray.isSortedDesc(array);
        View.print(result);
    }

    public static void isLocalMinimumTest() {
        int[] array = {8, 5, -6, 6, 9};

        String result = "\nArray is " + Arrays.toString(array) + " Its local minimum has index : "
                        + OneDimentionalArray.findLocalMinimumPosition(array);
        View.print(result);
    }

    public static void isLocalMaximumTest() {
        int[] array = {0, 3, 6, 5, 8, 0};

        String result = "\nArray is " + Arrays.toString(array) + " Its local minimum has index : "
                + OneDimentionalArray.findLocalMaximumPosition(array);
        View.print(result);
    }

    public static void makeReverseTest() {
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 0};

        String result = "\nArray is " +  Arrays.toString(array) + " Reversed array is: "
                            + OneDimentionalArray.makeReverseArray(array);
        View.print(result);
    }


}
