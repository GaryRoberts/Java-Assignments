
package implementation;

import interfaces.CarInterface;
import javax.swing.JOptionPane;
import abstraction.Car;

/**
 *
 * @author Gary Roberts 20152131 Lauriann Comrie 20161630
 */
public class CarImpl extends Car implements CarInterface{
     @Override
     public void printDetails()
    {
        JOptionPane.showMessageDialog(null,
               "Car Code:"+getCarCode()
               +"\n Car Name:"+getCarName()
               +"\n Car Model(year):"+getCarModel() 
               +"\n\n Unit Cost: " + getCarCost() 
               + "\n Amount in stock: " + getCarStack()
               + "\nCar Description: " + getCarDescription(),
               "Details of on individual car", 
          JOptionPane.INFORMATION_MESSAGE);
    }  

    @Override
    public void printDetails(abstraction.Car per) {
           JOptionPane.showMessageDialog(null,per.toString(),
               "Details of an individual Car", 
          JOptionPane.INFORMATION_MESSAGE);
    }
    
}
