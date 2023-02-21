package Methods;

public class StaticAndNonStaticMethod { // Execution always start from MAIN METHOD      //  JRE java Runtime environemnet 

	public static void main(String[] args) {         // Main Method or Train Engine

		System.out.println("Under Main Method");
		
	    //  ClassName referneceVariable = new Classname();
		
		StaticAndNonStaticMethod one = new StaticAndNonStaticMethod();      // Object Created
		one.a();                                    // Interlinking the Methods
		one.b();
		
		StaticAndNonStaticMethod.c(); 
		
		
		StaticAndNonStaticMethod.d();
		
	}

	public void a() {                               // Compartment 1 is  Non Static method

		System.out.println("Under Method A");
		System.out.println("Another Method A");

	}

	public void b() {                               // Compartment 2  Non Static method

		System.out.println("Under Method B");
	}
	
	public static  int c() {                // Compartment 3 Static Method
		
		System.out.println("Under Method C");
		return 5;
	}
	
	public static void d() {            // Compartment 4 Static Method
		
		System.out.println("Under Method D");
	}

}
