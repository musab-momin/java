package MethodOverriding;

public class SavingsAccount extends BankAccount {
    private int withdrawalLimit;
    private int withdrawalsMade;

    public SavingsAccount(double balance, int withdrawalLimit) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
        this.withdrawalsMade = 0;
    }

    // Here we are overriding the withdrawl method and writing our own
    // implementation
    @Override
    public void withdrawl(double amount) {
        if (withdrawalsMade < withdrawalLimit) {
            super.withdrawl(amount);
            if (balance >= amount) {
                withdrawalsMade += 1;
            }
        } else {
            System.out.println("Withdrawl limit has been exided");
        }
    }

}
