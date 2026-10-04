import java.util.List;
import java.util.Locale;

public class BudgetShoppingDemo {
    public static void main(String[] args) {
        List<Double> prices = List.of(199.99, 1847.35, 1222.99, 1999.33, 999.99);

        double budget = 5000.0;
        int boughtCount = 0;
        double spent = 0;
        int index = 0;

        while (index < prices.size() && spent + prices.get(index) <= budget) {
            spent += prices.get(index);
            boughtCount++;
            index++;
        }

        double remaining = budget - spent;
        int notBought = prices.size() - boughtCount;

        System.out.printf(Locale.US,"Куплено: %d товара на сумму %.2f%n", boughtCount, spent);
        System.out.printf(Locale.US,"Остаток бюджета: %.2f%n", remaining);
        System.out.printf("Не куплено: %d товара%n", notBought);
    }
}
