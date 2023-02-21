package loopingAndStatementCondition;

public class DoWhile {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			System.out.println(i);
			i=i+2;                         // i++ or i=i+1; both are same
			
		} while ( i < 5 );
	}

}

