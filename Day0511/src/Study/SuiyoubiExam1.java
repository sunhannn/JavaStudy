package Study;
/*	문제) 학생 수를 입력받아 
 *			입력받은 인원수 만큼의 학생의 이름과 전화번호를 입력받고
 *			입력받은 내용의 전체를 출력하는 프로그램을 작성하시오.
 *	단, 배열을 이용하여 작성하시오.
 *
 * 	학생 수 : 3
 * 이름 전화번호 입력 (1)[공백 구분] : 홍길동 010-1111-1111
 * 이름 전화번호 입력 (2)[공백 구분] : 이순신 010-1111-1111
 * 이름 전화번호 입력 (3)[공백 구분] : 강감찬 010-1111-1111
 */	
import java.util.*;

public class SuiyoubiExam1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n;
		System.out.println("학생 수 :");
		n = sc.nextInt();
		
		String[] name = new String [n];
		//학생 이름을 저장할 변수
		String [] phon = new String [n];
		// 학생 전화번호를 저장할 변수
		
		for (int i = 0; i < name.length;i++) {
			System.out.println("이름 전화번호 입력 ("+(i+1)+") : [공백구분]");
			name [i] =sc.next();
			phon [i] = sc.next();
			
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("입력 받은 학생수 "+n+"명");
		System.out.println("--------------------------");
		System.out.println(" 이 름              전화번호  ");
		
		for (int i =0 ; i <name.length ; i++) {
			System.out.println(name[i]+"          "+phon[i]);
		}
		System.out.println("--------------------------");
		
	}

}
