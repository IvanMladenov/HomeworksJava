import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Problem10_OrderProducts {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Products.txt");
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

            //Collections.sort(products);
            BufferedReader reader2 = new BufferedReader(new FileReader("Order.txt"));

            line = reader2.readLine();

            BigDecimal total = new BigDecimal(0);
            while (!Objects.equals(line, "") &&line!=null) {
                line = line.trim();
                String[] splitet = line.split(" ");
                BigDecimal quantity = new BigDecimal(splitet[0]);
                String currentProduct = splitet[1];
                for (Product product : products) {
                    if (product.getName().equals(currentProduct)){
                        BigDecimal currentProductPrice = product.getPrice();
                        BigDecimal currentOrderTotal=quantity.multiply(currentProductPrice);
                        total = total.add(currentOrderTotal);
                    }
                }
                line = reader2.readLine();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            writer.write(total.toString());

            reader.close();
            buffer.close();
            writer.close();
            reader2.close();

        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
