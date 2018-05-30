
public class ProgramTester {
    public static void triangleTest() {

        // A coordinates (x1, y1)
        int x1 = 1;
        int y1 = 7;

        // B coordinates (x2, y2)
        int x2 = 0;
        int y2 = 0;

        // C coordinates (x3, y3)
        int x3 = 2;
        int y3 = 0;

        String result = Triangle.findTriangle(x1, y1, x2, y2, x3, y3);

        View.print("*Triangle*");
        View.print("\n" + result + "\n");
    }

    public static void dragonTest() {
        int dragon_age = 3;
        int dragon_heads = Dragon.getDragonHeads(dragon_age);
        int dragon_eyes = Dragon.getDragonEyes(dragon_heads);

        String result = "Dragon's heads: " + dragon_heads + " Dragon's eyes: " + dragon_eyes;

        View.print("\n*Dragon*");
        View.print("\n" + result + "\n");
    }

    public static void vowelTest() {
        char letter = 'l';

        String result = "blank";
        // result = Vowels.isVowel(letter);
        // result = Vowels.isVowel_Else_If(letter);
        // result = Vowels.isVowel_Switch(letter);
        result = Vowels.isVowel_Dec(letter);

        View.print("\n*Vowels*");
        View.print("\n" + result + "\n");
    }

    public static void moodSesnosrTest() {
        String result = MoodSensor.Mood();

        View.print("\n*MoodSensor*");
        View.print("\n" + result + "\n");
    }

    public static void calendarTest() {
        int day = 7;
        int month = 7;
        int year = 2007;

        String result = Calendar.calcNextDate(day, month, year);

        View.print("\n*Calendar*");
        View.print("\n" + result + "\n");
    }
}
