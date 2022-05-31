package Study;
/*	문제)
 * 키보드로 돈의 액수를 입력받아 오만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원, 일원으로 변환
 * 단, 배열과 반복문을 사용
 * 
 *  배열명 : unit
 *  
 * 
 */
import java.util.*;
public class Suiyoubi04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		int money = 0;
		System.out.println("돈 입력 : ");
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			//	동전 개수 계산
			int res = money / unit[i];
			
			//res 몫이 있는 경우
			if (res > 0) {
				System.out.println(unit[i]+"원 짜리"+res+"개");
				money = money % unit[i];//money 갱신
			}
		}
		
	
	}

}
