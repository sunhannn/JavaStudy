package Study;
import java.util.*;


public class Practise003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;//사용자로부터 입력받는 정수
		String s;//홀수인지 짝수인지 판별하는 변수
		
		System.out.println("정수입력 : ");
		i = sc.nextInt();
				
		s = i%2 == 0 ? "짝수":"홀수";
	
		
		if(i % 2 == 0) {
		 s = "짝수";
		}else {
		System.out.printf("당신이 입력하는 정수는 "+s+" 입니다.");
		}
		
		
		

	}

}
