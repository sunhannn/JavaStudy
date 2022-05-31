package Study;
/*	문제)
 * 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서
 * 3의 배수만을 출력하는 프로그램을 작성하시오.
 * 
 */	
import java.util.*;
public class Suiyoubi03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		
		int [] arr = new int[10];
		
		
		
		for (int i = 0;i < arr.length; i++) {
			System.out.print( (i+1)+"번째정수 입력 : ");
			arr [i] =sc.nextInt();
			
			
			//if (arr [i] % 3 == 0) {
			//	System.out.print(arr[i]+"   ");
			
			
		}
		
		System.out.println();
		System.out.print("3의 배수 :");
	
		for (int i = 0;i < arr.length; i++) {
			//System.out.print( (i+1)+"번째정수 입력 : ");
			//arr [i] =sc.nextInt();
			
			
			if (arr [i] % 3 == 0) {
				System.out.print(arr[i]+"   ");
			}
		
		
		}
		
	}

}
