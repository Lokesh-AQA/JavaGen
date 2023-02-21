package Keywords;

public class StaticKeyword {

	public static String name = "Ignite"; // Global Declaration

	public static void main(String[] args) { // Engine

		System.out.println("Under main Method");

		StaticKeyword.myStaticMethod();      // Call for Static Method

		StaticKeyword nonstatic = new StaticKeyword(); // Call for Non Static Method
		nonstatic.myNonStaticMethod();

		System.out.println(name + " Under Main Method");

	}

	public static void myStaticMethod() { // Static Method
		System.out.println("Under Static method");
		System.out.println(name + " Under Static Method");
	}

	public void myNonStaticMethod() { // Non Static method
		System.out.println("Under Non Static Method");
		System.out.println(name + " Under Non Static Method");
	}

}
