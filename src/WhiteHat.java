/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Class inherited by Hacker class. Meant to be what a white hat would do
 * @author 342335817
 */
public class WhiteHat extends Hacker {
    
    public WhiteHat(String name){
        super(name);
    }
    
    public WhiteHat(){
        super();
    }
    
    // Overrides the result method
    /*
    * This method gives 2 results for being a white hat hacker
    * @return String - returns a string message
    */
    @Override
    public String result(){
        if (Math.random() < 0.5){
            setMoney(1000);
            return name + " has reported the exploit to the company and was rewarded 1000";
        }
        else {
            setMoney(500);
            return name + " has reported the exploit to the company and was rewarded 500";
        }
    }
}
