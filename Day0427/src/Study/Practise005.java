package Study;
import java.util.*;
public class Practise005 {
/*
 * 	두개의 정수와 배수 n 값을 입력받아 두 수 사이의 n값을 배수의 합을 구하는 프로그램을 작성하시오.
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, n, i, sum = 0;
		
		System.out.println("수 1을 입력 : ");
		a = sc.nextInt();
		
		System.out.println("수 2를 입력 : ");
		b = sc.nextInt();
		
		System.out.println("합을 구할 배수 입력 : ");
		n = sc.nextInt();
		
		if (a > b) {//첫번째 정수가 큰 경우에만 수행
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
			
			
		}
		
		for (i = a; i<=b; i++) {
			if (i % n == 0) {
				sum += i;
			}
	}
	System.out.println();
	System.out.println(a+"에서 "+b+"사이의 배수의 합계는 "+sum+" 입니다.");
	
	}
}
