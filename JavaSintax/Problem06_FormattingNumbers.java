import java.util.Scanner;

public class Problem06_FormattingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();

        String aInBinaryString = Integer.toBinaryString(a);
        int aInBinary = Integer.parseInt(aInBinaryString);

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a,aInBinary, b, c);




    }
}
