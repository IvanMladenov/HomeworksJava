import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem05_AngleUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputLines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfInputLines; i++) {
            String line = scanner.nextLine();
            String[] currentLine = line.split(" ");
            String unitToConvert = currentLine[1];
            double angle = Double.parseDouble(currentLine[0]);

            String output = "";

            switch (unitToConvert){
                case "rad":
                    double degrees = (angle*180)/Math.PI;
                    output = String.format("%.6f", degrees);
                    break;
                case "deg":
                    double radians = (angle/180)*Math.PI;
                    output = String.format("%.6f", radians);
                    break;
            }

            System.out.println(output);

        }
    }
}
