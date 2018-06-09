
public class ProgramTester {
    public static void maxElementTest() {
        /*int row = 3;
        int col = 2;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, -10, 10);*/
        
        int row = 6;
        int col = 6;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, 0, 5);
        
        String result = "Max value in array: \n" + ArrayPrinter.print(array)
                            + "is: " + TwoDimentionalArray.findMaxElement(array) +"\n";
        View.print(result);
    }

    public static void minElementTest() {
        /*int row = 3;
        int col = 1;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, -10, 10);*/
        
        int row = 6;
        int col = 6;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, -25, 25);

        String result = "\nMin value in array: \n" + ArrayPrinter.print(array) + "is: "
                            + TwoDimentionalArray.findMinElement(array) +"\n";
        View.print(result);
    }

    public static void findArithmTest() {
        /*int row = 1;
        int col = 5;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, -10, 10);*/
        
        int row = 1;
        int col = 6;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, 0, 5);

        String result = "\nArithmetic average of array: \n" + ArrayPrinter.print(array) + "is: "
                            + TwoDimentionalArray.findArithmeticAvr(array) +"\n";
        View.print(result);
    }

    public static void findGeomTest() {
        /*int row = 2;
        int col = 2;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, 0, 10);*/
        
        int row = 3;
        int col = 3;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, 1, 3);
        
        String result = "\nGeometric average of array: \n" + ArrayPrinter.print(array) + "is: "
                            + TwoDimentionalArray.findGeomAvr(array) +"\n";
        View.print(result);
    }
    
    public static void isLocalMinimumTest() {
        /*int row = 6;
        int col = 6;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, 0, 10);*/
        
        //double[][] array = {{0, 1, 2, 3, 4}, {1, 2, 2, -3, 5}, {0, 1, 2, 7, 8}};
        
        int row = 6;
        int col =6;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, -10, 15);

        String result = "\nArray is: \n" + ArrayPrinter.print(array) + "Its local minimum has index : "
                            + TwoDimentionalArray.findLocalMinimumPosition(array) +"\n";
        View.print(result);
    }

    public static void isLocalMaximumTest() {
        /*int row = 6;
        int col = 6;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, 0, 10);*/
        
        double[][] array = {{0, 1, 2, 3, 4}, {1, 2, 3, -3, 5}, {0, 1, 2, 7, 8}};
        
        /*int row = 7;
        int col = 5;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, -10, 15);*/

        String result = "\nArray is: \n" + ArrayPrinter.print(array) + "Its local maximum has index : "
                            + TwoDimentionalArray.findLocalMaximumPosition(array) +"\n";
        View.print(result);
    }

    public static void makeTransparentTest() {
        int row = 4;
        int col = 5;
        
        double[][] array = new double[row][col];
        ArrayInitializerInt.initArray(array, 0, 10);
        
        /*int row = 2;
        int col = 2;
        
        double[][] array = new double[row][col];
        ArrayInitializerDouble.initArray(array, -5, 5);*/
        
        String result = "\nArray is: \n" + ArrayPrinter.print(array) + "\nTransposed matrix is : \n"
                            + TwoDimentionalArray.transposeMatrix(array);
        View.print(result);
    }
    
    
}
