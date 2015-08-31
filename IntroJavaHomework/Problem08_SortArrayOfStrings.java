import java.util.Arrays;
import java.util.Scanner;

public class Problem08_SortArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numberOfLines = Integer.parseInt(input);
        String[] cities = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            String currentLine = scanner.nextLine();
            cities[i] = currentLine;
        }

        Arrays.sort(cities);
        for (int i=0; i<numberOfLines; i++){

            System.out.println(cities[i]);
        }

    }
}
