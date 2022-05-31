package Study;
import java.util.*;

public class delight01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int min = 0;
		final int max = 99;
		
		Random ran = new Random();
				
		int best = 0;
		
		while (true) {
			System.out.println("1. 플레이 2. 기록 보기 3. 종료");
			System.out.println("> ");
			int choice =sc.nextInt();
			
			
			if (choice == 1);
			int comnumber = ran.nextInt(max)+1;
			
			int score =1;
			
			System.out.println("0 ~ 99 사이의 숫자를 입력하시오");
			System.out.println("> ");
			int usernumber = sc.nextInt();
			
			
			while (usernumber<min || usernumber > max) {
				
				System.out.println("잘못 입력함");
				System.out.println("0 ~ 99 사이의 숫자를 입력해주세요");
				System.out.println("> ");
				
				usernumber = sc.nextInt();
				
			}
			while ( usernumber != comnumber) {
				if (usernumber > comnumber) {
					System.out.println("Down");
				}else {
					System.out.println("Up");
					
				}
				while (usernumber < min || usernumber > max) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("0 ~ 99 사이의 숫자를 입력해주세요");
					System.out.println("> ");
					usernumber = sc.nextInt();
					
				}
				score++;
				
			}
			
			System.out.println("정답입니다!!");
			System.out.println("사용자의 입력 횟수 : "+score);
			if (best > 0) {
			System.out.println("기존 최고 기록 : "+best);
			}
			if (score < best || best ==0) {
				System.out.println("새로운 최고 기록입니다!");
				best = score;
				
			}else if (choice == 2) {
				if (best > 0) {
					System.out.println("현재 최고 기록 : "+best+"회");
				}else {
					System.out.println("아직 플레이 기록이 존재하지 않습니다.");
				}
			}else if(choice == 3) {
				System.out.println("종료 !");
				break;
			}
		}
		
		
		
		
		sc.close();
		
		
	}

}
