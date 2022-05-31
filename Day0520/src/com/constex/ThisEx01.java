package com.constex;
/*
 * 	this : 객체 자신을 가리키는 레퍼런스임(참조)
 * 	
 * 			this는 컴파일러에 의해 자동으로 관리되므로 개발자는 this를 사용하기만 하면 됨
 * 
 * 
 * 
 */

		class CircleEx001{
			int radius;
			
			public CircleEx001(int r) {
				this.radius = r;
				
				
			}
		
			
		public int getRadius() {
			return radius;
			
			
		}
			public CircleEx001() {
				this(10,10,10);	// 생성자에서 다른 생성자를 호출할 때 this 사용
				//	생성자에서 다른 생성자를 호출할 때 	반드시 첫번째 줄에 두어야 한다.
				// 다른 메소드는 사용 불가능
			}
		
		public CircleEx001(int radius, int a, int b) {
			
			radius = radius;
		}
		}
public class ThisEx01 {

	public static void main(String[] args) {
			
		
		
		
		
		
		

	}

}
