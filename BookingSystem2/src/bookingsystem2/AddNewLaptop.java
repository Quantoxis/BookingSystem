/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem2;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Andrew
 */
public class AddNewLaptop extends JPanel implements ActionListener {

    JButton confirm;
    JButton cancel;

    JLabel firstNamePrompt;
    JLabel surnamePrompt;
    TextField firstNameIn;
    TextField surnameIn;
    JLabel daysBookedPrompt;
    JComboBox daysBookedCombo;
    JLabel oSPrompt;
    JComboBox oSCombo;
    
    Laptop l;
    Overview ov;

    public AddNewLaptop() {

        //make JPanel visible
        this.setVisible(true);
        l = new Laptop(0,0,"",0);
        ov = new Overview();
        confirm = new JButton("confirm");
        cancel = new JButton("cancel");

        firstNamePrompt = new JLabel("First name: ");
        surnamePrompt = new JLabel("Surname: ");
        daysBookedPrompt = new JLabel("Days to lease: ");
        firstNameIn = new TextField(8);
        surnameIn = new TextField(12);
        Integer daySelect[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        daysBookedCombo = new JComboBox<>(daySelect);
        oSPrompt = new JLabel("Operating System: ");

        String oSSelect[] = {"Windows", "Linux", "macOS"};
        oSCombo = new JComboBox<>(oSSelect);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        
        this.add(firstNamePrompt);
        this.add(firstNameIn);
        this.add(surnamePrompt);
        this.add(surnameIn);
        this.add(daysBookedPrompt);
        this.add(oSPrompt);
        this.add(oSCombo);
        this.add(daysBookedPrompt);
        this.add(daysBookedCombo);
        this.add(confirm);
        this.add(cancel);

        oSCombo.addActionListener(this);
        daysBookedCombo.addActionListener(this);
        confirm.addActionListener(this);
       
    
       this.add(Box.createRigidArea(new Dimension(100,100)));
    
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == confirm) {

         
            String fName = firstNameIn.getText();
            String sName = surnameIn.getText();
            l.setName(fName + " " + sName);
            System.out.println(l.getName());
            l.getName();
            Object os = oSCombo.getSelectedItem();
            Object db = daysBookedCombo.getSelectedItem();
            String osin = os.toString();
            int dbin = (int)db;
            l.setOS(osin);
            l.setNoDays(dbin);
            l.setId(0);
            System.out.println(l.getOS());
            System.out.println(l.getNoDays());
            System.out.println(l.getId());
            insertLaptopWithSQL();
        }
    }
    
    public  void insertLaptopWithSQL()
    {
        try (
            //create an object to connect to database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3036/equipmentdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "myuser", "xxxx");
            //create a statement object to send SQL to the mySQL db
            Statement statement = connection.createStatement();) {
            
            
            //execute  a SQL INSERT query 
            String stringInsert = "INSERT INTO equipmentdb VALUES ("+l.getOS()+","+l.getNoDays()+","+l.getId()+")";
            ResultSet resultSet = statement.executeQuery(stringInsert);
            System.out.println(stringInsert);
            int rowCount = 0;
            //moves cursor to next row or returns false if reached end
            while (resultSet.next()) {
                String os = resultSet.getString("os");
                
                System.out.println(os);
                ++rowCount;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    
}


