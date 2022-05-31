package Study;

import java.io.*;

public class Suiyoubi03 {
	
	public static int plus(int x, int y) {	// +
		return x + y;
		
	}
	
	public static int min(int x,int y) {	// -
		return x - y;
		
	}
	
	public static int mul(int x,int y) {	// *
		return x * y;
		
	}

	public static int div(int x,int y) {	// /
		return x / y;
		
	}
	
	
	public static int per(int x,int y) {	// /
		return x % y;
		
	}
	
	public static void disp(int a, char b, int c, int d) {	// a 첫번째 수, b 연산자, c 두번째 수, d 결과 값
		
		System.out.println("\n"+a+" "+b+" "+c+" = "+d);
		
		
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//	변수 선언
		int su1 = 0, su2 = 0, tot=0;
		char yon = 0;
		
		
		System.out.println("첫번째 수 : ");
		su1 = Integer.parseInt(br.readLine());
		// 연산자
		do {
			System.out.println("yon(+,-,*,/,%) : ");
			yon = (char)System.in.read();
			//System.in.read();
			//System.in.read();
			System.in.skip(2);
		}while(yon != '+' && yon != '-' && yon != '*' && yon != '/' && yon != '%');
		
		System.out.println("두번째 수 : ");
		su2 = Integer.parseInt(br.readLine());
		
		//	연산자를 조건으로 해서 처리
		
		switch (yon) {
		
		case '+':
			tot = su1 + su2;
			
			break;
			

		case '-':
			tot = su1 - su2;
			break;

		case '*':
			tot = su1 * su2;
			break;

		case '/':
			tot = su1 / su2;
			break;

		case '%':
			tot = su1 % su2;
			break;
		}
		
		System.out.println(su1 + " " + yon + " " + su2 +" = "+ tot);
		
	}

}
