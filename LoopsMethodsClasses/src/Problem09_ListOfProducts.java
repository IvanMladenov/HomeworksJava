import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Problem09_ListOfProducts {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Input.txt");
            BufferedReader buffer = new BufferedReader(reader);

            ArrayList<Product> products = new ArrayList<>();
            String line = buffer.readLine();

            while (!Objects.equals(line, "") &&line!=null) {
                line = line.trim();
                String[] splitet = line.split(" ");
                BigDecimal price = new BigDecimal(splitet[1]);
                products.add(new Product(splitet[0], price));
                line = buffer.readLine();
            }

            Collections.sort(products);

            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            String newLine = System.getProperty("line.separator");
            for (Product product : products) {
                writer.write(product.getPrice() + " " + product.getName() + newLine);
            }
            reader.close();
            buffer.close();
            writer.close();

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
