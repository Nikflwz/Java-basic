public class MathHelper {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Сумма 10 и 5: " + MathHelper.sum(10, 5));
        System.out.println("Максимум из 10 и 5: " + MathHelper.max(10, 5));
        System.out.println("Число 10 чётное? " + MathHelper.isEven(10));
        System.out.println("Число 7 чётное? " + MathHelper.isEven(7));
    }
}
