
package subclasses;

import address.Address;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import superclasses.Person;

/**
 *
 * @author Gary Roberts
 */
public final class Student extends Person{
     private String studentId;
     public String[] sub;
     private int amountOfSubjects;
     Scanner input=new Scanner(System.in);
     
    /**
     *overriding the print function from parent class to use up shared variables
     */
    @Override
    public void printDetails() {
      JOptionPane.showMessageDialog(null,
      "School deatils: School name:"+super.getName()+" Phone number:"+super.getTelephone()+" Email:"+super.getEmail()+"\n"+        
      "\n\nStudent ID:" + getStudentId()
      +"\nFirst Name: " + super.getFirstName()
      + "\nLast Name: " + super.getLastName()
      + "\nGender: " + super.getGender()
      + "\nDate of birth: " + super.getDateOfBirth()
      + "\nAddress: " + super.getAddress()
      + "\nSubjects: " + Arrays.toString(getSub()),
      "Sub-Class (Student)", 
      JOptionPane.INFORMATION_MESSAGE);   
    }

    public Student() {
        super("","","",null,null); 
        this.studentId="";
        this.sub=null;
     }
    
     public Student(String fname, String lname, String gender, Date DOB, Address address,String id,String[] subjects) {
        super(fname, lname, gender, DOB, address); 
        this.studentId=id;
        this.sub=subjects;
    }
    
    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the subjects of students
     */
    public String[] getSub() {
        return sub;
    }

    /**
     * @param sub the subjects to set
     */
    public void setSub(String[] sub) {   
        this.sub = sub;
    }

    /**
     * @return the amountOfSubjects
     */
    public int getAmountOfSubjects() {
        return amountOfSubjects;
    }

    /**
     * @param amountOfSubjects the amountOfSubjects to set
     */
    public void setAmountOfSubjects(int amountOfSubjects) {
        this.amountOfSubjects = amountOfSubjects;
    }
     
    
}