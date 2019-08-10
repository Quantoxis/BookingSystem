/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem2;

import javax.swing.JFrame;

/**
 *
 * @author Andrew
 */
public class BookingSystem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myF = new JFrame();
        myF.setSize(600,800);
        myF.setVisible(true);
        myF.setResizable(true);
        myF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Overview myP = new Overview();
        myF.add(myP);
        
    }
    
}
