/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This class uses association to get the 10 questions from the question picker and runs the game with each one. (Vulnerability and their exploits with the correct exploit)
 * @author 342335817
 */
public class QuestionGame {
    // Association 
    private final QuestionPicker questions; 
    
    // Variables
    private int currentQuestion = 0;
    
    public QuestionGame(){
        questions = new QuestionPicker();
    }
 
    /*
    * Check if the selected answer is correct
    * @param - gets the selected choice of the quesiton
    * @return boolean - returns if the answer is correct
    */
    public boolean isCorrect(String selectedChoice) {
        String correct = questions.getCorrectAnswer(currentQuestion);
        return selectedChoice.equals(correct);
    }
    
    /*
    * Moves to the next question
    */
    public void nextQuestion() {
        if (currentQuestion < 9) {
            currentQuestion ++;
        }
    }
    /*
    * Returns the current question number
    * @return int - current question plus 1
    */
    public int getCurrentQuestionNumber(){
        return (currentQuestion + 1);
    }
    
    /*
    * Check if the game is finished
    * @return boolean value 
    */
    public boolean isFinished() {
        return currentQuestion >= 9;
    }

    /*
    * Gets the vulnerability
    * @return the vulnerability
    */
    public String getVul(){
        return questions.getVulnerability(currentQuestion);
    }
    
    /*
    * Gets the choices
    * @return the string array of choices
    */
    public String[] getChoices(){
        return questions.getChoices(currentQuestion);
    }
    
    /*
    * Gets the correct answer
    * @return the answer
    */
    public String getAnswer(){
        return questions.getCorrectAnswer(currentQuestion);
    }
    
}
