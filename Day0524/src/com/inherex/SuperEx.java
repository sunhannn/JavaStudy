package com.inherex;
		class Super {	//부모 클래스
				
				int a = 5;	//부모 클래스 멤버 변수
				
			public Super(int x) {
				System.out.println("부모 클래스 생성자 : "+x);
				
				
				
			}
			
		}

		class Sub extends Super{
			int a = 10;
			
			public Sub() {
				super(5);
				System.out.println("자식 클래스의 생성자 : ");
				
			}
			
			public void test() {
				System.out.println(this.a);
				System.out.println(super.a);
				
				
			}
			
			
		}
public class SuperEx {
	

	
	
	public static void main(String[] args) {
		

		Sub s = new Sub();
		
		s.test();
		
		
		
		
		
	}

}
