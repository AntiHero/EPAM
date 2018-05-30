
public class Vowels {
    public static String isVowel(char letter) {
        String result = "Not a vowel!";
        if (letter == 'a' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'y' 
                ||letter == 'A'|| letter == 'I' || letter == 'O' || letter == 'U' || letter == 'E' || letter == 'Y') {
            result = "It's a vowel!";
        }
        return result;
    }

    public static String isVowel_Else_If(char letter){
        String result = "Not a vowel!";
        
        if (letter == 'a') {
            result = "It's 'a' vowel!";
        }
        else if (letter == 'o') {
            result = "It's 'o' vowel!";
        }
        else if (letter == 'e') {
            result = "It's 'e' vowel!";
        }
        else if (letter == 'i') {
            result = "It's 'i' vowel!";
        }
        else if (letter == 'u') {
            result = "It's 'u' vowel!";
        }
        else if (letter == 'y') {
            result = "It's 'y' vowel!";
        }
        else if (letter == 'A') {
            result = "It's 'A' vowel!";
        }
        else if (letter == 'O') {
            result = "It's 'O' vowel!";
        }
        else if (letter == 'E') {
            result = "It's 'E' vowel!";
        }
        else if (letter == 'I') {
            result = "It's 'I' vowel!";
        }
        else if (letter == 'U') {
            result = "It's 'U' vowel!";
        }
            
        else if (letter == 'Y') {
            result = "It's 'Y' vowel!";
        }
        return result;
    
            
    }
    
    public static String isVowel_Switch(char letter) {
        String result;
        
        switch (letter) {
            case 'a': 
            case 'o':
            case 'i':
            case 'e':
            case 'u':
            case 'y':
            case 'A':
            case 'O':
            case 'I':
            case 'E':
            case 'U':
            case 'Y':
                result = "It's a vowel!";
                break;
            default:
                result = "Not a vowel!";
        }
        return result;
    }
    
    public static String isVowel_Dec(char letter) {
        String result = "Not a vowel!";
        
        int ch = (int)letter;
        
        // vowels are represented in their decimal values e.g 'a' = 97, 'A' = 65 etc.
        if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 89 
                || ch == 97 || ch == 101 || ch == 105 || ch == 111 || ch == 117 || ch == 121)  {
            result = "It's a vowel!";
        }
        return result;
    }
    
   
    
   
    
    

}
