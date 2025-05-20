/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342335817
 */
public class BlackHat extends Hacker{
    
    public BlackHat(String name){
        super(name);
    }
    
    @Override
    public String result(){
        if (Math.random() < 0.5){
            setMoney(10000);
            return name + " has successfully hacked the company and stole 10,000!";
        }
        else {
            zeroMoney();
            return name + " was caught trying to hack the company and got bankrupt for all their money";
        }
    }
}
