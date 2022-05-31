package com.constex;

public class CircleEx01 {

	public static void main(String[] args) {
		
			Circle c = new Circle(10, "원");
		
		System.out.println("원의 반지름은 "+c.radius+", 이고 이름은 "+c.name+"입니다.");
		System.out.println("원의 넓이는 "+c.getArea()+"입니다.");
		
		
		
		
	}

}
