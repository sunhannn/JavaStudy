package Study;
import java.util.Scanner;

public class practise002 {

	public static void main(String[] args) {
		// 임의의 정수를 입력 받아 입력받은 수가 짝수인지 판정하시오.
		//
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		char op;
		String s;
		
		System.out.println("첫번째 정수 입력 : ");
		a = sc.nextInt();
		
		
		
			System.out.println("연산자 입력 : ");
		 
		s= sc.next();//스캐너 할때 charAt를 붙여야한다. 0을 넣어야 함
		
		
		
		System.out.println("두번째 정수 입력 : ");
		
		b = sc.nextInt();
		
		if(s == "+") {
			
		System.out.printf("%d %c %d = %d\n",a,s,b,(a+b));
		
		}else if(s == "-") {
			System.out.printf("%d %c %d = %d\n", a ,s, b,(a-b));
			
		}else if(s == "*") {
			System.out.printf("%d %c %d = %d\n",a,s,b,(a*b));
		}else if(s == "/") {
			System.out.printf("%d %c %d = %d\n",a,s,b,(a/b));
		}else if(s == "%") {
			System.out.printf("%d %c %d = %d\n",a,s,b,(a%b));
		}else {
			System.out.println("연산자가 아닙니다.");
		}
		
		
		
		
		
				
		
		
		
		

	}

}
