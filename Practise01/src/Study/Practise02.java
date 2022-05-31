package Study;
import java.io.*;

public class Practise02 {
	/*
	 *	임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램을 구현 
	 * 자음이면 자음이라고 줄력, 모음이면 모음이라고 출력
	 * 단, 대소문자 모두 적용하고, 알파벳이외의 문자가 입력되면 입력 오류 처리
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		char ch;
		System.out.println("알파벳을 한 개 입력하세요 : ");
		
		ch = (char)System.in.read();
		
		if (ch >= 'a' && ch <='z' || (ch >= 'A' && ch <= 'Z')) {
			if (ch  == 'a' || ch == 'e' || ch ==  'u' || ch == 'o') {
				
			}
		}
		

	}

}
