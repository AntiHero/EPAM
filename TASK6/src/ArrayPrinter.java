import java.util.Arrays;

public class ArrayPrinter {
    public static String print(double[][] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {
            result += Arrays.toString(array[i]) + "\n";
        }
        return result;
    }

}
