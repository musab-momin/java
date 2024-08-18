package Taskify;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import Taskify.Enums.OperationsEnum;

import Taskify.Exceptions.WrongActionException;

public class Operations {
    private final static Map<OperationsEnum, String> optionsList = new LinkedHashMap<OperationsEnum, String>();

    static {
        optionsList.put(OperationsEnum.VIEW_TASK_LIST, "1: View Task list");
        optionsList.put(OperationsEnum.ADD_NEW_TASK, "2: Add New Task");
        optionsList.put(OperationsEnum.CHANGE_STATUS, "3: Change Status of Task");
    }

    public void printActions() {
        for (String action : optionsList.values()) {
            System.out.println(action);
        }
    }

    public OperationsEnum takeActionInput() {

        OperationsEnum ae = null;
        Scanner sc = new Scanner(System.in);
        try {
            while (ae == null) {
                System.out.println();
                System.out.println("Select action by typing number: ");
                try {
                    int selectedActionIndx = sc.nextInt();
                    if (selectedActionIndx > 3 || selectedActionIndx <= 0) {
                        throw new WrongActionException("Please select valid option.");
                    }
                    Object[] arr = Operations.optionsList.keySet().toArray();
                    ae = (OperationsEnum) arr[selectedActionIndx - 1];
                } catch (WrongActionException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Please select valid option.");
                    sc.next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ae;
    }

    public OperationsEnum startAction() {
        printActions();
        OperationsEnum selectedAction = takeActionInput();
        return selectedAction;
    }

    public static Map<OperationsEnum, String> getOptionslist() {
        return optionsList;
    }
}
