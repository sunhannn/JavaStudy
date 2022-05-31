package Study;
import java.util.*;
public class Test003 {
/*	사용자로부터 임의의 정수를 입력받아
 * 1부터 입력받은 수까지의 전체의 합계, 짝수의 합계, 
 * 홀수의 합을 각각 출력하는 프로그램을 구현하고
 * 10단위로 합계를 출력하시오.
 * 
 * 	1~10
 * 1~20
 * 1~30
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, sum = 0, even = 0, odd = 0;
		
		System.out.println("정수 입력 : ");
		a=sc.nextInt();
		
		for (int i = 1;i<=a;i++) {
		
			if (i % 2 == 0) {
				even += i;
			}else {
				odd+=i;
				sum = sum +i;
			if(i==a) {
				System.out.println("1 ~"+a+"까지의 전체의 합계"+sum);
				System.out.println("1 ~"+a+"까지의 짝수의 합계"+even);
				System.out.println("1~"+a+"까지의 홀수의 합계"+odd);
				
			
			}else if (i % 10 == 0) {
				System.out.println("1 ~"+a+"까지의 전체의 합계"+sum);
				System.out.println("1 ~"+a+"까지의 짝수의 합계"+even);
				System.out.println("1~"+a+"까지의 홀수의 합계"+odd);
				System.out.println();
			}
			
			
			
			}
			
		
		
		
		}
		
		
		
		

	}

}
