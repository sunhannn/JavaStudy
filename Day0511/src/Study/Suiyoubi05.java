package Study;	
import java.util.*;
/*
 * 컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듬
 * 사용자가 먼저 3가지 중 하나를 입력하고 실행함
 * 컴퓨터는 랜덤으로 하나를 선택하여 사용자 와 비교함
 * 누가 이겼는지를 판단하고 사용자가 그만을 입력하면 게임을 종료함
 * 
 * 가위 바위 보 : 바위
 * 사용자 : 바위, 컴퓨터 : 가위, 사용자가 이겼습니다.
 * 
 * 가위 바위 보 : 바위
 * 
 *	String[] str = {"가위", "바위", "보"}
 *
 *	컴퓨터가 낸것이 바위 인지 비교
 *	int n =(int)(Math.random()*3);
 *	if(str[n].equals("바위")
 *
 */
public class Suiyoubi05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] com = {"가위", "바위", "보"};
		// 가위, 바위, 보 문자열을 저장한 배열
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
		while (true) {
			System.out.println("가위 바위 보 : ");
			String a = sc.next();
			if (a.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;	// 반복문을 탈출 프로그램을 종료
			}
			// 컴퓨터가 가위 바위 보 값을 랜덤으로 저장한다.
			int n = (int)(Math.random()*3);
			// 0 1 2 중에서 결정된 정수를 리턴
			String b = com[n];
			
			System.out.print("사용자 : "+a+", 컴퓨터 : "+b);
			
			//	사용자가 가위인 경우
			if (a.equals("가위")) {
				
				if (b.equals("가위")) {
					
					System.out.println("비겼습니다.");
					
				}else if (b.equals("바위")) {
					System.out.println("컴퓨터가 이겼습니다.");
				}else {
					
					System.out.println("사용자가 이겼습니다.");
				}
				
				
			}else if (a.equals("보")) {
				
				if (b.equals("가위")) {
					System.out.println("컴퓨터가 이겼습니다.");
					
				}else if (b.equals("바위")) {
					System.out.println("사용자가 이겼습니다.");
				}else {
					
					System.out.println("비겼습니다.");
				}
				
				
			}else if (a.equals("바위")) {
				
				
				if (b.equals("가위")) {
					System.out.println("사용자가 이겼습니다.");
					
				}else if (b.equals("바위")) {
					System.out.println("비겼습니다.");
				}else {
					
					System.out.println("컴퓨터가 이겼습니다.");
				}
				
				
			}else {
				System.out.println("다시 입력하세요.");
			}
			
			
		
		}
		
		
		
					
			
		
		
		

	}

}
