package Study;
import java.io.*;

public class Practise01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		char ch; // 문자를 저장할 변수
		String s = ""; //결과를 저장할 변수(모음이냐 자음이냐)
		
		
		System.out.println("알파벳 문자 입력 : ");
		ch = (char)System.in.read();
		
		s = ((ch>='a' && ch <= 'z') || (ch >='A' && ch <='Z')) ? "알파벳 맞음" : "알파벳 아님";
			    (((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ch == 'u') ||
					(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U')) ? 
							"모음" : "자음")
			    	: "알파벳이 아닙니다.";
		
		
		
		
		System.out.println(s);
		
	
		
		

	}

}
