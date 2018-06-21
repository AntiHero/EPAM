package by.epam.java.preTraining.Task10.util;

import java.util.Random;

public class Randomizer {
    public static double makeRand(double number) {
        if (number < 0) {
            return -1;
        }

        Random random = new Random();

        return random.nextDouble()*number + 1;
    }
}
