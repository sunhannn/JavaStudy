package Study;
import java.util.*;

public class Futaba03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("입력할 데이터 개수 : ");
		n= sc.nextInt();
		
		
		
		int [] arr = new int [n];
		
		System.out.print("데이터 입력 [공백 구분]");
		
		for (int i = 0; i < arr.length;i++) {
			arr [i] = sc.nextInt();
			
		}
		
		int max = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("가장 큰 수 : "+max);
		
	}

}
