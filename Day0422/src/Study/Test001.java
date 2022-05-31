package Study;
import java.io.*;
public class Test001 {
	/*	두정수와 연사자를 입력받아 계산하는 프로그램을 구현
	 * switch ~ case
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		int a, b;
		char o;
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
			System.out.println("수 1을 입력 : ");
			a = Integer.parseInt(br.readLine());
			
			System.out.println("수 2를 입력 : ");
			b = Integer.parseInt(br.readLine());
			
			System.out.println("연산자 입력 : ");
			o = (char)System.in.read();
		
			int tot = 0;
			
			switch (o) {
			
			case '+':
				 tot = a+b;
				break;
			case '-':
				tot = a-b;
				break;
			case '*':
			tot = a*b;
			break;
			case '/':
				tot=a/b;
				break;
			case '%':
				tot = a%b;
				break;
				default:
					System.out.println("잘못된 연산자 입력");
			}
	System.out.println();
	System.out.println(a+""+ o +"" + b+"="+tot);

	}

}
