/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jacksonkatherine_hellogoodbye_013025_01;
import javax.swing.JOptionPane;
/**
 *
 * @author jacksonk3717
 */
public class JacksonKatherine_HelloGoodbye_013025_01 
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
    
}
