package Suiren;
import java.io.*;
public class Suiren02 {
	
	public static int plus(int x, int y) {
		return x + y;
		
	}
	public static int min(int x, int y) {
		return x - y;
		
	}
	public static int mul(int x, int y) {
		return x * y;
		
	}
	public static int div (int x, int y) {
		return x / y;
		
	}
	
	public static int per (int x, int y) {
		return x %	y;
		
	}
	public static void disp (int a, char b, int c, int d) {
		
		System.out.println("\n"+a+" "+b+" "+c+" = "+d);
		
	}
	

	

public static void main (String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	int su1 = 0, su2 = 0, tot = 0;
	char yon = 0;
	
	System.out.println("첫번째 수 : ");
	su1 = Integer.parseInt(br.readLine());
	
	do {
		System.out.println("yon(+,-,*,/,%) : ");
		yon = (char)System.in.read();
		
		
		System.in.skip(2);
	}while(yon != '+' && yon != '-' && yon !='*' && yon != '/' && yon !='%');
	
	System.out.println("두번째 수 :");
	su2 = Integer.parseInt(br.readLine());
	
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
	
	System.out.println(su1 + " " + yon + " " + su2 +" = " + tot);
	
}
}