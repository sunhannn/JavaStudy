package Study;
import java.util.*;

public class suiyoubi03 {
/*	
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		String str = "";
		
		while(true) {
			System.out.println("1. 콜라 2.사이다 3, 마운틴듀 4. 초코송이 5. 에이스 6.웨하스 0.종료");
			n = sc.nextInt();
			
			switch (n) {
			
			case 1:
				str = "콜라";
				break;
			case 2:
				str = "사이다";
				break;
			case 3:
				str = "마운틴듀";
				break;
			case 4 :
				str = "초코송이";
				break;
			case 5 :
				str = "에이스";
				break;
			case 6 :
				str = "웨하스";
				break;
			case 0 :
				
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			if ( n == 0) {
				System.out.println("종료하겠습니다.");
				break;
			}else {
				System.out.println(str+"를 선택하겠습니다.");
				break;
			}
			
		}
			
		
		
		
		

	}

}
