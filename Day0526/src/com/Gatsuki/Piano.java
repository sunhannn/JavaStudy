package com.Gatsuki;
// 추상 클래스를 상속받아 구현하는 구현체(하위클래스)

public class Piano extends Instrument {
	
	
	
	
	
	
	public static void main(String[] args) {
		Piano p = new Piano();	//Piano 클래스의 인스턴스 생성
		p.play();	//	인스턴스 메소드 호출
		p.volumeUp();	
		p.volumeDown();
	
	}

	@Override	// 오버라이딩 된 메소드
	
	void play() {	//인스턴스 메소드
		// TODO Auto-generated method stub
		System.out.println("Piano : Play() 호출됨");
	}
	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Piano : volumeDown() 호출됨");
	}
	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Piano : volumeUp() 호출됨");
	}
	
}
