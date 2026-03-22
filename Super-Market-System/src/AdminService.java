import java.util.*;

class AdminService {
    List<Product> products;

    AdminService(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void viewProducts() {
        for (Product p : products) {
            System.out.println(p.id + " " + p.name + " " + p.price + " Qty:" + p.quantity);
        }
    }
}
