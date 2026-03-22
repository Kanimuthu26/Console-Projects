import java.util.*;

class CustomerService {
    List<Product> products;

    CustomerService(List<Product> products) {
        this.products = products;
    }

    public Product findProduct(int id) {
        for (Product p : products) {
            if (p.id == id) return p;
        }
        return null;
    }

    public void processPayment(User user, Cart cart) {
        double total = cart.getTotal();

        if (total > user.credit) {
            System.out.println("Insufficient credit.");
            return;
        }

        user.credit -= total;

        if (total >= 5000) {
            user.credit += 100;
        } else {
            user.points += (int)(total / 100);
            if (user.points >= 50) {
                user.credit += 100;
                user.points = 0;
            }
        }

        System.out.println("Payment successful.");
    }
}
