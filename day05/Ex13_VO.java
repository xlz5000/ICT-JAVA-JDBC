package day05;

import java.io.Serializable;

//VO:ValueObject : 데이터를 가지고는 객체
//                 데이터를 저장하는 객체
//                 객체 불변, 데이터 초기화 
//DTO: Data Transfer Object :데이터 전송을 위한 객체
//                            getter, setter 모두 존재


// 객체 직렬화 :  객체를 바이트 스트림으로 변환하여 
//             파일, 네트워크, 데이터베이스 등에서 저장하거나 전송할 수 있도록 
//             하는 과정을 말한다.(Object ouput- 우리입장에서 나가는거)
//             이를 반대로 수행하는 과정을 역직렬화라고 한다.(Object input)
//             장점: 객체를 쉽게 저장하고 전송할 수 있음
//                  네트워크를 통한 객체 전달이 가능
//             단점:  보안에 취약점이 발생할 수 있다.
//                   속도가 느리다.

// 직렬화 방법
// 정보를 가진 vo가 객체 직렬화 대상이 된다.
// 1. Serializable 상속받자
// 2. 멤버필드(변수, 상수)가 직렬화 대상이 된다.
// 3. 직렬화 대상에서 제외 시키려면 
//    해당 필드 앞에 transient 예약어 사용 
//    여기서 제외한 기본값을 가지고 있음

// 메소드(기능, 동작)

// 인터페이스임에도 상수와 추상화 메소드가 없다 ㄷㄷ
public class Ex13_VO implements Serializable{
	
	// int 기본값 0 double 기본값 0.0 boolean 기본값 false name은 null
	private String name;
	private int age;
	transient private double weight;
	transient private boolean gender;
	
	
	public Ex13_VO(String name, int age, double weight, boolean gender) {

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	// boolean은 get이 아닌 is 
	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	

}
