package Study;

public class Kayoubi04 {
	/*	[char] 자료형 배열에 알파벳 대문자를 채우고,
	 * 채워진 배열에 전체 요소를 출력
	 * 
	 * 	단, char 자료형의 배열에 초기화는 반복문을 이용함
	 * 
	 * 
	 */

	public static void main(String[] args) {
	//	char aa [] = new char [26];
		//알파벳 대문자 구성
		//	1. 
		/*char aa [] = new char [26];
		aa [0] = 'A';
		aa [1] = 'B';
		*/
		// 2,
		//char aa [] = {'A', 'B', 'C',,,,'Z'};
		
		char aa [] = new char [26];
		for (int i =0, b = 97;i < aa.length;i++,b++) {
			aa [i] = (char)b;
			System.out.printf("%c", aa[i]);
		}
		
				System.out.println();


		char [] alpha = new char [26];
		for (int i = 0 ; i < alpha.length; i++) {
			alpha [i] = (char)('A'+i);
			System.out.print(alpha[i]);
			
		}

	}

}
