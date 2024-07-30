package FinalKeyword;

public final class AdvCalculator {
    private int x;

    public AdvCalculator(int x) {
        this.x = x;
    }

    public int getVariables() {
        System.out.println("Use final with class to prevent inheritance");
        return this.x;
    }
}
