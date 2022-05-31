package Study;
/* 클래스명의 첫 글자는 대문자로, 규칙 강제성은 없음
 * 자바 프로그램을 시작할때 class, main()을 기본적으로 입력,
 * main()메소드 안에 소스코드를 작성하여 클래스 이름과 동일한 파일명으로 저장함
 * 확장자는 ~.java
 */

public class Study {
	
	
	
	//main() : 메인 메소드
	//시작할 때 찾는 장소, 무슨 구문인지 여기를 보면 알 수 있음, 여기가 없으면 실행 불가능
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//코딩영역
		
		
	   System.out.println("Hello World");
	   //Print()안에 있는 문자를 출력해라
	   //줄을 바꿀려면"println()"을 쓰거나 문자 뒤에 "\n"붙이기
		
	
	   int a=10, b=20, c=200;
	   
	   System.out.println(a+","+b);
	   System.out.println(b);
	   
	   //"+"는 문자열을 연결할 때 사용 print에서는
	   
		
		
		System.out.printf("%d,%d\n", a, b);
		//%d는 숫자 형태로 출력하라는 뜻이다, 뒤에는 출력할 변수를 입력할 것!
		//f는 형식이 있다는 뜻이다, 즉 printf를 쓸 때에는 일정한 형식에 맞추어야 한다
		
		
		System.out.println(c+"원");
		/* println() 메소드와 print() 메소드의 차이는
		 * 라인 스킵(줄 바꿈)유무에 있다.
		 * "\n"를 문자열에 포함하면 라인 스킵이 된다.
		 * 
		 * 
		 */
	}

}
