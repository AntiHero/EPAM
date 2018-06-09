
public class TwoDimentionalArray {
    // min number of rows and columns of matrix to find local minimun and maximum
    private final static int MIN_ROWS = 3;
    private final static int MIN_COLUMNS = 3;

    public static double findMaxElement(double[][] array) {
        double max = 0.;

        if (array.length < 1 || isColumnLengthZero(array)) {
            max = -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static double findMinElement(double[][] array) {
        double min = 0.;

        if (array.length < 1 || isColumnLengthZero(array)) {
            min = -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                    }
                }
            }
        }
        return min;
    }

    public static double findArithmeticAvr(double[][] array) {
        double sum = 0.;

        if (array.length < 1 || isColumnLengthZero(array)) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (double element : array[i]) {
                    sum += element;
                }
            }
        }

        return sum / (array.length * array[0].length);
    }

    public static double findGeomAvr(double[][] array) {
        double multiple = 1.;

        if (array.length < 1 || isNegative(array) || isColumnLengthZero(array)) {
            return -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (double element : array[i]) {
                    multiple *= element;
                }
            }
        }
        return Math.pow(multiple, 1.0 / (array.length * array[0].length));
    }

    /*
     * This method finds local minimum. Element at local minimum should have 4
     * neighbours.
     */
    public static String findLocalMinimumPosition(double[][] array) {
        String result = "-1";

        if (array.length >= MIN_ROWS && array[0].length >= MIN_COLUMNS) {
            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 1; j < array[i].length - 1; j++) {
                    if (array[i - 1][j] > array[i][j] 
                            && array[i][j] < array[i][j - 1] 
                                    && array[i + 1][j] > array[i][j]
                                            && array[i][j] < array[i][j + 1]) {
                        result = "i = " + i + ", j = " + j;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static String findLocalMaximumPosition(double[][] array) {
        String result = "-1";

        if (array.length >= MIN_ROWS && array[0].length >= MIN_ROWS) {
            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 1; j < array[i].length - 1; j++) {
                    if (array[i - 1][j] < array[i][j] 
                            && array[i][j] > array[i][j - 1] 
                                    && array[i + 1][j] < array[i][j]
                                            && array[i][j] > array[i][j + 1]) {
                        result = "i = " + i + ", j = " + j;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static String transposeMatrix(double[][] array) {

        if (array.length < 1 || isColumnLengthZero(array)) {
            return "-1";
        } else if (array.length != array[0].length) {
            double[][] temp = new double[array[0].length][array.length];

            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp[i].length; j++) {
                    temp[i][j] = array[j][i];
                }
            }
            return ArrayPrinter.print(temp);
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array[i].length; j++) {
                    if (i != j) {
                        array[i][j] += array[j][i];
                        array[j][i] = array[i][j] - array[j][i];
                        array[i][j] -= array[j][i];
                    }
                }
            }
        }
        return ArrayPrinter.print(array);
    }

    public static boolean isNegative(double[][] array) {
        boolean result = false;

        for (int i = 0; i < array.length; i++)
            for (double element : array[i]) {
                if (element < 0) {
                    result = true;
                    break;
                }
            }
        return result;
    }

    public static boolean isColumnLengthZero(double[][] array) {
        boolean result = false;

        for (int i = 0; i < array.length; i++)
            if (array[i].length == 0) {
                result = true;
                break;
            }
        return result;
    }
}
