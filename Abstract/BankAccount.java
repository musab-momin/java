package Abstract;

public abstract class BankAccount {
    protected double balance;

    public final void getBalance() {
        System.out.println("Available balance is: " + this.balance);
    }

    protected abstract void creditAmount(double amount);

    protected abstract void withDrawn(double amount);

    // we can provide implementation of abstract using inner class also
    public class DefaultImplementation extends BankAccount {

        @Override
        protected void creditAmount(double amount) {

        }

        @Override
        protected void withDrawn(double amount) {

        }
    }
}
