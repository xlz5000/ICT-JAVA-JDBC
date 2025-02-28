package i_exercise;

public class Human {
	String name;
	int age;
	int height;
	int weight;
	
	Human(){
		
	}
	
	Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	String printInformation() {
		return (name + "	" + age + "		" + height + "		" + weight);
	}
}
