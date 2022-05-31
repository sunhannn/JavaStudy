package Study;
import java.util.*;
public class Exam01 {
/*	숨겨진 카드 수를 맞추는 게임
 * 
 * 0에서부터 99까지 임의의 수를 가진 카드를 한장 숨기고
 * 이 카드 수를 맞추는 게임임
 * 카드 속의  수가 77이라면 수를 맞추는 사람이 55를 입력하면
 * 더 높게 다시 70을 입력하면 더 높게 라는 식으로 범위를 좁혀가면서
 * 게임을 맞추는 것임
 * 게임을 반복하기 위해 y/n을 묻고, n인 경우는 종료함
 * 
 * 	컴퓨터가 숨길 수를 임의롷 선택학;ㅣ 위해 Random 클래스를 사용함
 * Random 클래스 사용법은 1.import java.util*;
 * 									  2. Random r = new Random();(main()메소드 안에 작성)
 * 										int i = r.nextInt(100):을 의미는	
 * 										0~99까지의 임의의 정수를 생성함
 * 	String str = sc.next();
 * if(str.equals("n")){
 * System.exit(0);
 * break;
 * 
 * 
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int NUMBER_MIN = 0;
		
        final int NUMBER_MAX = 99;

       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bestScore = 0;

      
        while (true) {
            
        
            System.out.println("1.플레이  2.기록 보기  3.종료");
            System.out.println("> ");
            int userChoice = scanner.nextInt();

         
            if (userChoice == 1) {

                
                int computerNumber = random.nextInt(NUMBER_MAX) + 1;

             
                int currentScore = 1;

               
                System.out.println("0 ~ 99 사이의 숫자를 입력해주세요.");
                System.out.println("> ");
                int userNumber = scanner.nextInt();

            
                while (userNumber < NUMBER_MIN || userNumber > NUMBER_MAX) {
                    System.out.println("잘못 입력하셨습니다");
                    System.out.println("0 ~ 99 사이의 숫자를 입력해주세요.");
                    System.out.println(">");
                    userNumber = scanner.nextInt();

                }

        
                while (userNumber != computerNumber) {
                    if (userNumber > computerNumber) {
                        System.out.println("DOWN");

                    } else {
                        System.out.println("UP");
                    }

               
                    System.out.println("0 ~ 99 사이의 숫자를 입력해주세요.");
                    System.out.println("> ");
                    userNumber = scanner.nextInt();

                    
                    while (userNumber < NUMBER_MIN || userNumber > NUMBER_MAX) {
                        System.out.println("잘못 입력하셨습니다");
                        System.out.println("0 ~ 99 사이의 숫자를 입력해주세요.");
                        System.out.println(">");
                        userNumber = scanner.nextInt();

                    }
                   
                    currentScore++;
                }

               
                System.out.println("정답입니다!");
                System.out.println("사용자의 입력 횟수: " + currentScore);

                if (bestScore > 0) {
                    System.out.println("기존 최고 기록: " + bestScore);
                }

                
                if (currentScore < bestScore || bestScore == 0) {
                    System.out.println("새로운 최고 기록입니다!");
                    bestScore = currentScore;
                }

               
            } else if (userChoice == 2) {

                
                if (bestScore > 0) {
                    System.out.println("현재 최고 기록: " + bestScore + "회");
                } else {
                    System.out.println("아직 플레이 기록이 존재하지 않습니다.");
                }

              
            } else if (userChoice == 3) {
                System.out.println("종료!");
                break;
            }
        }

        scanner.close();



		

	}

}
