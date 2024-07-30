package Abstract;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000);

        savingsAccount.getBalance();
        savingsAccount.creditAmount(200);
        savingsAccount.getBalance();
        savingsAccount.withDrawn(600);
        savingsAccount.getBalance();
    }
}
