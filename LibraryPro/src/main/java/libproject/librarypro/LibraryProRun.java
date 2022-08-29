/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libproject.librarypro;

/**
 *
 * @author niamh
 */
public class LibraryProRun {
    public static void main( String args[] ){
        javax.swing.JFrame window = new javax.swing.JFrame("LibraryPro");
        window.getContentPane().add(new LibraryProGui());
        window.setVisible(true);
        window.pack();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
