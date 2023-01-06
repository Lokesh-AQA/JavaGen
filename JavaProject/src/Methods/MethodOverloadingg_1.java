package Methods;

public class MethodOverloadingg_1 {
	
	public static void main(String[] args) {                                  //  Engine
		int myNum1 = plusMethodInt(8, 5);           // ---1   
		double myNum2 = plusMethodInt(2.2, 3.3);
		
		System.out.println(myNum1);                    // Printing Statement
		System.out.println(myNum2);
		
	}
	              
	public static int plusMethodInt(int x, int y) {   //--2                // 
		 return x+y;
	}
	
	public static double plusMethodInt(double x, double y) {
		return x+y;
	}
	
}
