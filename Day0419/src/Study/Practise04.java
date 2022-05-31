package Study;
import java.util.*;

public class Practise04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s, g;
		
		System.out.println("학년을 입력하시오 : ");
		g = sc.nextInt();
		
		System.out.println("점수를 입력하시오 : ");
		s = sc.nextInt();
		
		if(s >= 60) {
			if(g < 4) {
				System.out.println("합격입니다.");
			}else if(g == 4) {
				if(s >= 70) {
					System.out.println("합격입니다.");
					if(s < 70) {
						System.out.println("불합격입니다...");
					}
				}
			}
		}else {
			System.out.println("불합격입니다...");
			
		}
			
		
		
		
		
		
		
		

	}

}
