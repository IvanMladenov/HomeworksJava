import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ivan on 04/09/2015.
 */
public class Problem07_DaysBetweenTwoDates {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        Date firstDate = dt.parse(first);
        Date secondDate = dt.parse(second);

        long difference = secondDate.getTime() - firstDate.getTime();
        long days = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

        System.out.println(days);
    }
}
