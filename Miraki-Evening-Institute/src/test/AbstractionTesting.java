
package test;

import address.Address;
import implementations.PersonImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gary Roberts
 */
public class AbstractionTesting {
     
       public static void main(String[] args) throws ParseException{
         
          SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
          Date parsedDate;
   
          PersonImpl person=new PersonImpl();
          person.setFirstName("Gary");
          person.setLastName("Roberts");
          person.setGender("male");
          Address address=new Address("Street 1","Cool City","Manchester");
          person.setAddress(address);
          String DateOfBirth="29/10/2017";
          parsedDate = format.parse(DateOfBirth);
          person.setDateOfBirth(parsedDate);
          person.printDetails();
          person.printDetails(person);
          person.contactDetails();
    }
}
