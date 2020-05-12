
package enumeration;

/**
 *
 * @author Gary Roberts
 */
public enum EmployeeType{
       regular,teacher;
       private double pay;
       
       public double reg(){
           pay=200000.00;
           return pay; 
       } 
       
       public double teacherNormal(int hrs,double rate){
           pay=rate*hrs;
           return pay;
       } 
       
       public double teacherOvertime(int hrs,double rate){
           pay=rate*hrs+5000;
            return pay;
       } 

       
       @Override
       public String toString(){
          String strDouble = String.valueOf(pay);
          return strDouble;
        }
}
