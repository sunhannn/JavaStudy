package Study;
import java.io.IOException;

public class ImpEx003 {

	public static void main(String[] args)throws IOException {
		/*
		 * 숫자 하나 입력
		 * - System.in.read()- 48 or '0'
		 *  
		 * 
		 */
		
		int num1;
		int num2;
		System.out.println("숫자 1 : ");
		num1 = System.in.read() - 48;
		System.in.read();//\r
		
		System.in.read();//\n
		
		
		System.out.println(num1);
		//2개 이상 입력이 안된다
		System.out.println("숫자 2 : ");
		num2 = System.in.read() - 48;
		
		System.out.println(num1+","+num2);
		
		
		

	}

}
