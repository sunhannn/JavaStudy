package com.exception;

public class NumExcep {

	public static void main(String[] args) {
		
		String [] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
		for (i = 0; i < stringNumber.length;i++) {
			int n = Integer.parseInt(stringNumber[i]);
			System.out.println("정수 변환 된 값은 "+n);
		}
		
		}catch(NumberFormatException n) {
			System.out.println("정수로 변환 불가능");
		}
		
		
	} 

}
