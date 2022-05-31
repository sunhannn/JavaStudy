package Study;
import java.util.*;

public class Practise001 {
	/* 팩토리얼을 구하는 프로그램을 작성하시오.
	 * 사용자로부터 n이라고하는 수를 입력받아 n!를 계산해서 출력
	 * 
	 * n! = 1*2*3*4*5...
	 */

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a,i = 1;
		int sum = 1;
		
		System.out.println("수를 입력하시오 : ");
		a=sc.nextInt();
		
		for (i=1;i<=a;i++) {
			sum*=i;//sum= sum*i
		}
		
		System.out.println(a+"값은 "+sum+" 입니다.");
		
		
		

	}

}
