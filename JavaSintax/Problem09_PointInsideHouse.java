import java.util.Scanner;

public class Problem09_PointInsideHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double inputX = scanner.nextDouble();
        double inputY = scanner.nextDouble();

        //Triangle points coordinates
        double x1 = 12.5, y1 = 8.5;//A
        double x2 = 17.5, y2 = 3.5;//B
        double x3 = 22.5, y3 = 8.5;//C

        double ABC = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        double ABP = Math.abs(x1 * (y2 - inputY) + x2 * (inputY - y1) + inputX * (y1 - y2));
        double APC = Math.abs(x1 * (inputY - y3) + inputX * (y3 - y1) + x3 * (y1 - inputY));
        double PBC = Math.abs(inputX * (y2 - y3) + x2 * (y3 - inputY) + x3 * (inputY - y2));

        boolean isInTriangle = ABP + APC + PBC == ABC;

        if (isInTriangle) {
            System.out.println("Inside");
        } else {

            if (isIntBigRectangle(inputX, inputY)) {
                System.out.println("Inside");
            } else {
                System.out.println("Outside");
            }
        }


    }

    private static boolean isIntBigRectangle(double inputX, double inputY) {

        if ((inputX >= 12.5 && inputX <= 22.5) && (inputY > 8.5 && inputY <= 13.5)) {
            if (!isInSmallRectangle(inputX, inputY)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isInSmallRectangle(double inputX, double inputY) {

        if (inputX > 17.5 && inputX < 20) {
            if (inputY > 8.5 && inputY < 13.5) {
                return true;
            }
        }
        return false;
    }
}
