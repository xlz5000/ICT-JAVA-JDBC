package j_review2;
//Object는 단군할아버지 클래스- >가장 위라고 보면됨?
public class Student /*이부분이 자동으로 써지는 것  extends Object*/{
	
	String name;
	String dept;
	
	
	Student(){
		
	}
	
	Student(String name, String dept){
		this.name = name;
		this.dept = dept;
	}
	
	//Student 부모인 Object가 가진 함수 overriding써서 사용할 수 있음
	//단, 여기서 Object는 부모 Object가 아닌 그냥 객체 형식을 가르키는 것
	//예를 들어 int n처럼 즉 객체가 매개변수로 들어온다는 의미임
	public boolean equals(Object obj) {
		Student s2 = (Student)obj;
		if(name.equals(s2.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	//부모가 가진 toString() 오버라이딩
	
	public String toString() {
		return "이름:" + name + "/학과:" + dept;
	}
}
