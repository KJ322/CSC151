/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberprocessor;

import javax.swing.JOptionPane;
/**
 *
 * @author jacksonk3717
 */
public class NumberProcessor 
{
    
    // Convert String into Integer (or -1 if error)
    public Integer process(String input) 
    {
        // -1 means error in this program
        Integer value = -1;
        // try / catch
        try 
        {
            // Convert String to Integer
            value = Integer.parseInt(input); 
        }
        catch (NumberFormatException e) 
        {
            System.err.println(input + " is not an Integer!");
        }
        return value;
    }
    
    public static void main(String[] args) 
    {
        // Bake the class into an object so we can use it
        NumberProcessor g = new NumberProcessor();
        
        //variables
        int playerNumber;
        int low = 1;
        int high = 100;
        int guess = (low + high) / 2;
        final int TOO_LOW = 1;
        final int TOO_HIGH = 2;
        final int CORRECT = 3;
        boolean keepPlaying = true;
        
        
        //guess a number
        g.say("Pick a number between 1 and 100 and I'll guess it!");
        playerNumber = g.getInteger();
        
        while (keepPlaying)
        {
            g.say("Is it " + guess + "?");
            g.say("Enter 1 for too low, 2 for too high, 3 for correct");
            Integer feedback = g.getInteger();
        
            if (feedback ==  TOO_LOW)
            {
                low = guess;
                guess = (low + high) / 2;
            }
            else if (feedback == TOO_HIGH)
            {
                high = guess;
                guess = (low + high) / 2;
            }
            else if (feedback == CORRECT)
            {
                g.say("I win!");
                keepPlaying = false;
                if (guess != playerNumber)
                {
                    g.say("Wait a minute...are you pulling my leg?");
                }
            }
            else
            {
                g.say("I don't even know what's happening. Bye!");
                keepPlaying = false;
            }
        }
    }
    
    public Integer getInteger() 
    {
        String userInput = JOptionPane.showInputDialog("Enter an integer:");
        Integer result = this.process(userInput); // only allow ints
        // Show the answer, or a decent error message
        if (result != -1) 
        {
            JOptionPane.showMessageDialog(null, result);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, userInput + " is not an Integer!");
            result = this.getInteger();
        }      
        return result;
    }
    
    public void say(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    }
}
