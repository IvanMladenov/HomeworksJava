import sun.invoke.empty.Empty;

import java.util.Scanner;

public class Problem01_GenerateThreeLettersWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letters = scanner.next();
        generateCombinations(letters, 3, "");
    }

    private static void generateCombinations(String letters, int lenght, String output) {

        char[] array = letters.toCharArray();

        for (int i = 0; i < letters.length(); i++) {

            if (lenght == 0) {
                System.out.print(output + " ");
                break;
            }
            generateCombinations(letters, lenght - 1, output + Character.toString(array[i]));
        }
    }
}
