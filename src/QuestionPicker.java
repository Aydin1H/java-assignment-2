
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This class is to pick 10 questions to use. It gets the 10 vulnerabilities and their exploits and their correct exploit
 * @author 342335817
 */

import java.io.*;
import java.util.*;

public class QuestionPicker {
    // Array to store the questions and answers
    private String vuls[] = new String[10];
    private String choices[][] = new String[10][3];
    private String correctChoices[] = new String[10];
    
    public QuestionPicker() {
        try {
            
            // For incorrect file
            // Create empty array to store the lines
            List<String> allLines = new ArrayList<>();
            // Open the file
            BufferedReader writerIncorrect = new BufferedReader(new FileReader("vulnerabilities_scrambled.txt"));
            String line;
            
            // Store all lines in file
            while ((line = writerIncorrect.readLine()) != null){
                allLines.add(line);
            }
            
            // Mix up lines
            Collections.shuffle(allLines);
            List<String> randomLines = allLines.subList(0, 10);

            for (int i = 0; i < 10; i++) {
                String[] arr = randomLines.get(i).split(",");
                vuls[i] = arr[0]; // vulnerability
                for (int j = 0; j < 3; j++) {
                    choices[i][j] = arr[j + 1]; // 3 choices
                }
            }
            
            // Close file
            writerIncorrect.close();
            
            // For correct file
            List<String> correctLines = new ArrayList<>();
            BufferedReader writerCorrect = new BufferedReader(new FileReader("vulnerabilities_correct.txt"));
            
            // Store all lines in the array
            while ((line = writerCorrect.readLine()) != null) {
                correctLines.add(line);
            }
            
            
            // Match the lines with the random lines selected
             for (int i = 0; i < 10; i++) {
                String vul = vuls[i];
                for (String correctLine : correctLines) {
                    if (correctLine.startsWith(vul + ",")) {
                        correctChoices[i] = correctLine.split(",")[1];
                        break;
                    }
                }
            }
             
             // Close file
             writerCorrect.close();
            
        }
        
        // Catch statement
        catch (Exception e){
            System.out.println("Unable to access file");
        }
    }
    
    // Method to get vulnerability
     public String getVulnerability(int index) {
        if (index >= 0 && index < vuls.length) {
            return vuls[index];
        }
        return null;
    }
     
    // Get all 3 exploit choices for a given question
    public String[] getChoices(int questionIndex) {
        if (questionIndex >= 0 && questionIndex < choices.length) {
            return choices[questionIndex];
        }
        return new String[] {}; // return empty array if invalid
    }

    // Get the correct answer (exploit) for a given question
    public String getCorrectAnswer(int index) {
        if (index >= 0 && index < correctChoices.length) {
            return correctChoices[index];
        }
        return null;
    }
}
