package day01;


//이름, 국어, 영어, 수학 점수를 받아서 
//이름, sum, avg, 학점를 출력하는 코딩을 하시오
//단, 컬렉션 사용


public class Practice {
	
	private String name, hak;
	private int kor, eng, math, sum;
	private double avg;
	
	
	
	public Practice() {
		
	}
	
	public Practice(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
		//메소드 호출
		sum();
		avg();
		hak();
	}
	
	public void sum() {
		sum = kor + eng + math;
	}
	
	public void avg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	public void hak() {
		if(avg >= 90) {
			hak = "A학점";
			
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}








//public class Practice {
//	
//	private String name;
//	private int kor;
//	private int eng;
//	private int math;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getKor() {
//		return kor;
//	}
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//	public int getEng() {
//		return eng;
//	}
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//	public int getMath() {
//		return math;
//	}
//	public void setMath(int math) {
//		this.math = math;
//	}
//	
//	
//	
//	
//}
