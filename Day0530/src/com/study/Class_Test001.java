package com.study;


/*
 * 	지역변수는 초기화 과정을 거치지 않으면 사용할 수가 없다.
 * (자동 초기화 기능을 지원하지 않는다.)
 * 
 */

public class Class_Test001 {
	
	
		static int b;	// 전역 변수(인스턴스 멤버변수)
		//int b;
		// 사용하는 과정에서 초기화 하지 않을 경우 int형을 기준 자동으로 0으로 초기화 됨
	

	public static void main(String[] args) {
		int a = 0;
		System.out.println("a : "+a);
		
		System.out.println(Class_Test001.b);
		//System.out.println(new Class_Test001().b);
	}

}
