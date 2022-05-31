package com.constex;

public class ThisEx {

	String name, jumin, tel;
		
		public ThisEx() {
			name = "Guest";
			jumin = "000000-0000000";
			tel = "000-0000-0000";
			
		}
	
	
		public ThisEx(String name) {
		
			this();
			this.name = name;
			
		}
		public ThisEx(String name,String jumin) {
			
			this(name);
			this.jumin = jumin;
			
		}
		
		public ThisEx(String name,String jumin, String tel) {
			
			this(name);
			this.tel = tel;
			
		}
		
	
	public static void main(String[] args) {
		
		ThisEx t = new ThisEx();
		System.out.println("Name : "+t.name);
		System.out.println("Jumin : "+t.jumin);
		System.out.println("Tel :"+t.tel);
		
		
		
		
		
		
		
		

	}

}
