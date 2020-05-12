
package Entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Gary Roberts
 */
@Entity
public class Patient implements Serializable {
      
      @Id
      private String patientId;
      private String firstName;
      private String lastName;
      private String gender;
      private int age;
      private String telephone;
      private String district;
      private String street;
      private String parish;       

      public Patient(){
         this.patientId="";
         this.firstName="";
         this.lastName="";
         this.gender="";
         this.age=0;
         this.telephone=""; 
         this.street="";
         this.district="";
         this.parish="";
      }
      
      public Patient(String patientId,String fname,String lname,String gender,int age,String telephone,String street,String district,String parish){
         this.patientId=patientId;
         this.firstName=fname;
         this.lastName=lname;
         this.gender=gender;
         this.age=age;
         this.telephone=telephone; 
         this.street=street;
         this.district=district;
         this.parish=parish;
      }
      
    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the parish
     */
    public String getParish() {
        return parish;
    }

    /**
     * @param parish the parish to set
     */
    public void setParish(String parish) {
        this.parish = parish;
    }
      
      
}
