
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Gary Roberts 20152131 Lauriann Comrie 20161630
 */
@Entity
public class Client implements Serializable {
      @Id
      private String clientId;
      private String firstName;
      private String lastName;
      private String gender;
      private String street;
      private String district;
      private String parish;
      private String telephone;

      
       public Client(){
          this.clientId="";
          this.firstName="";
          this.lastName="";
          this.gender="";
          this.street="";
          this.parish="";
          this.district="";
          this.telephone="";
      }
      
        public Client(String firstName,String lastName){
          this.firstName=firstName;
          this.lastName=lastName;

      }
      public Client(String clientId,String firstName,String lastName,String gender,String street,String district,String parish,String telephone){
          this.clientId=clientId;
          this.firstName=firstName;
          this.lastName=lastName;
          this.gender=gender;
          this.street=street;
          this.parish=parish;
          this.district=district;
          this.telephone=telephone;
      }
    /**
     * @return the clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
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
}
