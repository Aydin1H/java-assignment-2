/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342335817
 */
public class WhiteHat extends Hacker {
    
    public WhiteHat(String name){
        super(name);
    }
    
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
