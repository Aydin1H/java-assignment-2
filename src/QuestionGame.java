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
    private QuestionPicker questions; 
    private int currentQuestion = 0;
    
    public QuestionGame(){
        questions = new QuestionPicker();
    }
    
   public String getCurrentVulnerability() {
        return questions.getVulnerability(currentQuestion);
    }

    // Get the 3 choices for the current vulnerability
    public String[] getCurrentChoices() {
        return questions.getChoices(currentQuestion);
    }

    // Check if the selected answer is correct
    public boolean isCorrect(String selectedChoice) {
        String correct = questions.getCorrectAnswer(currentQuestion);
        return selectedChoice.equals(correct);
    }

    // Move to the next question
    public void nextQuestion() {
        if (currentQuestion < 9) {
            currentQuestion++;
        }
    }

    // Check if the game is finished
    public boolean isFinished() {
        return currentQuestion >= 9;
    }

    // Get the current question number (for GUI)
    public int getCurrentQuestionNumber() {
        return currentQuestion ++ ; // So it shows 1-based index in UI
    }
}
