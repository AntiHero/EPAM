package by.epam.java.preTraining.Task10;

import by.epam.java.preTraining.Task10.util.*;

public class ProjectTester {
    public static void calcPowerTest() {
        double number = Randomizer.makeRand(5.);
        int power = (int)Randomizer.makeRand(2.);
        
        View.print("-----------Power----------");
        View.print("Number: " + number + ", Power: " + power + ", Result: " + Recursion.calcPower(number, power));
        
    }
    
    public static void calcSumOfDigitsTest() {
        int number = (int)Randomizer.makeRand(1000);
        
        View.print("\n------Sum Of Digits------");
        View.print("Number: " + number + ", Sum: " + Recursion.calcSumOfDigits(number));
    }
    
    public static void equalsTest() {
        //int number = (int)Randomizer.makeRand(100);
        //int sum = (int)Randomizer.makeRand(100);
        
        int number = 358;
        int sum = 16;
        
        View.print("\n--------Equals--------");
        View.print("First number: " + number + ", Pseudo sum: " + sum + ", Equals?:" + Recursion.equals(number, sum));
    }
    
    public static void fibonacciTest() {
        int index = (int)Randomizer.makeRand(20);
        
        View.print("\n------Fibonacci number------");
        View.print("Index: " + index + " Fibonacci number: " + Recursion.getFibonacciNum(index));
    }
    
}
