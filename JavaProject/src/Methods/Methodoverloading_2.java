package Methods;

public class Methodoverloading_2 {

	
	public static void main(String[] args) {
		int myNum1 =plusMethod(8, 5);
		double myNum2 = plusMethod(2.2, 3.3);
		
		System.out.println(myNum1);
		System.out.println(myNum2);
		
		
		
	}
	
	public static int plusMethod(int x, int y) {
		return x+y;
	}
	
	public static double plusMethod(double x, double y) {
		return x+y;
	}
}

