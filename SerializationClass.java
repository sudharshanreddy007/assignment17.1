package employ;




import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	//class defines instance and class fields,methods and inner classes as
	//well as specifying the interfaces the class implements and the 
	//immediate superclass of the class
  public static void main(String[] args) 
  
			
  {
    Employee emp = new Employee();
    //here creating the EmployeeClass object which implemented  the  serializable interface
    emp.firstName ="Sudharshan";//first  and last name of the employee
    emp.lastName = "Reddy";
  
    try {
    	/*the code is prone to exceptions is placed in the try block
    	 *when exception occurs that exception occurred is handled by the 
    	 *catch block associated with it
    	 */
      FileOutputStream fileOut = new FileOutputStream("D:/employee.txt");
      //creating an object of fileOut and assigning the path of text file
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(emp);//here we are passing the object of the employee
      out.close();//here closing the object output stream
      fileOut.close();// and here file of output stream
      System.out.println("Serialized data is saved in D:/employee.txt file");
      //gives the output as the  serialization file saved successfully
	  System.out.println("First Name:"+emp.firstName);
	  //gives the output as the  serialization file saved successfully
	  //displays the second name of the employee
      System.out.println("Last Name:"+emp.lastName);
      
    } catch (IOException i)  {
      i.printStackTrace();//prints stack trace for this throwable object
    }
  }
}
