package Abstract;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super.balance = balance;
    }

    @Override
    protected void creditAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount of rupees: " + amount + " has been credited");
        } else {
            System.out.println("Provide a valid amount");
        }
    }

    @Override
    protected void withDrawn(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount of rupees: " + amount + " has been debited");
        } else {
            System.out.println("Insafient balance.");
        }
    }

}
