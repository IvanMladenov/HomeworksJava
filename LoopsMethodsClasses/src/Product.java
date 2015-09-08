import java.math.BigDecimal;

public class Product implements Comparable<Product>{
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price){

        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String productName){
        this.name = productName;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        return this.getPrice().compareTo(product.getPrice());
    }
}
