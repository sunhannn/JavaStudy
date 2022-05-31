package Study;
import java.io.*;

public class Practise001 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch;
		
		System.out.println("알파벳 한글자 입력 : ");
		ch = (char)System.in.read();
		
		
		if (ch>= 65 && ch <=90 ) {
			ch += 32;
			
			
		}else if (ch >= 97 && ch <= 122) {
			ch -=32;
			
					System.out.println(ch);
		}else {
			System.out.println("입력 오류");
		}
		
		
		
	}

}
/*	대문자를 입력받았을 결우 소문자로 변환
 * 소문자를 입력 받았을 경우 대문자로 변환
 * 
 */
