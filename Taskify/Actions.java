package Taskify;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import Taskify.Enums.OperationsEnum;

public class Actions {

    private OperationsEnum selectedOperation;
    private Helper helperObj;

    public Actions(OperationsEnum selectedOperationsEnum) {
        this.selectedOperation = selectedOperationsEnum;
        this.helperObj = new Helper();
    }

    public void handleTaskView() {
        String fileName = this.helperObj.getPublicDocumentPath() + "/task.json";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println();
            System.out.print("Title" + "               ");
            System.out.print("Message" + "               ");
            System.out.print("Status" + "               ");
            System.out.print("Created At" + "               ");
            System.out.print("Completed At" + "               ");
            System.out.println();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains(":")) {
                        String res = line.split(":")[1];
                        res = res.replaceAll(",", "");
                        System.out.print(res + "               ");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void handleTaskAddition() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Type task title: ");
            String title = br.readLine();

            System.out.println("Type task: ");
            String mssg = br.readLine();

            Map<String, String> taskInfo = new LinkedHashMap<String, String>();
            taskInfo.put("title", title);
            taskInfo.put("task", mssg);
            taskInfo.put("status", "PEDING");
            taskInfo.put("created at", this.helperObj.getCurrentTimStamp());
            taskInfo.put("completed at", "-");

            String taskJSON = this.helperObj.convertToJson(taskInfo);
            String filePath = this.helperObj.getPublicDocumentPath();
            this.helperObj.ensureDirectoryExists(filePath);

            boolean isSaved = this.helperObj.saveToJsonFile(taskJSON, filePath + "/task.json");

            if (isSaved) {
                System.out.println("Task has been saved!");
            } else {
                System.out.println("Something went wrong");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    private void handleTaskUpdate() {

    }

    public void selectOperation() {

        if (selectedOperation == OperationsEnum.ADD_NEW_TASK) {
            handleTaskAddition();
        } else if (selectedOperation == OperationsEnum.CHANGE_STATUS) {
            handleTaskUpdate();
        } else {
            handleTaskView();
        }
    }

}
