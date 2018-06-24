package by.epam.preTraining.Schemelev.task07.util;

import java.util.Random;

public class Randomizer {
    
    public static int makeRand(int number) {
        if (number < 0) {
            return -1;
        } 
        
        Random random = new Random();
        
        return random.nextInt(number + 1);
    }
    
    public static int makeRandString(String[] string) {
        if (string == null) {
            return -1;
        } 
        
        Random random = new Random();
        
        return random.nextInt(string.length);
    }
    
    public static int makeRandInRange(int min, int max) {
        if (min >= max) {
            return -1;
        } 
        
        Random random = new Random();
        
        return random.nextInt(max - min + 1) + min;
    }
}
