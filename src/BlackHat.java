/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Class inherited by Hacker class. Meant to be what a black hat would do
 * @author 342335817
 */

public class BlackHat extends Hacker{
    
    public BlackHat(String name){
        super(name); // Invokes the parents classes constructor method
    }
    
    public BlackHat(){
        super(); // Invokes the parents classes constructor method
    }
    
    // Overrides the result method
    /*
    * This method gives 2 results for being a black hat hacker
    * @return String - returns a string message
    */
    @Override
    public String result(){
        // Uses math.random to get 2 different results 
        if (Math.random() < 0.5){
            setMoney(10000);
            return name + " has successfully hacked the company and stole 10,000!";
        }
        else {
            setMoney(-10000);
            return name + " was caught trying to hack the company and got sued for 10,000!";
        }
    }
}
