package com.Gaxtuki;

public class Flute extends Gaxtuki {
		
		
		
	
	public static void main(String[] args) {
		Flute f = new Flute();
		
		f.play();
		f.volumeUp();
		f.volumeDown();
		
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute : Play() 호출됨");
	}

	@Override
	void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Flute :volumeUp() 호출됨");
	}

	@Override
	void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Flute : volumeDown() 호출됨");
	}
	

}
