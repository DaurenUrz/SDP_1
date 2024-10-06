class Product implements Cloneable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product originalProduct = new Product("Laptop", 1000.00);
        Product clonedProduct = (Product) originalProduct.clone();

        clonedProduct.setPrice(900.00);

        System.out.println("Original: " + originalProduct);
        System.out.println("Cloned: " + clonedProduct);
    }
}