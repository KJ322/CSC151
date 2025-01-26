/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jackson_k_arearec_011625_01;
import javax.swing.JOptionPane;
/**
 *
 * @author jacksonk3717
 */
public class Jackson_K_AreaRec_011625_01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Prompt the user to input the length and width of the rectangle
        String input = JOptionPane.showInputDialog("Enter the length and width of the rectangle, separated by a comma (e.g. 10,20): ");

        // Extract the length and width from the input string
        String[] values = input.split(",");
        double length = Double.parseDouble(values[0]);
        double width = Double.parseDouble(values[1]);

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the result to the user
        JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area + " square units.", "Rectangle Area Calculator", JOptionPane.INFORMATION_MESSAGE);

    }


}
