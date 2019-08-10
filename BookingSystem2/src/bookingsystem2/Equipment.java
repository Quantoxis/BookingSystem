/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DecimalFormat;

/**
 *
 * @author Andrew
 */
public class Equipment implements Serializable {
    
    protected double charge;
    protected String equipmentName;
    public Equipment() {
        
    }
    
    Equipment(String eN)
    {
        charge = 0;
        equipmentName = eN;
    }
    
    //set charge to zero
    public double charge()
    {
        return charge;
    }
    
    public double calcCharge()
    {
        return charge;
    }
    
    public String toString(String eN, double calcCharge)
    {
        DecimalFormat d = new DecimalFormat("£0.00");
        return "Equipment: " + eN + " Charge: " + d.format(calcCharge());
    }
    
    void saveToFile(Laptop laptop/*, Camera camera, Printer printer, Projector projector*/) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("myFile.dat");
        try (ObjectOutputStream output = new ObjectOutputStream(fos))
        {
            output.writeObject(laptop);
        /**    output.writeObject(camera);
            output.writeObject(printer);
            output.writeObject(projector);
        **/
        }
    }
}
