
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Imports
import java.io.*;
import java.util.*;

/**
 * This class is to pick 10 questions to use. It gets the 10 vulnerabilities and their exploits and their correct exploit
 * @author 342335817
 */
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
            InputStream incorrectStream = getClass().getClassLoader().getResourceAsStream("vulnerabilities_scrambled.txt");
            BufferedReader writerIncorrect = new BufferedReader(new InputStreamReader(incorrectStream));

            String line; // line to store string
            
            // Store all lines in list
            while ((line = writerIncorrect.readLine()) != null){
                allLines.add(line);
            }
            
            // Mix up lines
            Collections.shuffle(allLines);
            List<String> randomLines = allLines.subList(0, 10);
            
            // Put mixed up vulnerablities in array
            for (int i = 0; i < 10; i++) {
                final String[] arr = randomLines.get(i).split(",");
                vuls[i] = arr[0]; // vulnerability
                for (int j = 0; j < 3; j++) {
                    choices[i][j] = arr[j + 1]; // 3 choices
                }
            }
            
            // Close file
            writerIncorrect.close();
            
            // For correct file
            List<String> correctLines = new ArrayList<>();
            
            // Open file
            InputStream CorrectStream = getClass().getClassLoader().getResourceAsStream("vulnerabilities_correct.txt");
            BufferedReader writerCorrect = new BufferedReader(new InputStreamReader(CorrectStream));
            
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
    /*
    * Method to get vulnerability
    * @param index - gets index to select vulnerability
    * @return String - returns the vulnerability
    */
    
     public String getVulnerability(int index) {
        if (index >= 0 && index < vuls.length) {
            return vuls[index];
        }
        return null;
    }
    
    /*
    * Get all 3 exploit choices for a given question
    * @param questionIndex - gets the index
    * @return String[] - returns the 3 choices
    */
    public String[] getChoices(int questionIndex) {
        if (questionIndex >= 0 && questionIndex < choices.length) {
            return choices[questionIndex];
        }
        return new String[] {}; // return empty array if invalid
    }

    /*
    * Get the correct answer (exploit) for a given question
    * @param index - gets the index of the answer
    * @return String - gets the correct choice
    */
    public String getCorrectAnswer(int index) {
        if (index >= 0 && index < correctChoices.length) {
            return correctChoices[index];
        }
        return null;
    }
}
