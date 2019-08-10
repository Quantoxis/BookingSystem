/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem2;

import javax.swing.ImageIcon;

/**
 *
 * @author Andrew
 */
public class Laptop extends Equipment {
        
    private int id;
    private String name;
    private String eN;
    private String os;
    private double charge;
    private int days;


    public void setLaptop(int id, String name, String o, double c, int d) {
        id = id;
        eN = equipmentName;
        o = os;
        c = charge;
        d = days;
    }

    public Laptop(int i, double c, String o, int d) {
        super();
        //id
        id = i;
        //equipment name
        String eN = "";
        //os
        String os = o;
        //pass the  charge in £ here
        charge = c;
        //pass the number of days rented here
        days = d;
    }
    public int getId()
    {
        return id;
    }
    
    public void setId(int newId)
    {
        newId+=1;
        this.id = newId;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    public String getEN() {
        return eN;
    }
    
    public String getOS()
    {
        return os;
    }
    
    public void setOS(String newOS)
    {
        this.os = newOS;
    }

    public double getCharge() {
        return charge;
    }
    
    public void setCharge(double newCharge)
    {
        this.charge = newCharge;
    }

    public int getNoDays() {
        return days;
    }
    
    public void setNoDays(int newNoDays)
    {
        this.days = newNoDays;
    }

    ImageIcon getImage() {
        return new ImageIcon("laptop.png");
    }


}
