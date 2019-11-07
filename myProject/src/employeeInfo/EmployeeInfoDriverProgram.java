package employeeInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeInfoDriverProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Employee emp1 = new Employee();
	 
	/*	Employee [] emp = new Employee[3];
		EmpName [] empname = new EmpName[3];
		EmpAddress [] empadd = new EmpAddress[3];
		EmpArea [] emparea = new EmpArea[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee();
		emp[2] = new Employee();
		
			
		empname[0] = new EmpName();
		empname[1] = new EmpName();
		empname[2] = new EmpName();
		
		empadd[0] = new EmpAddress();
		empadd[1] = new EmpAddress();
		empadd[2] = new EmpAddress();

		
		emparea[0] = new EmpArea();
		emparea[1] = new EmpArea();
		emparea[2] = new EmpArea();
		*/
		Employee emp = new Employee();
		EmpName empname = new EmpName();
		EmpAddress empadd = new EmpAddress();
		EmpArea emparea = new EmpArea();
		File file = new File("C:/Users/jibu1/development/Github/LearnJava/myProject/src/io/myfile.txt");
		
        
        Scanner scanner = new Scanner(file);
       
     	 int i =0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split=line.split(",");
            emp.ssn=split[0];
           emp.age=Integer.parseInt(split[1]);
 		   emp.salary=Integer.parseInt(split[2]);
 		   emp.dept=split[3];
 		   empname.fname=split[4];
 		   empname.mname=split[5];
 		   empname.lname=split[6];
 		   empadd.street =split[7];
 		   emparea.city = split[8];
 		   emparea.state =split[9];
 		  emparea.zip = Integer.parseInt(split[10]);
 	
 		 System.out.println("DETAILS OF EMPLOYEE  "+ (i+1));
 		 System.out.println("Name:"+empname.fname + " " +empname.mname+" "+empname.lname );
 		 System.out.println("SSN:"+ emp.ssn);
 	     System.out.println("Age:"+ emp.age);
 	     System.out.println("Salary:"+ emp.salary);
 	     System.out.println("Dept:"+ emp.dept);
 	     System.out.println("Address:"+ empadd.street+ "  "+emparea.city+ "  "+emparea.state+ "  "+emparea.zip);
 	     System.out.println(" ");
 	     i++;
        }
        
        
      

	/*	emp[1].ssn="222";
		   emp[1].age=40;
		   emp[1].salary=40000;
		   emp[1].dept="HR";
		   empname[1].fname="Aruna";
		   empname[1].mname="L";
		   empname[1].lname="Vasanth";
		   empadd[1].street ="Edenton Lane";
		   emparea[1].city = "Mooresville";
		   emparea[1].state = "NC";
		   emparea[1].zip = 29117;
		   
 emp[0].ssn="111";
   emp[0].age=30;
   emp[0].salary=30000;
   emp[0].dept="IT";
   empname[0].fname="Jibu";
   empname[0].mname="C";
   empname[0].lname="Chandran";
   empadd[0].street ="Woodduck Lane";
   emparea[0].city = "Wheeling";
   emparea[0].state = "IL";
   emparea[0].zip = 60090;
   
   

   
   emp[2].ssn="333";
   emp[2].age=50;
   emp[2].salary=50000;
   emp[2].dept="QA";
   empname[2].fname="Tom";
   empname[2].mname="N";
   empname[2].lname="Cruise";
   empadd[2].street ="Morning Mist Lane";
   emparea[2].city = "Madison";
   emparea[2].state = "WI";
   emparea[2].zip = 28119;



 
   

 for (int i=0; i < emp.length; i++) 
 {
	 
	 
	 
	 System.out.println("DETAILS OF EMPLOYEE  "+ (i+1));
	 System.out.println("Name:"+empname[i].fname + " " +empname[i].mname+" "+empname[i].lname );
	      System.out.println("SSN:"+ emp[i].ssn);
     System.out.println("Age:"+ emp[i].age);
     System.out.println("Salary:"+ emp[i].salary);
     System.out.println("Dept:"+ emp[i].dept);
     System.out.println("Address:"+ empadd[i].street+ "  "+emparea[i].city+ "  "+emparea[i].state+ "  "+emparea[i].zip);
     System.out.println("                                         ");
	 

 }
   */
  
 


}  

}

class Employee
{
	String ssn;
	int age;
	int salary;
	String dept;
	EmpName employeename;
	 
	 
	 
	
	 
	
	 
	 
 
}




class EmpName
{
	String fname;
	String mname;
	String lname;
 
	
}

 
class EmpAddress 
{
	String street;
	EmpArea area;
}



class EmpArea
{
	String city;
	String state;
	int zip;
}



 