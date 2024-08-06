package Taskify;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> WELLCOME TO TASKIFY: A CLI TODO APP <<<");
        System.out.println();
        System.out.println();

        // Start the application by taking action from user
        Actions ac = new Actions();
        ActionsEnum e = ac.startAction();

    }

}
