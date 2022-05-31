package Study;
import java.io.*;

public class Practise03 {

	public static void main(String[] args) throws IOException{

		/*임의의 두 정수와 연산자를 입력받아 산술연산 프로그램을 구현하시오
		 * 단, 산술연산자는(+,-,*,/,%)
	     */
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
			
			
			
			System.out.printf("%d %c %d = %d\n",a, o, b, (a+b));
			
		
		
		
		
		
		
		
		
		
		

	}

}
