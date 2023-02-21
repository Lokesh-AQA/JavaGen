package Encapsulation;

public class RunEncapsulations {
	
	
	public static void main(String[] args) {     // Engine   ...............Execution Always Start from Main method 
		
		
		// ClassName Referncevariabe = new ClassName();
		
		TestEncapsulations encap = new TestEncapsulations();     //object Creations
		
		encap.setName("Jhon");
		
		encap.setAge(20);
		
		encap.setIdNum("X76TYbO");
		
		System.out.println("Name is : " + encap.getName() + " Age is : " + encap.getAge());
	}

}
