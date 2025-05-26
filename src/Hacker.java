/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This class serves as the parent class which other subclasses will inherit
 * @author 342335817
 */
public class Hacker {
    // Name and money variables
    protected String name;
    private static int money = 0;
    
    public Hacker(String name){
        this.name = name;
    }
    
    public Hacker(){
        this.name = "Unknown";
    }
    
    /*
    * Setter method for name
    * @param name - gets the user's name
    */
    public void setName(String name){
        this.name = name;
    }
    
    /*
    * Setter method to put/take money from user
    * @param m - money to add to the account
    */
    public void setMoney(int m){
        money += m;
    }
    
    /*
    * Setter method to reset money to zero
    */
    public void zeroMoney(){
        money = 0;
    }
    
    /*
    * Getter method for money
    * @return money - returns the amount of money
    */
    public int getMoney(){
        return money;
    }
    
    /*
    * Method to be overriden
    * @return String - returns that the exploit was successful
    */
    public String result(){
        return "Successful exploit";
    }
}
