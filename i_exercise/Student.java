package i_exercise;

public class Student extends Human {
	String number;
	String major;
	
	Student(){
		
	}
	
	Student(String name, int age, int height, int weight, String number, String major){
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	String printInformation() {
		return (name + "  " + age + "  " + height + "  " + weight
				+ "  " + number + "  " + major);
	}
	
}
