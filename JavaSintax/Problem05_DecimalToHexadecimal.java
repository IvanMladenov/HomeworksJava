import java.util.Scanner;

public class Problem05_DecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberToConvert = scanner.nextInt();
        String hexadecimal = Integer.toHexString(numberToConvert);

        System.out.println(hexadecimal);
    }
}
