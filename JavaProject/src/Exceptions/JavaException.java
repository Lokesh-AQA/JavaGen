package Exceptions;

public class JavaException {

	public static void main(String[] args) {       //Main Method      
                                    
		try {

			
			  int data = 100/0;
			  
			  System.out.println(data);
			 

		} catch (Exception e) {

			System.out.println("Rest of the Program...." +   e);
		}
	}
}
