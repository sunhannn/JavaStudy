package Study;
import java.util.*;
public class Practise1111 {
	/*
	 * 	사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성
	 * 만약에 사용자로부터 5를 입력받다면, 3 6 9 12 15를 출력하시오.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1, i = 1;
		
		System.out.println("정수 입력 : ");
		n=sc.nextInt();
		
		while(i <= n) {
			System.out.println(i*3+"\t");
			i++;
			
		}
		System.out.println();
		
		

	}

}
