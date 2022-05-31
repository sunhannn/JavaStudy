package Study;
import java.io.*;

public class Test002 {
	/*
	 *	임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램을 구현 
	 * 자음이면 자음이라고 줄력, 모음이면 모음이라고 출력
	 * 단, 대소문자 모두 적용하고, 알파벳이외의 문자가 입력되면 입력 오류 처리
	 * 
	 */

	public static void main(String[] args) throws IOException {
		
		char ch;
		
		System.out.println("알파벳 한 문자 입력 : ");
		ch = (char)System.in.read();
		
		if (ch >= 'a'&& ch <='z' || (ch >='A' && ch<='Z')){//모음
			if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u') {
				System.out.println("모음");
			}else if (ch == 'A' || ch == 'E' || ch =='I' || ch=='O' || ch == 'U') {
				System.out.println("모음");
			}else {
				System.out.println("자음");
			}
		}else {
			System.out.println("입력 오류 ");
		}
		
		
		
		
		

	}

}
