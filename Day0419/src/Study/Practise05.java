package Study;
import java.util.*;

public class Practise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s, g;
		
		System.out.println("점수를 입력하시오 : ");
		s = sc.nextInt();
		
		System.out.println("학년을 입력하시오 : ");
		g = sc.nextInt();
		
		if(s >= 60) {//60점 이상이면
			
			if(g != 4) {
				System.out.println("굿 합격이요");
			}else if(s >= 70) {//4학년이 70점 이상이면
				System.out.println("굿 합격이요");
			}else {//4학년이 70점 미만이면
				System.out.println("쟌넨 불합격이요");
				
			}
		}else {
			System.out.println("쟌넨 불합격이요");
			
		}
		
		
		
		
		

	}

}
