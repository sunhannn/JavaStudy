package Study;
import java.util.*;
public class Practise06 {
/* 양의 실수 입력받아 입력받은 합의 평균을 구하는 프로그램 구현
 * 단, 음의 실수가 입력되면 계산하시오.
 * 
 * 양의 실수 입력 : 1.1
 * 양의 실수 입력 : 2.2
 * 양의 실수 입력 : 3.3
 * 양의 실수 입력 : 4.4
 * 양의 실수 입력 : -5.5
 * 지금까지의 평균 : 2.2
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float total, input;
		
		total=input=0.0f;
		
		int count = 0;
		
		for (;input>=0.0;) {
			total = total + input;
			System.out.println("양의 실수 입력 : ");
			input = sc.nextFloat();
			count++;
		}
		System.out.println("지금까지의 평균 : "+total/count);
		
		
		
		

	}

}
