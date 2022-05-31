package Suiren;
import java.io.*;

public class Suiren01 {

	public static  int aaa() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		if (a>b) {
			return a;
		}
		return b;
		
	}
	
	public static void bbb() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		int tot = 0;
		if(a > b) {
			a = a^b;
			b = b^a;
			a = a^b;
			
		}
		for ( int i = a; i < b; i++) {
			tot += i;
			
		}
		System.out.println(a+"~~~"+b+"사이의 합계"+tot);
		
	}
	public static String ccc(int x, int y, int z) {
		
		if ( y >= x && y >= z) {
			
			int imsi = x;
			
			x = y;
			y= imsi;
			
			
			
		}else if (z >= x && z>=y) {
			int imsi = x;
			x=z;
			z = imsi;
			
			
		}if ( z>= y) {
			
			
			int imsi = y;
			y = z;
			z = imsi;
		}
		
		String abc = x +" >= " + y + " >= " +z;
		
		return abc;
		
	}
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		
		while(true) {
			System.out.println("1. 최대수, 2. 사이의 합계 3. 수열 4. 종료");
		x= Integer.parseInt(br.readLine());
		if (x == 1) {
			int k = aaa();
			
			System.out.println("두 수 중 최대값은 "+k+"입니다.");
			
		}else if (x == 2) {
			bbb();
			
		}else if ( x== 3) {
			System.out.println("첫번째 정수 입력 : ");
			int first = Integer.parseInt(br.readLine());
			
			System.out.println("두번째 정수 입력 : ");
			int second = Integer.parseInt(br.readLine());
			
			System.out.println("세번째 정수 입력 : ");
			int third = Integer.parseInt(br.readLine());
			
			String str = ccc(first,second,third);
			
			
		}else if (x == 4) {
			break;
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		}
		System.out.println("수고하셨습니다.");
	}
}
