/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jacksonk_hellogoodbye_020425;
import javax.swing.JOptionPane;
/**
 *
 * @author jacksonk3717
 */
public class JacksonK_HelloGoodbye_020425 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String userName;
        
        userName = getName();
        greetUser(userName);
        String sectionCode = getSection();
        String result = buildResultMessage(sectionCode);
        printBreakdown(result);
        sayGoodbye(userName);
    }
    
    public static String getName()
    {
        /*
        Claude was used to write this method. 
        Prompt: I need a JAVA program that has methods using JOptionPane that ask the user their name
        Minor edits made by me
        */
        String userName = JOptionPane.showInputDialog(null, "What is your name? ", "", JOptionPane.QUESTION_MESSAGE);
        return userName;
    }
    
    public static void greetUser(String userName)
    {
        JOptionPane.showMessageDialog(null, "Hello, " + userName + "!", "", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void sayGoodbye(String userName)
    {
        JOptionPane.showMessageDialog(null, "Goodbye, " + userName + ". Thank you for using this program.", "", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String getSection ()
    {
        String sectionCode = JOptionPane.showInputDialog(null, "What is the section code? ", "", JOptionPane.QUESTION_MESSAGE);
        //Claude was used to write the following code
        //Minor edits made
        
        //validates input length
        if (sectionCode.length() != 4)
        {
            JOptionPane.showMessageDialog(null, "Section code not recognized. Code must be 4 digits long. Try again.", "", JOptionPane.ERROR_MESSAGE);
            getSection();
        }
        
        //if the user didn't enter anything
        if (sectionCode == null || sectionCode.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No section code entered. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            getSection();
        }
        
        return sectionCode;
    }
    
    public static String firstDigit(String sectionCode)
    {
        //Claude was used to write the following code
        //Prompt was: I need a java program that breaks down class section codes...It needs to have three methods...one for the first digit
        
        char firstDigit = sectionCode.charAt(0);
        return switch (firstDigit) {
            case '0' -> "16 Week";
            case '1' -> "1st Eight Week";
            case '2' -> "2nd Eight Week";
            case '3' -> "12 Week Session";
            case '5' -> "Off Cycle";
            case '6' -> "1st Four Week Session";
            case '7' -> "2nd Four Week Session";
            case '8' -> "3rd Four Week Session";
            case '9' -> "4th Four Week Session";
            default -> "Unknown Session";
        };
    }
    
    public static String secondDigit (String sectionCode)
    {
        //Claude was used to write the following code
        //Prompt was: I need a java program that breaks down class section codes...It needs to have three methods...one for the second digit
        
        char secondDigit = sectionCode.charAt(1);
        return switch (secondDigit) {
            case '0' -> "Main Campus";
            case '1' -> "Fort Bragg";
            case '3' -> "Spring Lake Center";
            case '4' -> "Botanical Garden Center";
            case '9' -> "Online";
            case 'B' -> "Blended (Hybrid)";
            case 'C' -> "Collision";
            case 'D' -> "Developmental/Support Co-requisite";
            case 'F' -> "Flex";
            case 'H' -> "High School - County";
            case 'L' -> "Learning Communities";
            case 'P' -> "High School - Polytech";
            case 'R' -> "Ford";
            case 'V' -> "Virtual Classroom";
            case 'X' -> "Off Campus";
            case 'Y' -> "HyFlex";
            default -> "Unknown Location/Type";
        };
    }
    
    public static String lastDigits(String sectionCode)
    {
        //Claude was used to write the following code
        //Prompt was: I need a java program that breaks down class section codes...It needs to have three methods...one for the last two digits
        
        String lastTwoDigits = sectionCode.substring(2);
        int number;
        try {
            number = Integer.parseInt(lastTwoDigits);
        } catch (NumberFormatException e) {
            return "Invalid class number";
        }
        
        if (number >= 1 && number <= 49) {
            return "Day class #" + number;
        } else if (number == 51) {
            return "Night class";
        } else if (number == 61) {
            return "Weekend class";
        } else {
            return "Course number " + number;
        }
    }
    
    public static String buildResultMessage(String sectionCode)
    {
        //Claude was used to write the followig program
        //Prompt: This is great! But I need the program to use JOptionPane to get the section code and print out the breakdown
        String result = String.format("""
            Section Code Analysis:
            ---------------------
            Code: %s
            Session: %s
            Location/Type: %s
            Class Info: %s""",
            sectionCode,
            firstDigit(sectionCode),
            secondDigit(sectionCode),
            lastDigits(sectionCode));
        return result;
    }
    
    public static String printBreakdown(String result)
    {
        JOptionPane.showMessageDialog(null, result, "Section Code Breakdown", JOptionPane.INFORMATION_MESSAGE);
        return result;
    }
    
    public static void runAgain(String userName)
    {
        String runAgain = JOptionPane.showInputDialog(null, "Do you have another section code to break down? Enter yes or no: ", "", JOptionPane.QUESTION_MESSAGE);
        
        if (runAgain.equalsIgnoreCase("yes"))
        {
            main();
        } 
        else
        {
            sayGoodbye(userName);
        }
    }
    
}
