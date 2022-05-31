package com.Gaxtuki;

public class Piano extends Gaxtuki {

	
	
	
	public static void main(String[] args) {
		Piano p = new Piano();
		p.play();
		p.volumeUp();
		p.volumeDown();
		
		
	}
	
	
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano : Play() 호출됨 ");
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Piano : volumeUp() 호출됨");
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Piano : volumeDown() 호출됨");
	}

	
	
	
	
	
}
