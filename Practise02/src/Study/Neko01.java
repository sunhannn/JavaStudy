package Study;
import java.util.*;

public class Neko01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int max, min, num;
		
		while (true) {
		int i = 0;
		max = 99;
		min = 0;
		
		num = r.nextInt(100);
		System.out.println("숨겨진 숫자를 맞춰보시오 : ");
		
		while (true) {
			System.out.println("입력할 수 있는 범위"+min+"~"+max+"입니다");
			int n = 0;
			n = sc.nextInt();
			if (n > max || n <min) {
				System.out.println("입력 범위를 초과했습니다.");
			}else {
				if (n == num) {
					System.out.println("당첨이여~");
					break;
					
				}else if (n > num) {
					System.out.println("더 낮은 값을 입력하시오");
					max = n;
					
				}else {
					System.out.println("더 큰 값을 입력하시오");
					min = n;
					
				}
			}
			i++;
		}
		System.out.println("계속 게임을 하시겠습니까?");
			if(sc.next().equals("n"))
				break;
		}
		
		
		
		

	}

}
