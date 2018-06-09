

import java.util.Random;

public class ArrayInitializerInt {
    public static void initArray(double[][] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }
}
