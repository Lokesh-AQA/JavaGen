package Encapsulation;

public class TestEncapsulations {

	private String name;
	private String IdNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;

	}

	public String getIdNum() {
		return IdNum;
	}

	
	//   Following Codes are Methods
	
	public void setName(String newName) {         // Non Static method
		name = newName;
	}
	
	public void setAge(int newAge) {             //Non Static
		age = newAge;
	}

	public void setIdNum(String newId) {
		IdNum = newId;
	}

}
