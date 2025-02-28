package day06;

public class test {

	public static void main(String[] args) {
		int kor = 100, eng = 100, math = 100;
		int total = kor+eng+math;
		int avg = total/3;
		
		
		char score = '\u0000';
		
		switch(avg/10) {
		case 10: 
		case 9: score='A';break;
		case 8: score = 'B';break;
		case 7: score = 'C';break;
		default: score='F';break;
		}
		
		System.out.println(score + "학점입니다");

	}

}
