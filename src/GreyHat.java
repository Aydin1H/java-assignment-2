/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Class inherited by Hacker class. Meant to be what a grey hat would do
 * @author 342335817
 */
public class GreyHat extends Hacker{
    
    public GreyHat(String name){
        super(name);
    }
    
    public GreyHat(){
        super();
    }
    
    // Overrides the result method
    /*
    * This method gives 2 results for being a grey hat hacker
    * @return String - returns a string message
    */
    @Override
    public String result(){
        if (Math.random() < 0.5){
            setMoney(2000);
            return name + " has reported the exploit to the company and was rewarded 2000";
        }
        else {
            setMoney(-500);
            return name + " has reported the exploit to the company but was penalized due to going against TOS and lost 500";
        }
    }
}
