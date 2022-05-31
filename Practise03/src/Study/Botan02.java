package Study;

import java.util.*;

public class Botan02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		int money = 0;
		System.out.println("돈을 입력하세요 : ");
		money = sc.nextInt();
		
		for (int i = 0; i <unit.length;i++) {
			int res = money / unit[i];
			
			
			if(res > 0) {
				System.out.println(unit[i]+"원 짜리"+res+"개");
				money = money % unit[i];
			}
		}
		
		
		
	}

	

}
