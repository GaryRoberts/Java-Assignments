/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

import address.Address;
import java.util.Date;

/**
 *
 * @author Gary Roberts
 */
public abstract class Person{
    private String firstName;
    private String lastName;
    private Address address;
    private Date dateOfBirth;
    private String gender;        
    private final String name="Miraki Evening Institute";
    private final String telephone="1876-345-5856";
    private final String email="Miraki@gmail.com";   
    
  abstract public void printDetails();
  abstract public void contactDetails();
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
  
       @Override
    public String toString() {
        return " School name:" + name + "\n Telephone:" + telephone + "\n Email: " + email+"\n\n FirstName:" + firstName + "\n Last name:" + lastName + "\n Gender: " + gender+ "\n Address: " + address+ "\n Date of birth: " + dateOfBirth;
    }
}
