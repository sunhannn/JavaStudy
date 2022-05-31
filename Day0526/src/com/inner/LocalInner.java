package com.inner;
/*
 *	LocalInner class
 *
 * -클래스 내부에 특정 메소드 안에 정의되는 클래스다.
 *	 -지역 변수와 같은 것이다.
 * 	메소드가 호출 될 때 생성할 수 있으며, 메소드의 수행력이 없어지면 끝나는
 *  지역변수와 같이 자동으로 소멸됨
 *  
 *  	* 잘 사용하지는 않는다.
 *  		- 메소드 내부에 클래스가 존재, 메소드 실행시에만 실행됨
 *  		
 *  	
 *				class Outer {
 *				public void aa() { // 클래스의 멤버 메소드
 *				class Inner { // 메소드안에 지역변수와 같은 곳에 위치
 *
 *
 *  
 *  
 *  
 *  			
 */		

public class LocalInner {
		int a = 100;	// 외부 클래스의 멤버 변수
		
		
			public void innerExam01(int k) {	//멤버 메소드
				int b = 200; //지역변수(메소드 내에서만 존재함)
				final int c = k;	// 상수
				
				class Inner {	// 로컬 이너 클래스
					// 로컬 이너 클래스는 외부 클래스의 멤버 변수와 같은 위치에 있으며
					// 멤버 변수와 상수들만 접근이 가능하다.
					public void getData() {
						
						System.out.println("int a : "+a);
						System.out.println("int b : "+b);
						System.out.println("final int c : "+c);
					}
					
				}	//	end inner class
				
				// 메소드 내에서 로컬 이너 클래스의 객체 생성이 가능함.
				Inner i = new Inner();
				// 생성된 객체를 통해서 메소드를 호출한다.
				i.getData();
				
			}	// end method
	
			
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalInner li = new LocalInner();
		li.innerExam01(1000);
		
		
		
		
		
		
	}

}
