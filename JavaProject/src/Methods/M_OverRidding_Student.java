package Methods;

public class M_OverRidding_Student {
	
	public static void main(String[] args) {
		
		M_OverRidding_College a = new M_OverRidding_College();
		
		M_OverRidding_University b = new M_OverRidding_University();
		
		M_OverRidding_Facaulty c= new M_OverRidding_Facaulty();
		
		a.move();
		
		b.move();
		
		c.move();
		
	}

}

