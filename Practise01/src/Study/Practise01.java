package Study;
import java.util.*;

public class Practise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m;
		
		System.out.println("현재 월을 입력하시오 : ");
		
		m = sc.nextInt();
		
		switch (m) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("현재는 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("현재는 여름입니다.");
		case 9 :
		case 10 :
		case 11 :
			System.out.println("현재는 가을입니다.");
		break;
		default :
			System.out.println("현재는 겨울입니다.");
		}
				
		
		
		
		
		

	}

}
