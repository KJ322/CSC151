/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suno_joptionpan_012125_jackson_k;
import javax.swing.JOptionPane;
/**
 *
 * @author jacksonk3717
 */
public class Suno_JOptionPan_012125_Jackson_K {

    public static void main(String[] args) {
        //say hello in JOptionPane
        JOptionPane.showMessageDialog(null, "Suno Helper", "", JOptionPane.WARNING_MESSAGE);
        //I want the program to take words like "rap" and "phonk"
        //And the output is "rap, rap, rap, phonk"
        String firstGenre = JOptionPane.showInputDialog(null, "Enter a song genre: ");
        String secondGenre = JOptionPane.showInputDialog(null, "Enter another song genre: ");
    }
}
