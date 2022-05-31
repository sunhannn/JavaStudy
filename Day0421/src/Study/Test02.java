package Study;
import java.util.*;

public class Test02 {
	/* 사용자로부터 임의의 정수를 입력받아
	 * 입력받은 정수가 2의배수인지, 3의 배수인지,
	 * 2와 3의 배수인지, 2와 3의 배수가 아닌지 판별하여
	 * 결과를 출력하는 프로그램을 구현한다.
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("정수를 입력하시오 : ");
		a = sc.nextInt();
				
		
		/*if(a % 2 == 0) {
			System.out.println("2의 배수요");
		
		}else if (a % 3 == 0) {
			System.out.println("3의 배수요");
		}else if (a % 6 == 0) {
			System.out.println("2와 3의 배수네요");
		}else if (a == 0) {
			System.out.println("0을 입력했네요");
		}else {
			System.out.println("2의 3의 배수도 아니네요");
		*/
		if(a % 2 == 0) {
	
			if(a % 2 == 0 && a % 3 == 0) {
				System.out.println("2와 3의 배수네요");
			}else {
				System.out.println("2의 배수요");
			}
		}else if (a % 3 == 0) {
			System.out.println("3의 배수요");
		}else {
			System.out.println("2의 배수도 3의 배수도 아니네요");
		}
		
		
	}

}
