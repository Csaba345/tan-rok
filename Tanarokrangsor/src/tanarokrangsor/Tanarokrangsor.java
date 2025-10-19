/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tanarokrangsor;
/**
 *
 * @author csaba
 */
public class Tanarokrangsor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TanarokGUI frame = new TanarokGUI();
        frame.pack();             // ha szeretnéd automatikusan méretezni
        frame.setLocationRelativeTo(null); // középre
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
