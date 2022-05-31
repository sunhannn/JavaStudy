package Study;

public class CharEx {

	
		//mport java.util.Scanner;
	
	public static void main(String[] args) {
	
		
		/* char : 2byte
		 * 아스키 코드 : 1byte 문자를 표현, 0~255 문자 범위
		 * 영어의 대소문자로 바꿀려면 32를 더하거나 빼면 된다.
		 *a는 65 A는 97이.
		 *
		 * - 유니코드 : 2바이트를 표현 (0~65535)까지 표현
		 * 
		 * 
		 */
		
		char ch1 = 'A';
		char ch2 = '\u0041';
		//유니코드이기 때문에 에러가 안난다.
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		System.out.println((char)ch1+ch2);
		//원래는 뒤에도 괄호를 잡는 것이 원칙(ch2)
		//문자는 싱글쿼터가 원칙이다.
		
		//Scanner sc = new Scanner(System.in);
		
		
		//System.out.println("문자 입력");
		//String str = sc.next();
		//System.out.println(str);
		
	}

}
