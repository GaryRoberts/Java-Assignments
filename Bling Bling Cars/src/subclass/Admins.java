
package subclass;
import entities.Client;


/**
 *
 * @author Gary Roberts 20152131 Lauriann Comrie 20161630
 */

public class Admins extends Client{

      private String adminId; 
      private String password;
              
      public Admins(){
          super("","");
          adminId="";
          password="";
          
      }
      public Admins(String adminId,String password,String firstName,String lastName){
          super(firstName,lastName);
           this.adminId=adminId;
           this.password=password;
      }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName); //To change body of generated methods, choose Tools | Templates.
    }

      @Override
    public String getFirstName() {
        return super.getFirstName(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName); //To change body of generated methods, choose Tools | Templates.
    }
    
        @Override
    public String getLastName() {
        return super.getLastName(); //To change body of generated methods, choose Tools | Templates.
    } 

    /**
     * @return the adminId
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * @param adminId the adminId to set
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
