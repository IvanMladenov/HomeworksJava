import java.util.Scanner;

public class Problem04_SmalestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirthNumber = scanner.nextDouble();

        double smallest = Double.min(Double.min(firstNumber, secondNumber), thirthNumber);

        System.out.println(smallest);
    }
}
