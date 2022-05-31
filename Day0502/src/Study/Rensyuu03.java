package Study;
import java.util.*;

public class Rensyuu03 {
/*문제 )
 * 	사용자가 입력하는 정수를 계속해서 더해 나간다.
 * 만약에 0에 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료되는 프로그램을 구현하시오.
 * 단, while 문 이용
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, sum = 0;
		
		while (n != 0) {//true로 할려면밑에 if 넣어야
		
		System.out.println("수 1을 입력하시오  : ");
		n = sc.nextInt();
		//if (n == 0) {
			//break;
		//}
		sum += n;
		System.out.println("지금까지의 합계 : "+sum);
		}
		
	}

}
