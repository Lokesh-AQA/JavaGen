package Arrayy;

public class Arrayy {
	
	public static void main(String[] args) {
		
		String car = "Benz";       // Normal String
		
		System.out.println("Only one String is "+ car);
		
		int[] number = {1,2,3};
		
		System.out.println("List of integer is "+ number[1]);
		
		String[] cars = {"Volvo", "BMW", "123", "A@12as", "Ignite", "...."};  // Array String "[]"
		
		System.out.println("List of String is "+cars[4]);    
		
		cars[4]="UK";
		
		System.out.println("Updated String is "+ cars[4]);
		
		System.out.println("Length of Array is "+ cars.length);
		
	}

}
