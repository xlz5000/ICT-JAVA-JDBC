//package c_control;
//
//public class Ex02_switch_평균 {
//
//	public static void main(String[] args) {
//		int kor=77, eng=88, math=99;
//		int total = kor + eng + math;
//		int avg = total/3;
//		char score = '\u0000';// '' char는 한 글자 넣어줘야하는데 이 값은 안에
//							// 있는 값이 유니코드로 표현되면 결국 한 글자로 표현되기 
//							// 때문에 가능한것.
//		// String = "";가능 char=' '; char는 사이에 띄어줘야 한다.
//		
//		/*
//		 * 90이상이면 'A'
//		 * 80이상이면 'B'
//		 * 70대이면 'C'
//		 * 나머지 'F'
//		 * 
//		 */
//		
//		//case 옆에는 값만 들어가고 수식이 불가능하지만, 
//		// switch 문 옆의 괄호에()에는 수식 가능!
//		switch(avg/10) { // 80점대, 90점대로 나누고 싶을때 switch 사용하려면 공통된점을 생각하자
//		// 80점대의 공통점은 십의 자리가 8이라는 것
//		// 고로 8을 뽑아내기 위해 char로 바꾸고 뽑아내기 보다는
//		// 나누기 10을 이용하자.
//		case 10: //score = 'A';break; 안쓰기도 가능
//		case 9: score = 'A';break;
//		case 8: score = 'B';break;
//		case 7: score = 'C';break;
//		default: score = 'F';break;
//		
//		
//		}
//		System.out.println(score + "학점입니다");
//
//	}
//
//}



