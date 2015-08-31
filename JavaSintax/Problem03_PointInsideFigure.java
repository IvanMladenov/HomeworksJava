import java.util.Scanner;

public class Problem03_PointInsideFigure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (insideBigRectangle(x, y)) {
            if (!insideSmallRectangle(x, y)) {
                System.out.println("Inside");
                return;
            }
        }

        System.out.println("Outside");
    }

    private static boolean insideSmallRectangle(double x, double y) {

        if (x > 17.5 && x < 20) {
            if (y > 13.5 && y < 8.5) {
                return true;
            }
        }

        return false;
    }

    private static boolean insideBigRectangle(double x, double y) {

        if (x >= 12.5 && x <= 22.5) {
            if (y <= 13.5 && y >= 6) {
                return true;
            }
        }
        return false;
    }
}
