package Arrayy;

import java.util.ArrayList;

public class ArrayListt {
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");  //0
		cars.add("BMW");    // 1
		cars.add("MG");    // 2
		cars.add("36583");  //3
		
		System.out.println("List of Items is "+cars);   // + ---> Concatenate
		System.out.println("Specific Item is " +cars.get(3));
		
		
		
	}

}
