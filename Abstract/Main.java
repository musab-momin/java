package Abstract;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000);

        savingsAccount.getBalance();
        savingsAccount.creditAmount(200);
        savingsAccount.getBalance();
        savingsAccount.withDrawn(600);
        savingsAccount.getBalance();

        // we can provide abstract method implementation using anonymos inner class
        BankAccount currentAccount = new BankAccount() {
            private int withDrawCount;

            @Override
            protected void creditAmount(double amount) {
                if (amount < 0) {
                    return;
                } else {
                    if (amount > 5000) {
                        // add processing charges
                        amount -= 10;
                    }
                    balance += amount;
                }
            }

            @Override
            protected void withDrawn(double amount) {
                if (withDrawCount == 2) {
                    System.out.println("Withdrawl limit has been exided");
                    return;
                }
                if (amount > 0 && amount <= balance) {
                    balance += amount;
                    withDrawCount += 1;
                }
            }

        };

        currentAccount.getBalance();
        currentAccount.creditAmount(200);
        currentAccount.getBalance();
        currentAccount.withDrawn(200);
        currentAccount.withDrawn(200);
        currentAccount.withDrawn(200); // this will execeed limit

    }
}
