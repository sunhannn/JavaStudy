package Study;
import java.io.*;

public class Test002 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		char ch;
		
		System.out.println("알파벳 하나 입력 : ");
		ch =(char)System.in.read();
		
	String st;
		
		if (ch >= 'a' && ch <= 'z' || ch>='A' && ch <='Z') {
			st = (ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')?"모음" : "자음";
			System.out.println(st);
		}else {
		}System.out.println("문자입력오류");
	
		
		

	}

}
