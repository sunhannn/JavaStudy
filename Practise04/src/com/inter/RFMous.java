package com.inter;

public class RFMous extends Mouse implements IRF {

	@Override
	public void wconnect() {
		// TODO Auto-generated method stub
		System.out.println("마우스 무선 연결됨");
	}

	@Override
	public void wdisconnect() {
		// TODO Auto-generated method stub
		System.out.println("마우스 무선 연결 끊김");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RFMous rfm = new RFMous();
		System.out.println("무선 방식 : "+IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
		
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("마우스 움직임");
	}

	@Override
	void scroll() {
		// TODO Auto-generated method stub
		System.out.println("마우스 스크롤 움직임");
	}
	
	
	
}
