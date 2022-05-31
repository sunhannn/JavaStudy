package Study;
import java.util.*;

public class Practise004 {
	/*	정수 두개를 입력받아 두 수 사이의 수들을 합계를 구하는 프로그램을 작성하시오.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, n = 0;
		int sum = 0;
		
		
		System.out.println("수 1을 입력 : ");
		a = sc.nextInt();
		
		System.out.println("수 2을 입력 : ");
		b = sc.nextInt();
		
		if (a<b) {
			for (n=a;n<=b;n++) {
				sum = sum+n;
				System.out.println("합계는 "+sum+" 입니다.");
				// a = a ^ b;
				// b = b ^ a;
				// a = a ^ b;
				
				// temp = a;
				//a = b;
				//b = temp;
			}
		}else {
			for (n = b;a>=n;n++) {
				sum = sum + n;
				System.out.println("합계는 "+sum+" 입니다.");
			}
		}
		
		
		

	}

}
