/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Andrew
 */
public class Overview extends JPanel implements MouseListener {

    JLabel slotArray[];
    
    public Overview() {
        slotArray = new JLabel[9];
      
        for (int i = 0; i < slotArray.length; i++) {
            slotArray[i] = new JLabel();
            slotArray[i].setPreferredSize(new Dimension(150, 150));

            slotArray[i].setBackground(Color.gray);
            slotArray[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
            slotArray[i].setOpaque(true);
            slotArray[i].setVisible(true);
            slotArray[i].addMouseListener(this);
            slotArray[i].setLayout(new GridLayout(3, 3, 6, 6));
            this.add(slotArray[i]);
        }

        this.setBackground(new Color(129, 0, 130));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        for(int i=0;i<slotArray.length;i++)
        {
        if (e.getSource().equals(slotArray[i])) {
            slotArray[i].setBackground(Color.red);
            slotArray[i].setIcon(new ImageIcon("laptop.png"));
            JFrame addLaptopFrame = new JFrame();
            AddNewLaptop addNewLaptop = new AddNewLaptop();
            
            addLaptopFrame.setVisible(true);
            addLaptopFrame.setSize(300,300);
            addLaptopFrame.add(addNewLaptop);
            
            
        }}
//        if (e.getSource().equals(slotArray[1])) {
//            slotArray[1].setBackground(Color.green);
//        }
//        if (e.getSource().equals(slotArray[2])) {
//            slotArray[2].setBackground(Color.blue);
//        }
//        if (e.getSource().equals(slotArray[3])) {
//            slotArray[3].setBackground(Color.yellow);
//        }
//        if (e.getSource().equals(slotArray[4])) {
//            slotArray[4].setBackground(Color.red);
//        }
//        if (e.getSource().equals(slotArray[5])) {
//            slotArray[5].setBackground(Color.green);
//        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // NO ACTION
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // NO ACTION
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource().equals(slotArray[0])) {
            slotArray[0].setBackground(Color.red);
        }
        if (e.getSource().equals(slotArray[1])) {
            slotArray[1].setBackground(Color.green);
        }
        if (e.getSource().equals(slotArray[2])) {
            slotArray[2].setBackground(Color.blue);
        }
        if (e.getSource().equals(slotArray[3])) {
            slotArray[3].setBackground(Color.yellow);
        }
        if (e.getSource().equals(slotArray[4])) {
            slotArray[4].setBackground(Color.red);
        }
        if (e.getSource().equals(slotArray[5])) {
            slotArray[5].setBackground(Color.green);
        }
        if (e.getSource().equals(slotArray[6])) {
            slotArray[6].setBackground(Color.red);
        }
        if (e.getSource().equals(slotArray[7])) {
            slotArray[7].setBackground(Color.red);
        }
        if (e.getSource().equals(slotArray[8])) {
            slotArray[8].setBackground(Color.red);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (int i = 0; i < slotArray.length; i++) {
            if (e.getSource().equals(slotArray[i])) {
                slotArray[i].setBackground(Color.gray);
            }
            
        }
    }
}

