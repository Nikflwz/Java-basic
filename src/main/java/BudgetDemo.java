import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BudgetDemo {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(199.99);
        prices.add(1847.35);
        prices.add(1222.99);
        prices.add(1999.33);
        prices.add(999.99);

        double budget = 5000.0;
        double total = 0;

        for (Double price : prices) {
            total += price;
        }

        System.out.println("Общая сумма всех товаров: " + total + " рублей.");

        if (budget >= total) {
            System.out.printf(Locale.US,"Бюджета хватает! Остаток: %.2f рублей.%n", budget - total);
        } else {
            System.out.printf(Locale.US, "Не хватает: %.2f рублей!%n", total - budget);
        }
    }
}
