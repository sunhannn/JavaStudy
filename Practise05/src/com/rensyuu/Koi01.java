package com.rensyuu;
import java.util.*;
public class Koi01 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 3개를 입력하세요.");
		
		int sum = 0, n;
		
		for (int i = 0; i < 3;i++) {
			System.out.println(i+1+"번째 정수 입력 : ");
			try {
				n = sc.nextInt();
				sum += n;
			}catch(InputMismatchException e) {
				System.out.println("문자 입력 못해요~");
				sc.nextLine();
				i--;
				continue;
			}
		}
		System.out.println("정수 3개의 합계 : "+sum);
	}
	
	
	
}
