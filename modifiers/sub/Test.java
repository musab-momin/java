package modifiers.sub;

public class Test {
    Blueprint bp;

    public Test() {
        this.bp = new Blueprint();
    }

    void accessor() {
        System.out.println(bp.x);
    }

}
