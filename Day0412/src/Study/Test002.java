package Study;

public class Test002 {

int aa;

	
	public static void main(String[] args) {
		// 문자열을 사용할 경우 " "(쌍따옴표, 더블쿼터), '는 싱글쿼터이다.
		//상수, 매개변수는 그냥 사용
		// 여러 문자열과 매개변수를 사용할 경우 연결 기호 (+)를 사용함
		/*
		 * 자료형은 8가지가 있다. 1,2,4,8
		 * 1 : 바이트,비트
		 * 2 : 캐릭터, 쇼트
		 * 4 : 
		 * 8 : 로그,더블
		 *스트링
		 * 
		 * 다음 과제 : 이름, 고향, 전공, 취미, 성별, 전화번호, 주소, 나이
		 * 
		 */
		
		
		Test002 t = new Test002();
		
		
	  String str = "우리는";
	  // string는 더블쿼터를 사용해야함
	  
	   char ch = 'd';
        //char는 싱글쿼터를 사용해야 함
	   

	   System.out.println(str); 
	   //
	   
	  System.out.println(ch);
	   
		System.out.printf("%s\n",str);
		System.out.printf("%c\n",ch);
		System.out.printf("%s,%c\n",str,ch);
		
		System.out.println(10);
		System.out.println(2.14+"는 실수입니다.");
		
		int a=0;
		System.out.println(a);
		//값을 초기화를 시켜야 에러가 나지 않음.
		
		
		System.out.println();
	}

}
