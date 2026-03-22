import java.util.*;

class Cart {
    Map<Product, Integer> items = new HashMap<>();

    public void add(Product p, int qty) {
        items.put(p, items.getOrDefault(p, 0) + qty);
    }

    public void showCart() {
        for (Map.Entry<Product, Integer> e : items.entrySet()) {
            System.out.println(e.getKey().name + " x " + e.getValue());
        }
    }

    public double getTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> e : items.entrySet()) {
            total += e.getKey().price * e.getValue();
        }
        return total;
    }
}
