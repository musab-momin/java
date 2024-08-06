package Taskify;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import Taskify.Exceptions.WrongActionException;

enum ActionsEnum {
    VIEW_TASK_LIST,
    ADD_NEW_TASK,
    CHANGE_STATUS,
}

public class Actions {
    private final static Map<ActionsEnum, String> optionsList = new LinkedHashMap<ActionsEnum, String>();

    static {
        optionsList.put(ActionsEnum.VIEW_TASK_LIST, "1: View Task list");
        optionsList.put(ActionsEnum.ADD_NEW_TASK, "2: Add New Task");
        optionsList.put(ActionsEnum.CHANGE_STATUS, "3: Change Status of Task");
    }

    public void printActions() {
        for (String action : optionsList.values()) {
            System.out.println(action);
        }
    }

    public ActionsEnum takeActionInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Select action by typing number: ");
        int selectedActionIndx = sc.nextInt();

        try {
            if (selectedActionIndx > 3 || selectedActionIndx <= 0) {
                throw new WrongActionException("Please select valid option.");
            }

            Object[] arr = Actions.optionsList.keySet().toArray();
            return (ActionsEnum) arr[selectedActionIndx - 1];
        } catch (WrongActionException e) {
            System.out.println(e.getMessage());
            return takeActionInput();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return takeActionInput();
        } finally {
            sc.close();
        }
    }

    public ActionsEnum startAction() {
        printActions();
        ActionsEnum selectedAction = takeActionInput();
        return selectedAction;
    }

    public static Map<ActionsEnum, String> getOptionslist() {
        return optionsList;
    }
}
