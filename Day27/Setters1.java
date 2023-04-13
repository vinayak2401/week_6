class Product {
  private int pid;
  private double price;
  private int quantity;

  void setPid(int pid) {
    this.pid = pid;
  }

  void setPrice(double price) {
    this.price = price;
  }

  void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  int getPid() {
    return this.pid;
  }

  double getPrice() {
    return this.price;
  }

  int getQuantity() {
    return this.quantity;
  }
}

class Setters1 {
  public static void main(String args[]) {
    Product obj = new Product();
    obj.setPid(1);
    obj.setPrice(2000);
    obj.setQuantity(2);
    System.out.println("Product id: " + obj.getPid());
    System.out.println("Product Price: " + obj.getPrice());
    System.out.println("Product Quantity: " + obj.getQuantity());
  }
}