package Study;
import java.util.*;

public class Test004 {
/*	입력된 정수의 평균을 구하는 프로그램을 구현하시오.
 * 	1. 제일 먼저 입력할 정수의 개수를 사용자로부터 입력 받는다.
 * 	2. 입력받은 수만큼 평균값을 구하여 출력한다.
 * 	단, 평균 값은 실수로 처리한다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, sum = 0;
		double avg = 0;
		
		System.out.println("입력할 정수의 개수 : ");
		a =sc.nextInt();
		
		for(int i = 0;i<=a;i++) {
			System.out.println("정수 입력 : ");
			b = sc.nextInt();
			sum = sum + b;
		}
		avg = sum/a;
		
		System.out.printf("입력한 정수의 평균 : %.2f\n",avg);
		
	}

}
