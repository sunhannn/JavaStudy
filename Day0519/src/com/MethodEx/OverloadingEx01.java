package com.MethodEx;
/*	
 * 	메소드 오버로딩
 * 
 * - 동일한(하나의)클래스에서 같은 이름을 가진 메소드가 여러 개 정의되는 것을 의미함
 * - 같은 이름의 메소드에 인자(매게변수)가 다른 경우
 * - 인자가 다르다는 것은 인자의 개수가 다르거나, 자료형이 다르거나 인자의 수가 다른것을 의미함
 * 
 * 
 */
public class OverloadingEx01 {
	public void intLength(int a) {
	      String s = String.valueOf(a);
	      System.out.println("입력한 값의 길이 : " + s.length());
	   }

	public static void main(String[] args) {
		
		 OverloadingEx01 oe1 = new OverloadingEx01();
		 oe1.intLength(1000);
		 
		
		
		
		
		
		
		
		

	}

}
