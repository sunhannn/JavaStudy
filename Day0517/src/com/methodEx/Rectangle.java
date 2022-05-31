package com.methodEx;
/*
 * 사각형의 넓이와 둘레를 계산하는 프로그램(클래스로 표현)
 * 
 * 클래스의 속성 : 가로, 세로(넓이, 툴레, 무게, 색깔 ....)
 * 
 * 클래스의 기능 : 넓이 계산, 둘레계산, 가로/세로 입력, 결과 출력
 * 
 * 	객체의 구성 : 데이터(속성, 상태)+기능(행위)
 * 클래스의 구성 : 변수 + 메소
 */
import java.util.*;
class Rect{	//클래스의 정의(설계)
	/* 멤버 변수 선언
	 * 
	 * 전역 변수 : 클래스 전체 안에서 활동가능한 변수
	 * 지역(멤버) 변수 : 클래스에 소속되어 있는 변수
	 * 인스턴스 변수 : 인스턴스가 생성될때를 의미함
	 * 
	 * Rect re = new Rect();
	 * 
	 */
	//가로, 세로 멤버 변수 선언
	int w, h;
	//메소드 정의 (가로/세로 입력)
	//void : 메소드 실행 후 메소드를 호출한 곳에 결과를 돌려줄 필요가 없을 때 사용함
	
	
	
	
	void input() {
		
		Scanner sc = new Scanner(System.in);// 인스턴스 생성
		
		System.out.println("가로 입력");
		w = sc.nextInt();
		System.out.println("세로 입력");
		h = sc.nextInt();
	}

int area() {
	
	int result ;
	result = w * h;
	
	return result;
}
/*
 * 	메소드는 리턴 (return)문을 통해서만 결과를 둘려주게(반환하게) 된다.
 * 
 * 
 * 
 */
int length() {
	
	int result;
	result = 2*(w+h);
	return result;
}
/*	출력 메소드 정의
 * 
 *  메개 변수를 통해 데이터를 넘겨 받음 (가지고 있지 않는 데이터)
 *  메소드의 매개 변수는 메소드 내에서만 활동 가능하다.
 *  매개변수 선언시 각각의 변수마다 자료형의 따로 지정해야함
 *  
 * 
 * 
 * 
 */
	void print (int a, int i) {
		
		
		System.out.println("가로 : "+w);
		System.out.println("세로 : "+h);
		System.out.println("넓이 : "+a);
		System.out.println("둘레 : "+i);
	}
}


public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.인스턴스 생성
		Rect r = new Rect();
		
		//입력 메소드 호출
		r.input();
		
		// 넓이와 둘레 메소드 호출
		int a = r.area();	//넓이
		int b = r.length();//둘레
		
		// 출력 메소드 호출
		r.print(a, b);
		
		
		
		
		
		

	}

}
