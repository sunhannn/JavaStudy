package com.study;

public class OverloadingTestEx {

	public int area(int w, int h) {
		return w*h;
		
		
	}
	public double are(int r) {
		return (double)r*r*3.14;
		
		
	}
	
	public void write(double result) {
		System.out.println("원의 넓이 : "+result);
		
	}
	
	
	public static void main(String[] args) {
		
			OverloadingTestEx ot = new OverloadingTestEx();
			int res = ot.area(10, 5);
		double cc = ot.are(10);
		
		ot.write(res);
		ot.write(cc);
		
	}

}
