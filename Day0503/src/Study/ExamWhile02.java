package Study;
import java.util.*;
public class ExamWhile02 {
/*	사용자가 입력하는 정수를 계속해서 더해 나아감
 * 만약 0이 입력되면 지금까지 입력된 정수의 덧셈 결과를 출력하고 종료함
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int n=0, sum = 0;
		
		while(true) {
			System.out.println("수를 입력하시오 : ");
			n=sc.nextInt();
			if(n == 0) {
				System.out.println("지금까지의 합계 : "+sum);
				break;
			}else {
				sum += n;
			}
			
		}
		
		
		
		
		
	}

}
