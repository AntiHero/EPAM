
public class Dragon {
    public static int getDragonHeads(int dragon_age) {
        final int DRAGON_AGE_300 = 300;
        final int DRAGON_AGE_200 = 200;

        final int DRAGONS_HEADS_AFTER_0 = 3;
        final int DRAGONS_HEADS_AFTER_200 = 2;
        final int DRAGONS_HEADS_AFTER_300 = 1;

        int dragon_heads = 0;

        // we add 1 because we also count the year when dragon was born
        int total_heads_200 = (DRAGON_AGE_200 + 1) * DRAGONS_HEADS_AFTER_0; 
        
        int total_heads_300 = total_heads_200 + DRAGONS_HEADS_AFTER_200 * (DRAGON_AGE_300 - DRAGON_AGE_200);

        if (dragon_age >= 0) {
            if (dragon_age >= DRAGON_AGE_300) {
                dragon_heads = total_heads_300 + DRAGONS_HEADS_AFTER_300 * (dragon_age - DRAGON_AGE_300);
            } 
            else if (dragon_age >= DRAGON_AGE_200) {
                dragon_heads = total_heads_200 + DRAGONS_HEADS_AFTER_200 * (dragon_age - DRAGON_AGE_200);
            } 
            else {
                dragon_heads = (dragon_age + 1) * DRAGONS_HEADS_AFTER_0;
            }
        }
        return dragon_heads;
    }

    public static int getDragonEyes(int dragon_heads) {
        final int DRAGON_EYES = 2;

        return dragon_heads * DRAGON_EYES;
    }

}
