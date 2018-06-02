
public class Algorithms {
    public static int findMaxNatural(int number) {
        int max_value = 0;

        boolean check = check(number);

        if (check) {
            int length = String.valueOf(number).length();

            for (int i = 0; i < length; i++) {
                if (number % 10 >= max_value) {
                    max_value = number % 10;
                    number /= 10;
                }
            }
        }
        return max_value;
    }

    
    public static String findPalindrome(int number) {
        String result = "It's not a palindrome!";

        int reverse = 0;
        int remainder = 0;
        int palindrome = number;

        boolean check = check(number);

        if (check) {
            while (palindrome != 0) {
                remainder = palindrome % 10;
                reverse = 10 * reverse + remainder;
                palindrome /= 10;
            }
            if (number == reverse) {
                result = "It's a palindrome!";
            }
        }
        return result;
    }

    
    public static String isSimpleNatural(int number) {
        String result = "Invalid number!";

        boolean check = check(number);

        if (check) {
            for (int i = 2; i <= number; i++) {
                if (i != number) {
                    if (number % i == 0) {
                        result = "Not a simple natural!";
                        break;
                    }
                } 
                else {
                    result = "Simple natural!";
                }
            }
        }
        return result;
    }

    
    public static String findSimpNatDivider(int number) {
        String result = "Invalid number!";

        boolean check = checkZero(number);

        if (check) {
            result = "";
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    for (int j = 2; j <= i; j++) {
                        if (i != j) {
                            if (i % j == 0) {
                                break;
                            }
                        } 
                        else {
                            result += j + " ";
                        }
                    }
                }
            }
        }
        return result;
    }

    
    public static String findGCD(int number_1, int number_2) {
        String result = "LCM and GCD not found! ";
        int operand_1 = number_1;
        int operand_2 = number_2;

        if (checkZero(operand_1) && checkZero(operand_2)) {
            if (operand_1 != operand_2) {
                while (operand_1 != operand_2) {
                    if (operand_1 > operand_2) {
                        operand_1 -= operand_2;
                    } 
                    else {
                        operand_2 -= operand_1;
                    }
                }
            }
            result = "GCD is: " + operand_1 + ", LCD is: " + number_1 * number_2 / operand_1;
        }
        return result;
    }

    
    public static int findDifDigits(int number) {
        int result = 0;
        int remainder = 0;

        int num_0 = 0;
        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        int num_4 = 0;
        int num_5 = 0;
        int num_6 = 0;
        int num_7 = 0;
        int num_8 = 0;
        int num_9 = 0;

        boolean check = check(number);

        if (check) {
            int length = String.valueOf(number).length();

            while (length > 0) {
                remainder = number % 10;
                
                switch (remainder) {
                case 0:
                    num_0++;
                    if (num_0 > 1) {
                        num_0 = 1;
                    }
                    break;
                case 1:
                    num_1++;
                    if (num_1 > 1) {
                        num_1 = 1;
                    }
                    break;
                case 2:
                    num_2++;
                    if (num_2 > 1) {
                        num_2 = 1;
                    }
                    break;
                case 3:
                    ++num_3;
                    if (num_3 > 1) {
                        num_3 = 1;
                    }
                    break;
                case 4:
                    num_4++;
                    if (num_4 > 1) {
                        num_4 = 1;
                    }
                    break;
                case 5:
                    num_5++;
                    if (num_5 > 1) {
                        num_5 = 1;
                    }
                    break;
                case 6:
                    num_6++;
                    if (num_6 > 1) {
                        num_6 = 1;
                    }
                    break;
                case 7:
                    num_7++;
                    if (num_7 > 1) {
                        num_7 = 1;
                    }
                    break;
                case 8:
                    num_8++;
                    if (num_8 > 1) {
                        num_8 = 1;
                    }
                    break;
                case 9:
                    num_9++;
                    if (num_9 > 1) {
                        num_9 = 1;
                    }
                    break;
                }
                
                number /= 10;
                length--;
            }
            
            result = num_0 + num_1 + num_2 + num_3 + num_4 + num_5 + num_6 + num_7 + num_8 + num_9;
        }
        
        return result;
    }
    

    public static boolean check(int number) {
        boolean result = true;

        if (number < 0) {
            result = false;
        }
        return result;
    }
    

    public static boolean checkZero(int number) {
        boolean result = true;

        if (number <= 0) {
            result = false;
        }
        return result;
    }
}
