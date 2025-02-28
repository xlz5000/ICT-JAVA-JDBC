package day06;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 객체 직렬화 2번째 방법 : 
// 1. Externalizable 상속 받는다
public class Ex01_VO implements Externalizable{
	
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	// 역직렬할 때 기본생성자가 필요하다. 이유? 알아보기
	public Ex01_VO() {};

	public Ex01_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 직렬화 대상 멤버를 넣기
		// writeExternal, readExternal 배치 순서가 같아야 한다.
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
		
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 역직렬화 대상 멤버를 넣기
		// object로 나오기에 casting 해야함
		name = (String) in.readObject();
		age = (int) in.readObject();
		weight = (double) in.readObject();
		gender = (boolean) in.readObject();
		
		
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

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	
	

}
