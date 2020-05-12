
package test;

import address.Address;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import subclasses.Employee;
import subclasses.Student;
import subclasses.Visitor;

/**
 *
 * @author Gary Roberts
 */
public class SystemMethods {
    
        public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        public static DateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        public static String date ="",time="";
        public static Date parsedDate,parsedDOB,parsedDOV,parsedTime;  
        public static int num;
        static Scanner input=new Scanner(System.in);
        public static int[] numVisitor,numStudents,numEmployee;
        public static int SIZE1=0,SIZE2=0,SIZE3=0;
                
       public static void menu() throws ParseException 
       {
    	  //Scanner input = new Scanner(System.in); //scanner used to accept the option of the user
    	  int option=0;
            
        while(option!=4) //loop used to continue running the system until exit is selected
        {
	        System.out.print("\n   Miraki Evening Institute\n\n   MENU:\n   1.Enter Students\n   2.Enter employees\n   3.Enter Visitors\n   4.View The amount in each category\n   5.Exit\n\n   Type Option(1-5):");
	        option=input.nextInt(); //accepts a menu option from the user
	       
                 
	        switch(option)    //switch case used to accept menu options
	        {
	        
	          case 1:
	        	 students(); //invokes the data entry method for students
	             break;
	         
	          case 2: 
	        	 employees(); //invokes the data entry method for employees
	             break;
	             
	          case 3: 
	        	  visitors(); //invokes the data entry method for visitors
	        	break;
	          case 4:
                           stats();
                      break;
	          case 5: 
	        	  System.exit(0); //exits the system
	        	break;
	        	
	           default:
	        	   System.out.print("That is not a valid input"); 
	        }
        }
                
    }
       
    /**
     *
     * @method used to enter a new visitor 
     */
    public static void visitors() throws ParseException{
        
        System.out.print("Enter the amount of Visitors you will enter:");
         int addVis=input.nextInt();

        Visitor visitor[]=new Visitor[SIZE1=SIZE1+addVis];
        numVisitor=new int[visitor.length];
         System.out.print(numVisitor.length);
         for(int i=0;i<visitor.length;i++)
        {
            Scanner read = new Scanner(System.in); //scanner used to accept the student information
            System.out.println("\n<<< Enter Information for visitor #"+(i+1)+" >>>\n");
             /*
               VISITOR ENTRY FRAGMENT OF SYSTEM  	
             */
             System.out.print("Enter student first name : ");
             String FirstName=read.nextLine();
             System.out.print("Enter student last name : ");
             String LastName=read.nextLine();
             System.out.print("Enter student gender : "); 
             String Gender=read.nextLine();
             System.out.print("Enter student Date of birth(dd/mm/yyyy) : "); 
             String DateOfBirth=read.nextLine();
             parsedDOB = sdf.parse(DateOfBirth);
             System.out.print("Enter visitor Date of visit(dd/mm/yyyy) : "); 
             String DateOfVisit=read.nextLine();
             parsedDOV = sdf.parse(DateOfVisit);
             System.out.print("Enter visitor Time of visit(HH:MM: am) :"); 
             String TimeOfVisit=read.nextLine();
             parsedTime = timeFormat.parse(TimeOfVisit);
             
            System.out.print("Enter student address street : ");
            String street=read.nextLine();
            System.out.print("Enter student address city : ");
            String city=read.nextLine();
            System.out.print("Enter student address Parish : ");
            String parish=read.nextLine();
            Address address=new Address(street, city, parish);       
 
            visitor[i]=new Visitor(FirstName,LastName,Gender,parsedDOB,address,parsedDOV,parsedTime); //adding the entered values to the stud array.
            visitor[i].printDetails();
        }	
    	 System.out.print("\n\n Visitor information was added successfully !!!\n\n");  
    }     
     
    /**
     *
     * method used to show the amount of persons entered in each category
     */
    public static void stats() throws ParseException{
      
      if(numStudents==null){ 
       numStudents=new int[0];
       }
      if(numEmployee==null){ 
          numEmployee=new int[0];
      }
       if(numVisitor==null){ 
       numVisitor=new int[0];
       }
       
     JOptionPane.showMessageDialog(null,
       "<<< Amount of Persons for categories >>>\n"+      
      "\n  Amount of students: "+numStudents.length+
      "\n  Amount of employees: "+numEmployee.length+   
      "\n  Amount of visitors: "+numVisitor.length,        
      "Sub-Class (student)", 
      JOptionPane.INFORMATION_MESSAGE);  
      menu();  
    } 

    /**
     *
     * Method used to enter a student record
     */
    public static void students()throws ParseException{
        int amount1=0;
        
         System.out.print("\n\n Enter the amount of students you will enter:");
         int addStud=input.nextInt();
         
        Student stud[]=new Student[SIZE2=SIZE2+addStud];
        numStudents=new int[stud.length];
        
         for(int i=0;i<stud.length;i++)
        {
            Scanner read = new Scanner(System.in); //scanner used to accept the student information
            System.out.println("\n<<< Enter Information for student #"+(i+1)+" >>>\n");
             /*
               STUDENT ENTRY FRAGMENT OF SYSTEM  	
             */
             System.out.print("Enter student id : ");
             String StudentId=read.nextLine();
             System.out.print("Enter student first name : ");
             String FirstName=read.nextLine();
             System.out.print("Enter student last name : ");
             String LastName=read.nextLine();
             System.out.print("Enter student gender(m/f) : "); 
             String Gender=read.nextLine();
             System.out.print("Enter student Date of birth(dd/mm/yyyy) : "); 
             String DateOfBirth=read.nextLine();
             parsedDate = sdf.parse(DateOfBirth);
             
            System.out.print("Enter student address-street : ");
            String street=read.nextLine();
            System.out.print("Enter student address-city : ");
            String city=read.nextLine();
            System.out.print("Enter student address-Parish : "); 
            String parish=read.nextLine();
            
             System.out.print("\n\nEnter the number of subjects:"); 
             
             amount1=input.nextInt();
             System.out.print("\n\n"); 
        
            String[] subjects=new String[amount1];  //sets the size of the subjects array to the amount of subjects to enter
            
            for(int m=0 ;m <subjects.length; m++) //loop to prompt the user for the sujects a student does
            {
              System.out.print("Enter subject "+m+":");  
              subjects[m]=input.next();
            }
            //stud[i].setAmountOfSubjects(subjects.length);
            
            Address address=new Address(street, city, parish);   //adds the address of the students to the address class
            
            stud[i]=new Student(FirstName,LastName,Gender,parsedDate,address,StudentId,subjects); //adding the entered values to the stud array.
            
            stud[i].printDetails(); //prints the details of a stduent
        }	
    	 System.out.print("\n\n Student information was added successfully !!!\n\n"); //success message after data entry
     }
    
     
    /**
     *
     * Method used to enter a new employee in the system
     */
    public static void employees()throws ParseException
    {
         int amount2=0;
         System.out.print("\n\n Enter the amount of employees you will enter:");
         int addEmp=input.nextInt();
         
         Employee emp[]=new Employee[SIZE3=SIZE3+addEmp];
         Employee temp=new Employee(); //creates an object of the employee sub class
         numEmployee=new int[emp.length];
         String[] subjects1=null;
         String[] subjects2=null;
            
         for(int i=0; i <emp.length; i++)
         {
            Scanner read = new Scanner(System.in); //scanner used to accept the student information
            System.out.println("\n<<< Enter Information for student #"+(i+1)+" >>>\n");
             /*
                EMPLOYEE RNTRY FRAGMENT OF SYSTEM  	
             */
             System.out.print("Employee student id : ");
             String EmployeeId=read.nextLine();
             System.out.print("Enter student first name : ");
             String FirstName=read.nextLine();
             System.out.print("Enter student last name : ");
             String LastName=read.nextLine();
             System.out.print("Enter student gender(m/f) : "); 
             String Gender=read.nextLine();
             System.out.print("Enter student Date of birth : "); 
             String DateOfBirth=read.nextLine();
             parsedDate = sdf.parse(DateOfBirth);
             
            System.out.print("Enter student address-street : ");
            String street=read.nextLine();
            System.out.print("Enter student address-city : ");
            String city=read.nextLine();
            System.out.print("Enter student address-Parish : ");
            String parish=read.nextLine();
            Address address2=new Address(street, city, parish);  
            System.out.print("Enter employee type(regular/teacher) : ");
            String type=read.nextLine();
           
            
            temp.setEmpType(type);
            
            if(type.equals("teacher"))
            {
                 System.out.print("\n\n Enter number of hours worked : ");
                 int hrs=read.nextInt();
                 temp.setHrs(hrs);
                System.out.print("\n\nEnter the number of subjects:"); 
                amount2=read.nextInt();  
                System.out.print("\n\n"); 
                subjects1=new String[amount2];
                for(int m=0; m < amount2; m++)
                { 
                  System.out.print("Enter subject "+m+":"); 
                  subjects1[m]=input.next();
                }
                temp.setAmountOfSubjects(amount2);
                
                double pay=0;
                pay=temp.calculateGrossSalary(); //calculating salary based on employee type
                emp[i]=new Employee(FirstName,LastName,Gender,parsedDate,address2,subjects1,EmployeeId,hrs,type,pay);   
                emp[i].printDetails(); //prints the details of a teacher 
          }  
            else{
                  double pay=0;
                  int hrs=0;
                  pay=temp.calculateGrossSalary(); //calculates the gross salary of a regular employee 
                  subjects2=new String[1];
                  subjects2[0]="Not applicable to this employee"; //populate array with a message if subjects are not applicable
                 emp[i]=new Employee(FirstName,LastName,Gender,parsedDate,address2,subjects2,EmployeeId,hrs,type,pay);   
                 emp[i].printDetails(); //prints the details of a regular employee
              }	
    	 System.out.print("\n\n Employee information was added successfully !!!\n\n");
     }
    }
}