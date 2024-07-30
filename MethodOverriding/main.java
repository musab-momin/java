package MethodOverriding;

class Main {
    public static void main(String[] args) {
        BankAccount normalAccount = new BankAccount(400);
        SavingsAccount savingsAccount = new SavingsAccount(1000, 3);

        // Normal account
        normalAccount.deposit(100);
        normalAccount.withdrawl(300);

        // Savings account
        System.out.println("\nSavings Account:");
        savingsAccount.deposit(500);
        savingsAccount.withdrawl(100);

        savingsAccount.withdrawl(100);
        savingsAccount.withdrawl(100);
        savingsAccount.withdrawl(100); // This should hit the limit

    }
}