import java.util.Random;

public class Heads_n_Tails {
    public static String calcHeadsTails(int number_of_throws) {
        String result = "Enter a positive number! ";
        boolean check = Algorithms.check(number_of_throws);

        int heads = 0;
        int tails = 0;
        int side = 0;

        Random random = new Random();

        if (check) {
            for (int i = 1; i <= number_of_throws; i++) {
                side = random.nextInt(2);

                if (side == 0) {
                    heads++;
                }
                else {
                    tails++;
                }
            }
            result = "You threw the coin for: " + number_of_throws + " times." + " Heads: " + heads + " Tails: "
                    + tails;
        }
        return result;
    }

}
