import java.util.Scanner;

public class Problem02_SymmethricNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String numberToString;
        for (int i=start; i<=end; i++){
            numberToString = Integer.toString(i);
            char firstDigit = numberToString.charAt(0);
            char lastDigit = numberToString.charAt(numberToString.length()-1);

            if (i<10||firstDigit==lastDigit){
                System.out.println(i);
            }
        }
    }
}
