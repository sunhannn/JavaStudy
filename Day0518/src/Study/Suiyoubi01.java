package Study;
/*
 * 	여러가지 기능 
 * 	1. 최대수, 2. 사이의 합계 3. 수열 4. 종료
 * 
 * 
 */
import java.io.*;
public class Suiyoubi01 {
	//	최대값 구하는 메소드 작성
	public static int aaa() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		if (a>b) {
			return a;
		}
		
		return b;
		
		
	}//	end aaa
	public static  void bbb() throws IOException{// 두수 사이의 합계를 구하는 메소드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("첫번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("두번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		//	누적 변수 선언
		int tot = 0;
		if (a > b) {
			a = a^b;
			b = b^a;
			a = a^b;
		}
		
		for ( int i = a; i < b;i++) {
			tot += i;
			
		}
		
		System.out.println(a+"~~~"+b+"사이의 합계"+tot);
		
	}//	end bbb
	
	//	큰 순서대로 나열하는 수열을 구현하는 메소드
	public static String ccc(int x, int y, int z) {	// First = x, Second = y, Third = z
		
		
		if ( y >= x && y >= z) {
			//Swap 공식에 의거해서
			int imsi = x;
			x = y;
			y = imsi;
			
			
		}else if (z >= x && z>= y) {
			int imsi = x;
			x = z;
			z = imsi;
			
			
			
		}if (z >= y) {
			
			int imsi = y;
			y = z;
			z = imsi;
			
			
			
			
		}
		String abc = x +" >= " + y +" >= "+ z;
		
		return abc;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0; // 	메뉴를 입력 받을 변수
		
		while(true) {
			System.out.println("1. 최대수, 2. 사이의 합계 3. 수열 4. 종료");
			x = Integer.parseInt(br.readLine());
			if (x == 1) {	//return 값을 갖는다.
				int k = aaa();
				
				System.out.println("두 수중 최대값은 "+k+"입니다.");
			}else if(x == 2) {	//	Call by name
				bbb();
				
			}else if(x == 3) {	// Call by value
				System.out.println("첫번째 정수 입력 : ");
				int first = Integer.parseInt(br.readLine());
				
				System.out.println("두번째 정수 입력 : ");
				int second = Integer.parseInt(br.readLine());
				
				System.out.println("세번째 정수 입력 : ");
				int third = Integer.parseInt(br.readLine());
				
				String str = ccc(first,second,third);
				
				System.out.println("큰 순으로 나열은"+str);
			}else if(x == 4) {
				break;
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println();
		}
		
		System.out.println("수고하셨습니다.");
		
		
		
		
		
		

	}

}
