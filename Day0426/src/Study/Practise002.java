package Study;
import java.util.*;

public class Practise002 {
/*사칙 연산을 입력받아 계산하는 프로그램을 작성하시오.
 * 연산자는 +,-,*,/ 네가지로 모두 실수로 처리함
 *
 *피연산자와 연산자는 빈칸으로 분히하여 입력
 *0으로 나누기 시 "0으로 나눌수 없습니다."를 출력하고 종료함
 *
 * switch ~ case 문을 이용하여ㅛ 작성
 * 연산자는 Scanner를사용하여 문자열로 입력받으시오.
 * 
 * 
 */
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String o;
		int a, b, c = 0;
		
		
		System.out.println("수 1을 입력하시오 : ");
		a = sc.nextInt();
		
		System.out.println("수 2를 입력하시오 : ");
		b = sc.nextInt();
		
		System.out.println("연산자를 입력하시오 : ");
		o = sc.next();
		
		switch (o) {
		
		case "+":
			c = a + b;
			break;
		case "-":
			c = a - b;
			break;
		case "*":
			c= a * b;
			break;
		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}else {
				c = a / b;
				break;
			}
		default:
			System.out.println("잘못된 값을 입력");
			break;
			
		}
			
		
		System.out.println("값은 "+c+" 입니다.");
		
		
		
		

	}

}
