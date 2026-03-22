import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Rice", 50, 100));
        products.add(new Product(2, "Milk", 30, 50));

        User user = new User("user@mail.com", "1234", "CUSTOMER");

        CustomerService cs = new CustomerService(products);
        Cart cart = new Cart();

        int choice;
        do {
            System.out.println("\n1.View Products 2.Add to Cart 3.View Cart 4.Pay 5.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    for (Product p : products) {
                        System.out.println(p.id + " " + p.name + " " + p.price);
                    }
                }
                case 2 -> {
                    System.out.print("Enter product id: ");
                    int id = sc.nextInt();
                    Product p = cs.findProduct(id);
                    if (p != null) {
                        System.out.print("Quantity: ");
                        cart.add(p, sc.nextInt());
                    }
                }
                case 3 -> cart.showCart();
                case 4 -> cs.processPayment(user, cart);
            }
        } while (choice != 5);
    }
}
