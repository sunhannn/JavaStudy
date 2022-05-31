package com.inherex;

		class PointEx{
			private int x;
			private int y;
			
			public PointEx() {}
			public PointEx(int x) {this.x = x;}
			public PointEx(int x,int y) {this(x); this.y = y;}
			
			public void disp() {
				System.out.println("x value is "+x);
				System.out.println("y value is "+y);
				
			}
		}




public class CircleEx  extends PointEx{

	private int r;
	
	public CircleEx () {
		
		
	}
	

	public CircleEx(int x) {
		super(x);
		r=1;
	}
	
	public CircleEx(int x,int y) {
		super(x,y);
		r=2;
	}
	
	public CircleEx(int x,int y,int r) {
		super(x,y);
		this.r = r;
	}
	
	//@override
	public void disp() {
		super.disp();
		System.out.println("r : "+r);
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		CircleEx c = new CircleEx();
		c.disp();

	}

}
