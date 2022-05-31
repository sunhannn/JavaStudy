package Study;
import java.util.*;

public class Test01 {
	/*	임의의 정수를 입력받아 짝수인지, 홀수인지, 홀수인지, 0인지를 판정하는
	 * 프로그램을 작성하시오.
	 * 단, 이 외의 것이 들어오면 판정 불가를 출
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		System.out.println("정수를 입력하시오 : ");
		a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("짝수요");
		}else if (a % 2 == 1) {
			System.out.println("홀수요");
			
		}else if (a == 0) {
			System.out.println("0이요");
		}else {
			System.out.println("이상한 수 넣은듯");
		}
		/* if(a % 2 !=0)
		 * system.out.println("홀수")
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		

	}

}
