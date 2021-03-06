package com.hw.two;

public class RFMous extends Mouse  implements IRF {

	@Override
	public void wconnect() {	//인터페이스의 메소드 재정의
		
		System.out.println("마우스 무선 연결됨");
	}

	@Override
	public void wdisconnect() {	//인터페이스의 메소드 재정의
		
		System.out.println("마우스 무선 연결 끊김");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RFMous rfm = new RFMous();
		System.out.println("무선방식 : "+IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
		
	}

	@Override
	void move() {	//추상 클래스의 메소드 재정의
		
		System.out.println("마우스 움직임");
	}

	@Override
	void scroll() {	// 추상클래스이 메소드 재정의
		
		System.out.println("마우스 스크롤 움직임");
	}

}
