package com.MethodEx;
/*
 * 
 * 	값에 의한 호출 (call by value)
 * 메소드 호출시 기본 자료형의 값을 인자(매개변수)로 전달하는 방식
 * 
 * 
 */
public class ValueParameter {

	
	public int increase(int n) {
		++n;
		return n;
		
		
		
	}
	public static void main(String[] args) {
			int value = 100;
			ValueParameter vp = new ValueParameter();
			int value2 = vp.increase(value); //101 --> 메소드 호출 시 기본자료형의 인자값으로 전달
			System.out.println("value : "+value+", value2 : "+value2);
		
		
		
		
		
		
		
		

	}

}
