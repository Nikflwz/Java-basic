public class BankAccount {
    private String ownerName;
    private double balance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс не может быть отрицательным");
            return;
        }
        this.balance = balance;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setOwnerName("Nikita");
        account.setBalance(1000);
        System.out.println("Баланс после первого сеттера: " + account.getBalance());

        account.setBalance(-500);
        System.out.println("Баланс после второго сеттера: " + account.getBalance());

    }
}