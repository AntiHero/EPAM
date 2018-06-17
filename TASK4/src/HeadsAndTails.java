import java.util.Random;

public class HeadsAndTails {
    private final static int NUMBER_OF_SIDES = 2;

    public static String calcHeadsTails(int numberOfThrows) throws Exception {

        InvalidException.isInvalidException(number_of_throws);

        int heads = 0;
        int side = 0;

        Random random = new Random();

        for (int i = 1; i <= numberOfThrows; i++) {
            side = random.nextInt(NUMBER_OF_SIDES);

            if (side == 0) {
                heads++;
            } 
        }
        return "You threw the coin for: " + numberOfThrows + " times." + " Heads: " + heads + " Tails: "
                  + numberOfThrows - heads;
    }

}
