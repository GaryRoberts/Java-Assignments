package entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Gary Roberts 20152131 Lauriann Comrie 20161630
 */
@Entity
public class Sale implements Serializable{

        @Id
        private String saleId;
        private String carCode;
        private String carName;
        private String clientId;
        private String firstName;
        private String lastName;
        private int quantity;
        private double totalFunds;
        private String saleDate;

       public Sale(){ 
            this.saleId="";    
            this.carCode="";
            this.carName="";
            this.clientId="";
            this.firstName="";
            this.lastName="";
            this.quantity=0;
            this.totalFunds=0.0;
            this.saleDate="";
      }
   
      public Sale(String saleId,String carCode,String carName,String clientId,String firstName,String lastName,int quantity,double totalFunds,String date)
      { 
         this.saleId=saleId;    
         this.carCode=carCode;
         this.carName=carName;
         this.clientId=clientId;
         this.firstName=firstName;
         this.lastName=lastName;
         this.quantity=quantity;
         this.totalFunds=totalFunds;
         this.saleDate=date;
      }

    /**
     * @return the saleId
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * @param saleId the saleId to set
     */
    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    /**
     * @return the carCode
     */
    public String getCarCode() {
        return carCode;
    }

    /**
     * @param carCode the carCode to set
     */
    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    /**
     * @return the carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName the carName to set
     */
    public void setCarName(String carName) {
        this.carName = carName;
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
     * @return the totalFunds
     */
    public double getTotalFunds() {
        return totalFunds;
    }

    /**
     * @param totalFunds the totalFunds to set
     */
    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }

    /**
     * @return the date
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * @param date the date to set
     */
    public void setSaleDate(String date) {
        this.saleDate = date;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
    
}
