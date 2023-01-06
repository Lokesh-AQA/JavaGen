package Exceptions;

public class Throwss {
	
	public static void main(String[] args) {     //Main Method
		
		checkAge(15);
		
		
	}

	public static void checkAge(int age) throws ArithmeticException {     // Static method
		
		if (age < 18) {    // pass
			
			throw new ArithmeticException("-- Exception Occured");
			
			//System.out.println("YES");
		
		}else {
			
			System.out.println("NO");
		}
		
		
	}

}
