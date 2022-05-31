package Study;
import java.io.*;

public class Practise04 {

	public static void main(String[] args) throws IOException{
		
		int a, b;
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		
		System.out.println("첫번 째 수를 입력 :");
		a = Integer.parseInt(br.readLine());
		
		System.out.println("연산자를 입력 : ");
		char o = (char)System.in.read();
		System.in.read();

		
		System.out.println("두번 째 수를 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.printf("%d %c %d = %d\n",a, o, b, (a+b));
		
		
		
		
		
		
		
		

	}

}
