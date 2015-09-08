import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem06_RandomHandsOf5Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        char[] suits = {(char) '\u2663', (char) '\u2660', (char) '\u2764', (char) '\u2666'};
        String[] deck = new String[52];

        int count = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                deck[count] = values[j] + suits[i];
                count++;

            }

        }

        int numberOfHandsWanted = scanner.nextInt();
        for (int i = 0; i < numberOfHandsWanted; i++) {
            String[] randomHand = new String[5];
            for (int j = 0; j < 5; j++) {
                int randomIndex = rnd.nextInt(52);
                String currentCard = deck[randomIndex];
                if (Arrays.asList(randomHand).contains(currentCard)) {
                    j--;
                    continue;
                }
                randomHand[j] = currentCard;
            }
            System.out.println(Arrays.toString(randomHand));
        }


    }
}
