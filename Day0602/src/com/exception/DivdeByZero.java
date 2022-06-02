package com.exception;
import java.util.*;
public class DivdeByZero {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		// 나뉨수	
		int dividend;
		// 나눌수
		int divisor;
		
		System.out.println("나뉨수 입력 : ");
		dividend = sc.nextInt();
		System.out.println("나눌수 입력 : ");
		divisor = sc.nextInt();
		
		try {
		
		System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend / divisor+"입니다.");
		
		}catch(ArithmeticException ae) {
			//ae.printStackTrace();
			//ae.getMessage();
			System.out.println("0으로 나누기는 불가능");	
		}
	}

}
