package Taskify;

import Taskify.Enums.OperationsEnum;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>> WELLCOME TO TASKIFY: A CLI TODO APP <<<");
        System.out.println();
        System.out.println();

        // Start the application by taking action from user
        Operations ac = new Operations();
        OperationsEnum e = ac.startAction();

        Actions opObject = new Actions(e);
        opObject.selectOperation();

    }

}
