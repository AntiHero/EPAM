import java.util.Arrays;

public class OneDimentionalArray {
    // number of minimal number of elements to find local minimum or maximum
    private final static int NUMBER_OF_MIN_ELEMENTS = 3;

    public static int findMaxElement(int[] array) {
        int max = 0;
        int size = array.length;

        if (size <= 1) {
            max = -1;
        } else {
            max = array[0];

            for (int i = 1; i < size; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }

        return max;
    }

    public static int findMinElement(int[] array) {
        int min = 0;
        int size = array.length;

        if (size <= 1) {
            min = -1;
        } else {
            min = array[0];

            for (int i = 1; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    public static double findArithmeticAvr(int[] array) {
        int sum = 0;
        int size = array.length;

        if (size <= 1) {
            return -1;
        } else {
            for (int element : array) {
                sum += element;
            }
        }

        return sum / (double) size;

    }

    public static double findGeomAvr(int[] array) {
        int multiple = 1;
        int size = array.length;

        if (size <= 1) {
            return -1;
        } else {
            for (int element : array) {
                multiple *= element;
            }
        }

        return (multiple > 0) ? Math.pow(multiple, 1.0 / size) : 0;
    }

    public static boolean isSortedAsc(int[] array) {
        boolean result = false;
        int size = array.length;

        if (!isSameElement(array) && !(array[0] > array[1])) {
            result = true;
            for (int i = 2; i < size; i++) {
                if (array[i] < array[i - 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isSortedDesc(int[] array) {
        boolean result = false;
        int size = array.length;

        if (!isSameElement(array) && !(array[0] < array[1])) {
            result = true;
            for (int i = 2; i < size; i++) {
                if (array[i] > array[i - 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static int findLocalMinimumPosition(int[] array) {
        int result = -1;
        int size = array.length;

        if (size >= NUMBER_OF_MIN_ELEMENTS) {
            for (int i = 1; i < size - 1; i++) {
                if (array[i - 1] > array[i] && array[i] < array[i + 1]) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static int findLocalMaximumPosition(int[] array) {
        int result = -1;
        int size = array.length;

        if (size >= NUMBER_OF_MIN_ELEMENTS) {
            for (int i = 1; i < size - 1; i++) {
                if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static String makeReverseArray(int[] array) {
        int size = array.length;

        int last_index = size - 1;

        if (size >= 1) {
            for (int i = 0; i < size / 2; i++) {
                array[i] = array[i] + array[last_index - i];
                array[last_index - i] = array[i] - array[last_index - i];
                array[i] = array[i] - array[last_index - i];
            }
        }
        return Arrays.toString(array);
    }

    public static boolean isSameElement(int[] array) {
        boolean result = true;
        int size = array.length;

        if (size >= 1) {
            for (int i = 1; i < size; i++) {
                if (array[i - 1] != array[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
