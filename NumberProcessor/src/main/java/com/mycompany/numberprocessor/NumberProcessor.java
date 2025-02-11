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
/**
     * Processes a string input and attempts to convert it to an integer.This method demonstrates basic input validation and error handling. 
     * Things to consider:
 1. What should happen if the user enters nothing?
 2. What should happen if the user enters "abc"?
 3. What should happen if the user enters "3.14"?
     * 
     * @param input The string that should be converted to an integer
     * @param isDouble false by default
     * @return A message describing what happened during processing
     */
    public Integer process(String input, Boolean isDouble) 
    {
        //if we provide true as the second input, then give us a number
        
        
        // -1 means error in this program
        Integer value = -1;
        // Your code here
        //try / catch
        try
        {
            if (isDouble)
            {
                //convert string to double
                Double dValue = Double.parseDouble(input);
                //convert double to integer
                value = dValue.intValue();
            }
            else
            {
                //convert string to integer
                value = Integer.parseInt(input);
            }
            
        }
        catch (NumberFormatException e)
        {
            System.err.println(input + " is not an Integer");
        }
        return value;
    }

    public static void main(String[] args) 
    {
        NumberProcessor processor = new NumberProcessor();
        
        // Test Case 1: Ask for a number
        String userInput = JOptionPane.showInputDialog("Enter a whole number (ex 42):");
        Integer result = processor.process(userInput, false); // allows for double
        
        //show answer, or error message
        if (result != -1)
        {
           JOptionPane.showMessageDialog(null, result); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, userInput + " is not an Integer");
        }
        
        
        // Test Case 2: What happens with invalid input?
        userInput = JOptionPane.showInputDialog("Try entering something that isn't a whole number (ex 3.14):");
        result = processor.process(userInput, true);
        
        if (result != -1)
        {
            JOptionPane.showMessageDialog(null, result);
        }
        else
        {
            JOptionPane.showMessageDialog(null, userInput + " is not an Integer");
        }
    }
}
