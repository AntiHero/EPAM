
public class Perfect_Number {
    public static String isPerfectNumber(int number) {
        String result = "Invalid number!";
        int divider = 0;
        
        boolean check = Algorithms.checkZero(number);
     
        if (check) {
            for (int i = 1; i < number; i++) {  
                if (number%i == 0) {
                     divider += i;
                 }
            }
            if (number == divider) {
                result = ". It's a perfect number!";
            }
            else {
                result = ". Not a perfect number!";
            }
        }
        return result;
    }  
}
