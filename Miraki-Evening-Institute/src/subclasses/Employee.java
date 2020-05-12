/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subclasses;

import address.Address;
import enumeration.EmployeeType;
import interfaces.Salary;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import superclasses.Person;

/**
 *
 * @author user
 */
public class Employee extends Person implements Salary{
    private String employeeID;
    private double salary;
    private int amountOfSubjects;
    private int hrs;
    private String empType;
    public String[] sub;
     
    Scanner input=new Scanner(System.in);
    
 
    public Employee() {
       super("","","",null,null);
        this.employeeID=null;
        this.sub=null;
        this.hrs=0;
        this.empType="";
        this.salary=0.0;
    }   
    
    public Employee(String fname, String lname, String gender, Date DOB, Address address,String[] subjects,String id,int hrs,String type,double sal) {
        super(fname, lname, gender, DOB, address);
        this.employeeID=id;
        this.sub=subjects;
        this.hrs=hrs;
        this.empType=type;
        this.salary=sal;
    }  

  
    
     @Override
      public void printDetails() {
      JOptionPane.showMessageDialog(null,
      " School deatils: School name:"+super.getName()+"\n Phone number:"+super.getTelephone()+"\n Email:"+super.getEmail()+"\n\n"+        
      "\n\nEmployee ID:" + getEmployeeID()
      +"\nFirst Name: " + super.getFirstName()
      + "\nLast Name: " + super.getLastName()
      + "\nGender: " + super.getGender()
      + "\nDate of birth: " + super.getDateOfBirth()
      + "\nAddress: " + super.getAddress()
      + "\nSubjects: " + Arrays.toString(getSub())
      + "\nEmployee Type: " +getEmpType()
      + "\nSalary: " +getSalary(),        
      "Sub-Class (Employee)", 
      JOptionPane.INFORMATION_MESSAGE);
    }

      
    @Override
     public double calculateGrossSalary() {
       double pay=0.0;
       
       if(getEmpType().equals("regular"))
       {
         EmployeeType regularEmp =  EmployeeType.regular;
         System.out.println("Pay for employee:"+regularEmp.reg());  
         String pay1=EmployeeType.regular.toString();
         pay = Double.parseDouble(pay1);
       }
       
       if(getEmpType().equals("teacher"))
       {
         EmployeeType employeePay2 =  EmployeeType.teacher;
         System.out.println("Pay for employee:"+employeePay2.teacherNormal(getHrs(),3000.00));
         String pay2=EmployeeType.teacher.toString();
         pay = Double.parseDouble(pay2);
       }
       
       if(getEmpType().equals("teacher") && getAmountOfSubjects()>3)
       {
          EmployeeType employeePay3 =  EmployeeType.teacher;
          System.out.println("Pay for employee:"+employeePay3.teacherOvertime(getHrs(),3000.00)); 
          String pay3=EmployeeType.teacher.toString();
          pay = Double.parseDouble(pay3);
       }
       return pay;
    }
    
    /**
     * @return the employee_id
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeIDthe employee_id to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
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
    
        /**
     * @return the sub
     */
    public String[] getSub() {
        return sub;
    }

    /**
     * @param sub the sub to set
     */
    public void setSub(String[] sub) {   
        this.sub = sub;
    }

    /**
     * @return the hrs
     */
    public int getHrs() {
        return hrs;
    }

    /**
     * @param hrs the hrs to set
     */
    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    /**
     * @return the empType
     */
    public String getEmpType() {
        return empType;
    }

    /**
     * @param empType the empType to set
     */
    public void setEmpType(String empType) {
        this.empType = empType;
    }

}
