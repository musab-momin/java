package Taskify;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Helper {

    public String getPublicDocumentPath() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            return "D:/Users/Public/Documents";
        } else if (os.contains("mac") || os.contains("nix") || os.contains("nux")) {
            return "/Users/Public/Documents";
        } else {
            throw new UnsupportedOperationException("Unsportted Operating System: " + os);
        }
    }

    public String getCurrentTimStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public String convertToJson(Map<String, String> data) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        data.forEach((key, value) -> {
            jsonBuilder.append("  \"").append(key).append("\": \"").append(value).append("\",\n");
        });
        // Remove the trailing comma and add closing curly bracket
        jsonBuilder.setLength(jsonBuilder.length() - 2); // Remove last comma
        jsonBuilder.append("\n}");
        return jsonBuilder.toString();
    }

    public void ensureDirectoryExists(String filePath) {
        File directory = new File(filePath);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Directory created: " + filePath);
            } else {
                System.out.println("Failed to create directory: " + filePath);
            }
        }
    }

    // Helper method to save the JSON string to a file
    public boolean saveToJsonFile(String jsonContent, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(jsonContent);
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
            e.printStackTrace();
            return false;
        }
    }

}
