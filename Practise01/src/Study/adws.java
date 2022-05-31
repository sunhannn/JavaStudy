package Study;
import java.util.*;
public class adws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a, b, n, i, sum = 0;
		
		System.out.println("수 1을 입력 :  ");
		a = sc.nextInt();
		
		System.out.println("수 2를 입력 : ");
		b = sc.nextInt();
		
		System.out.println("합계 구할 배수 입력 : ");
		n = sc.nextInt();
		
		
		if (a > b) {
			a = a ^ b;
			b = b ^ a;
			a=  a ^ b;
		}
		
		for (i = a; i<=b; i++ ) {
			if (i%n==0) {
				sum += i;
				
			}
		}
		System.out.println();
		System.out.println(a+"에서 "+b+"사이의 배수의 합은 "+sum+" 입니다.");
		
		

	}

}
