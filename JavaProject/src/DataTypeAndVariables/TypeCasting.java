package DataTypeAndVariables;

public class TypeCasting {                  
	
	public static void main(String[] args) {
		System.out.println("Auto UpCasting  Int (4 byte) to Double (8 byte)");
		int myInt1 = 9;       
		double myDouble1 = myInt1;
		System.out.println(myInt1);    // 9
		System.out.println(myDouble1);  //9.0
		
		
		System.out.println("Auto DownCasting Double (8 byte) to int (4 byte)");
		double myDouble2 = 9.78d;     
		int myInt2 = (int) myDouble2;  //9.78
		System.out.println(myDouble2); //9
		System.out.println(myInt2);  
		
	}
}
