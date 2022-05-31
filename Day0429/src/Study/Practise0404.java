package Study;
import java.util.*;

public class Practise0404 {
	/*	소문자 알파벳을 하나 입력 받고(Scanner 사용)
	 * 
	 * 다음과 같이 출력하는 프로그램을 작성하시오.
	 * 
	 * 알파벳 입력 : e
	 * 
	 *	abcde
	 *abcd
	 *abc
	 *ab
	 *a
	 *
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		char c;
		
		System.out.println("알파벳을 하나 입력하시오 : ");
		c = sc.next().charAt(0);
		
		for (char i = c;i>='a';i--) {
			for (char j ='a';j<=i;j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		

	}

}
