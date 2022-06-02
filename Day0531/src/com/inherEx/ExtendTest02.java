package com.inherEx;
	class Super{
		int x= 90;
		
		
		void superMethod() {
			System.out.println("super Method...");
		}
	}
	class Sub extends Super{
		int y = 10;
		void subMethod() {
			System.out.println("sub Method...");
			
		}
	}

	
	class Subsub extends Super{
		int z = 20;
		void subsubMethod() {
			System.out.println("subsub Method..");
			
		}
	}
public class ExtendTest02 {

	public static void main(String[] args) {
		Subsub ss = new Subsub();
		System.out.println(ss.x);
		System.out.println(ss.z);
		ss.subsubMethod();
		ss.superMethod();
		
		
		
		
	}

}
