/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tpss8
 */

import java.io.*;

public class History {

    public History() {
    }

    // Returns the entire score history as a single string (formatted with line breaks)
    public String getScoreHistory() {
        StringBuilder history = new StringBuilder();

        File file = new File("score.txt");
        if (!file.exists()) {
            return "Score history not found.";
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.append(line).append("<br>");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "Cannot access file";
        }

        return "<html>" + history.toString() + "</html>";
    }
}

