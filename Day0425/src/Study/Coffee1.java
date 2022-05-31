package Study;
import java.util.*;

public class Coffee1 {
	/*
	 * switch ~ case 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램 구현 
	 * 커피메뉴 : 에스프레소, 카푸치노, 카페라떼는 3500이고, 아메리카노는 2000원이다.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("何をしますか");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
		
		case "에스프레소":
		
		case "카푸치노":
		
		case "카페라떼":
		price = 3500;
		break;
		case "아메리카노":
			price = 2000;
			break;
			
		
		default:
			System.out.println("メーにゅにないです。改めてお願いします。");
		}
		System.out.println(order+"는 "+price+"입니다. ");

	}

}
