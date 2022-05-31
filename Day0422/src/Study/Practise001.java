package Study;
import java.util.*;

public class Practise001 {
/*
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세여 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		switch(m) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절을 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절을 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절을 가을입니다.");
			break;
		default:
		//case 12: case1: case2:
			System.out.println("현재의 계절은 겨울입니다.");
		}
	
		
		

	}

}
