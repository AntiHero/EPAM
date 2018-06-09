
import java.util.Random;

public class ArrayInitializerDouble {
    public static void initArray(double[][] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextDouble() * (max - min) + min;
            }
        }
    }
}
