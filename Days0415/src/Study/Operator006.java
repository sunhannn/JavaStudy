package Study;

public class Operator006 {
	// 문) 정수 35가 짝수인지 홀수 인지 판정하는 프로그램 구현(단, 삼항 연산자를 활용)
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a = 20, b = 30, max;
		
		//max = a >b ? ++a : ++b;
		
		
		//System.out.println("a : "+a);
		//System.out.println("b : "+b);
		//System.out.println("max : "+max);
		
		int a = 35;
		String result;
		
		result = a % 2 ==0 ? "짝수" : "홀수";
		System.out.println("정수 35는 "+result+"입니다.");
		
		
		
		
	}

}
