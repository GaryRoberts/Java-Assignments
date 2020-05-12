
package implementations;
import abstraction.Person;
import interfaces.PersonInterface;
import javax.swing.JOptionPane;


/**
 *
 * @author Gary Roberts
 */
public class PersonImpl extends Person implements PersonInterface{

    @Override
    public void printDetails() {
        JOptionPane.showMessageDialog(null,
               " School deatils: School name:"+getName()+"\n Phone number:"+getTelephone()+"\n Email:"+getEmail()+ 
               "\n\nFirst Name: " + getFirstName() 
               + "\nLast Name: " + getLastName()
               + "\nDate of Birth: " + getDateOfBirth()
               + "\nGender: " + getGender()   
               + "\nAddress: " + getAddress(),
               "Details of on individual", 
          JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     *Method used to print the details of an object passed and is if type person
     * @param per
     */
    @Override
    public void printDetails(Person per) {
         JOptionPane.showMessageDialog(null,per.toString(),
               "Details of on individual", 
          JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     *Prints the contacts details of the school
     */
    @Override
    public void contactDetails() {
          JOptionPane.showMessageDialog(null,
             "School deatils: School name:"+getName()
             +" Phone number:"+getTelephone()
             +" Email:"+getEmail(),
             "Contact Details of School", 
      JOptionPane.INFORMATION_MESSAGE);
    }
 
}
