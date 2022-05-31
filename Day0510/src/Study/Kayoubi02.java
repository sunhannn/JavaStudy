package Study;
/*	임의의 숫자가 들어있는 배열의 숫자 데이터들 중 
 * 짝수인 요소만 골라서 출력하고,
 * 3의 배수인 요소만 골라서 출력하는 프로그램을 구현하시오.
 * 
 * 	임의의 숫자 : 4, 7, 9, 1, 3, 2, 5, 6 ,8
 * 
 * 1. 배열의 전체 요소 출력
 * 2.	짝수 출력
 * 3.	3의 배수만 출 : 9, 3, 6
 * 
 */
import java.util.*;

public class Kayoubi02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			int arr [] = {4, 7, 9, 1, 3, 2, 5, 6, 8};
			
			/*
		for (int i = 0 ; i < 9 ; i++) {
			System.out.println("정수 입력 : ");
			arr[i] = sc.nextInt();
			 */
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
			System.out.printf("%4d",arr[i]);
				
			
		}
		System.out.println();
		
		for (int i = 0; i <arr.length;i++) {
			if(arr[i]%3 == 0)
			System.out.printf("%4d",arr[i]);
		}
		
		System.out.println();
		

	}

}
