
package subclasses;

import address.Address;
import java.sql.Time;
import java.util.Date;
import javax.swing.JOptionPane;
import superclasses.Person;

/**
 *
 * @author Gary Roberts
 */
public final class Visitor extends Person{
    private Date dateOfVisit;
    private Date timeOfVisit;

    public Visitor(String fname, String lname, String gender, Date DOB, Address address,Date DOV,Date TOV) {
        super(fname, lname, gender, DOB, address); 
        this.dateOfVisit=DOV;
        this.timeOfVisit=TOV;
    }

    
   @Override
     public void printDetails() {
      JOptionPane.showMessageDialog(null,
      " School deatils: School name:"+super.getName()+"\n Phone number:"+super.getTelephone()+"\n Email:"+super.getEmail()+"\n\n"+         
      "First Name: " + super.getFirstName()
      + "\nLast Name: " + super.getLastName()
      + "\nGender: " + super.getGender()
      + "\nDate of Birth: " + super.getDateOfBirth()
      + "\nDate of Visit: " + getDateOfVisit()
      + "\nTime of birth: " + getTimeOfVisit()        
      + "\nAddress: " + super.getAddress(),
      "Sub-Class (Visitor)", 
      JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * @return the dateOfVisit
     */
    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    /**
     * @param dateOfVisit the dateOfVisit to set
     */
    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    /**
     * @return the timeOfVisit
     */
    public Date getTimeOfVisit() {
        return timeOfVisit;
    }

    /**
     * @param timeOfVisit the timeOfVisit to set
     */
    public void setTimeOfVisit(Time timeOfVisit) {
        this.timeOfVisit = timeOfVisit;
    }
    
    
}
