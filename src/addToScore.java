import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tpss8
 */

public class addToScore {

    private static int count = 1;

    public addToScore() {
    }

    public void addScore(String name, int money) {
        String line = "Name: " + name + ", Game: " + count + ", Money: $" + money;

        String path = "score.txt"; 
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        count++;
    }
}

