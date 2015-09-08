import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem08_SumNumbersFromTextFile {
    public static void main(String[] args) throws IOException {
        try {
            FileReader reader = new FileReader("file.txt");
            BufferedReader buffer = new BufferedReader(reader);

            long sum = 0;
            String line = buffer.readLine();

            while (line != "" && line != null) {
                line.trim();
                long currentNumber = Long.parseLong(line);
                sum += currentNumber;
                line = buffer.readLine();
            }

            reader.close();
            buffer.close();
            System.out.println(sum);
        }catch (FileNotFoundException e){
            System.out.println("The file was not found");
        }
    }
}
