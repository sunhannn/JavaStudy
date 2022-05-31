package Study;
import java.util.*;

public class Practise002 {
	/* 사용자로부터 임의의 정수를 입력받아 입력받은 정수가
	 * 짝수인지 홀수인지를 판정하는 프로그램을 작성하시오.
	 * 단, 조건삼항연산자를 이용하여 처리하시오
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		
		System.out.println("숫자를 입력하세요 : ");
		a = sc.nextInt();
		
		b = a % 2;
		
		if(b == 1) {
			System.out.println("입력하신 수는 홀수입니다.");
		}else {
			System.out.println("입력하신 수는 짝수입니다.");
		}
		
		
		
		
		
		
		
		

	}

}
