import java.util.Random;

public class MoodSensor {
    public static String Mood() {
        String result = "No face :(";
        
        final int MAX = 10;
        
        Random random = new Random();
        
        int mood = random.nextInt(MAX + 1);
     
        if (mood == 0) {
            result = mood + " T_T  ";
        }
        else if (mood == 1) {
            result = mood + " (>.<)  ";
            
        }
        else if (mood == 2) {
            result = mood + " <(..<) ";
            
        }
        else if (mood == 3) {
            result = mood + " :-{";
            
        }
        else if (mood == 4) {
            result = mood + " ( o_o)  ";
            
        }
        else if (mood == 5) {
            result = mood + " :-]  ";
            
        }
        else if (mood == 6) {
            result = mood + " :->";
            
        }
        else if (mood == 7) {
            result = mood + " O:-) ";
            
        }
        else if (mood == 8) {
            result = mood + " <{^-^}> ";
            
        }
        else if (mood == 9) {
            result = mood + " =D";
            
        }
        else if (mood == 10) {
            result = mood + " =^w^= ";
            
        }
        
        return result;
    }

}
