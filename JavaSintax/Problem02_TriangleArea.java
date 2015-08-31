import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Problem02_TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        int x3=scanner.nextInt();
        int y3=scanner.nextInt();

        double area = Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);
        if(area==0){
            System.out.println(0);
            return;
        }

        System.out.println(area);


    }

}
