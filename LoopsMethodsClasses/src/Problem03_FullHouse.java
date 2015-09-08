import java.util.Arrays;

/**
 * Created by ivan on 9/2/2015.
 */
public class Problem03_FullHouse {
    public static void main(String[] args) {
        char clubsSign = (char) '\u2663';
        char spadesSign = (char) '\u2660';
        char heartsSign = (char) '\u2764';
        char diamondsSign = (char) '\u2666';

        String[] clubsSet = generateSuitSet(clubsSign);
        String[] spadesSet = generateSuitSet(spadesSign);
        String[] heartsSet = generateSuitSet(heartsSign);
        String[] diamondSet = generateSuitSet(diamondsSign);

        int count = 0;
        String[] three = new String[4];
        String[] two = new String[6];
        for (int i = 0; i < 13; i++) {
            three = generateThreeSet(clubsSet[i], spadesSet[i], heartsSet[i], diamondSet[i]);
            for (int j = 0; j < 13; j++) {
                if (j == i) {
                    continue;
                }
                two = generateTwoSet(clubsSet[j], spadesSet[j], heartsSet[j], diamondSet[j]);
                for (int threeIndex = 0; threeIndex < three.length; threeIndex++) {
                    for (int twoIndex = 0; twoIndex < two.length; twoIndex++) {
                        String fullHouse = three[threeIndex] + " " + two[twoIndex];
                        System.out.printf("(%s) ", fullHouse);
                        System.out.println();
                        count++;
                    }

                }

            }

        }
        System.out.println(count);
    }

    private static String[] generateTwoSet(String currentClub, String currentSpade, String currentHeart, String currentDiamond) {
        String[] currentSet = {
                currentClub + " " + currentSpade,
                currentClub + " " + currentHeart,
                currentClub + " " + currentDiamond,
                currentSpade + " " + currentHeart,
                currentSpade + " " + currentDiamond,
                currentHeart + " " + currentDiamond
        };

        return currentSet;
    }

    private static String[] generateThreeSet(String currentClub, String currentSpade, String currentHeart, String currentDiamond) {
        String[] currentSet = {
                currentClub + " " + currentSpade + " " + currentHeart,
                currentClub + " " + currentSpade + " " + currentDiamond,
                currentClub + " " + currentHeart + " " + currentDiamond,
                currentSpade + " " + currentHeart + " " + currentDiamond
        };
        return currentSet;
    }

    private static String[] generateSuitSet(char suit) {
        String[] currentSet = {
                "2" + suit,
                "3" + suit,
                "4" + suit,
                "5" + suit,
                "6" + suit,
                "7" + suit,
                "8" + suit,
                "9" + suit,
                "10" + suit,
                "J" + suit,
                "Q" + suit,
                "K" + suit,
                "A" + suit
        };

        return currentSet;
    }
}