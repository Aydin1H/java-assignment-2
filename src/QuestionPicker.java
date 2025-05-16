
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This class is to pick 10 questions to use. It gets the 10 vulnerabilities and their exploits and their correct exploit
 * @author 342335817
 */

import java.io.*;

public class QuestionPicker {
    // Array to store the questions
    private String vuls[];
    private String choices[][];
    private String correctChoices[];
    
    public QuestionPicker {
        try {
            Filewriter writerCorrect = new Filewriter(new File(vulnerabilities_correct.txt));
            Filewriter writerIncorrect = new Filewriter(new File(vulnerabilities_scrambled.txt));
            
            while (writerIncorrect.hasNext()){
                String line = writerIncorrect.nextLine();
                String[] arr = line.split(",");
                vuls.append(arr[0]);
                
            }
            
        }
    
        catch (Exception e){
            System.out.println("Unable to access file");
        }
    }
}
