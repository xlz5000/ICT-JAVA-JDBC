package day04;

import java.util.ArrayList;
import java.util.List;

public class Ex05_Car {
	
	// 판매할 차를 가지고 있는 공간
	private List<String> carList = null;
	
	// 객체를 생성할 때 carList가 생성된다.
	public Ex05_Car(){
		carList = new ArrayList<String>();
	}
	
	// 해당 메서드를 호출하면 carName 반환
	// 차 생산
	public String getCar() {
		String carName = null;
		// Math.random()은 0.0~1.0 즉, double return인듯 
		// 그래서 (int) 해줘야함(double-> int)
		// 더 작은 int로 바꿔주는것이므로 강제로 캐스팅 필요, 반대인경우는 자동으로 됨.
		
		switch((int)(Math.random()*3)) { //0-2까지
		// **Math.random() 이거는 0.0이상 1.0미만임. 즉 1.0이 포함안됨.
		// (int)Math.random()*3는 고로 ((int)Math.random()) 인식되어 0 여기다가 0*3 인식되어
		// 0값만 출력되게끔 컴퓨터가 인식할 수 있음 
		// 고로. Math.random()*3 전체 괄호 씌우고 (int) casting하자
		case 0: carName = "SM5";break;
		case 1: carName = "매그너스";break;
		case 2: carName = "카렌스";break;
		}

		return carName;
	}
	
	
	// 차 판매
	public synchronized String pop() {
		String carName = null;
		if(carList.size()== 0) {
			try {
				System.out.println("차가 없어요 생산할 때까지 " + "기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}// if
		
		
		//carList에 마지막 요소를 삭제(판매)
		// \" => 쌍따옴표를 의미한다.
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다.." + "손님이 구입한 차이름은=>\" " + 
		carName + "\"");
		
		return carName;
	}
	
	
	
	// 차 리스트에 추가
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어 졌습니다. " + "차 이름은 \" " + car + "\"");
		
		// 판매할 차가 5개 되면 대기상태의 스레드를 준비상태로 전환
		if(carList.size()== 5) {
			this.notify();
		}
	}

}
