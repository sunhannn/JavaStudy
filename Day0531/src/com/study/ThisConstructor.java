package com.study;
class House {
	
		int price;	// 멤버변수
		int size;
		String dong;
		String kind;


	public House() {	//기본 생성자
		this(100, 32, "상계동","아파트");
		
		
	}
	
	public House(int price) {
		this(price, 32, "상계동","아파트");
		
		
	}
public House(int price, int size) {
	this(price, size, "상계동","아파트");
		
		
	}
public House(int price, int size, String dong) {
	this(price, size, dong,"아파트");
	
	
}
public House(int price, int size, String dong,String kind) {
	//초기 작업
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	
	
}
public class ThisConstructor {

	public void main(String[] args) {
			//객체 생성
		House h1 = new House();	// 100, 32 , 상계동, 아파트
		System.out.println("House1 price = "+h1.price+"House 1 size = "+h1.size);
		House h2 = new House(300);	//	300, 32 , 상계동, 아파트
		House h3 = new House(300,40);	// 300, 40, 상계동, 아파트
		House h4 = new House(300,40,"서초동"); // 300 ,40, 서초동, 아파트
		House h5 = new House(300,40,"서초동","빌라"); // 300, 40, 서초동, 아파트
		
		
		
		
		
		
		
	}
}
}
