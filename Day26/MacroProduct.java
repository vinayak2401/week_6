/*Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents
 a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.*/
import java.util.ArrayList;
class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}


class PointOfSale {
  private ArrayList<Product> products;

  public PointOfSale() {
    products = new ArrayList<Product>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public double getTotalCost() {
    double totalCost = 0;
    for (Product product : products) {
      totalCost += product.getPrice() * product.getQuantity();
    }
    return totalCost;
  }
}
class PointOfSaleSystem {
  public static void main(String[] args) {
    PointOfSale pos = new PointOfSale();
    Product product1 = new Product("Coca-Cola", 1.50, 10);
    Product product2 = new Product("Fanta", 1.50, 5);
    Product product3 = new Product("Sprite", 1.50, 7);
    pos.addProduct(product1);
    pos.addProduct(product2);
    pos.addProduct(product3);

    System.out.println("Total cost: Rs " + pos.getTotalCost());

    pos.removeProduct(product2);
    product1.setQuantity(5);

    System.out.println("Total cost after removing is: Rs "+pos.getTotalCost());
  }
}
