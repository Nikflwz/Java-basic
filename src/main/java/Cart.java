import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            int currentQuantity = products.get(product);
            products.put(product, currentQuantity + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }

    public int getProductCount() {
        int total = 0;
        for (int quantity : products.values()) {
            total += quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Product milk = new Product("Молоко", 80.0);
        Product bread = new Product("Хлеб", 40.0);
        Product eggs = new Product("Яйца", 120.0);
        Product cheese = new Product("Сыр", 350.0);

        Cart cart = new Cart();

        cart.addProduct(milk, 2);
        cart.addProduct(bread, 1);
        cart.addProduct(eggs, 10);
        cart.addProduct(cheese, 1);
        cart.addProduct(milk, 2);

        System.out.println("Всего товаров: " + cart.getProductCount());
        System.out.println("Общая сумма: " + cart.getTotalPrice());
    }
}
