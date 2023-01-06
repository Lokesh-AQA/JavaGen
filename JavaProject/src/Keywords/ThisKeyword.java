package Keywords;

public class ThisKeyword {
	
	int Sample;                                   // Global Declaration
	
	public static void main(String[] args) {    //----->Execution always start from main Method or Its an Engine 
		
		ThisKeyword myObj = new ThisKeyword(5);   // Object Created and Call the Constructor
		
		System.out.println("Under Main Method");
		
		System.out.println("Value of Sample is "+ myObj.Sample);
	}
	
	public ThisKeyword(int Storage) {            // Created Constructor with Parameter 
		
		this.Sample = Storage;                          // THIS Keyword    ---> will connect with each other
	}
}
