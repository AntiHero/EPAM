import java.util.Random;

public class Heads_n_Tails {
    private final static int NUMBER_OF_SIDES = 2;

    public static String calcHeadsTails(int number_of_throws) throws Exception {

        InvalidException.isInvalidException(number_of_throws);

        int heads = 0;
        int tails = 0;
        int side = 0;

        Random random = new Random();

        for (int i = 1; i <= number_of_throws; i++) {
            side = random.nextInt(NUMBER_OF_SIDES);

            if (side == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        return "You threw the coin for: " + number_of_throws + " times." + " Heads: " + heads + " Tails: "
                  + tails;
    }

}
