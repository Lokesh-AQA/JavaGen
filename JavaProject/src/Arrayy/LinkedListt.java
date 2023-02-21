package Arrayy;

import java.util.LinkedList;

public class LinkedListt {
	
	public static void main(String[] args) {
	
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars);
		System.out.println(cars.get(2));
		
		cars.addFirst("Maruthi");
		System.out.println(cars);
		
		cars.addLast("TATA");
		System.out.println(cars);
		
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());

		cars.removeFirst();
		System.out.println(cars);
		
		cars.removeLast();
		System.out.println(cars);
			
		
		
	}

}
