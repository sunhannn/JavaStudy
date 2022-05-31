package Study;
import java.io.*;
public class Kinyoubi03 {

	public static void main(String[] ar)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int human = Integer.parseInt(ar[0]);//사람 수 구하기
		
		String [] name = new String[human];
		String [] subject = new String [ar.length-1]; //과목명 초기화
		// 점수와 총점 처리 배열 선언
		int [][] jumsu = new int [human][ar.length];
		float [] avg = new float [human];
		char [] grade = new char [human];
		int [] rank = new int [human];
		/*
		for (int i = 0; i < ar.length-1;i++) {
			subject[i] = ar[i+1];
			System.out.println(subject[i]);
		}
		*/
		for (int i = 0; i < human;i++) {	// 사람 수 만큼 반복
			System.out.print((i+1)+"번째 학생 이름 : ");
			name[i] = br.readLine();
			System.out.print(name[i]+"학생 점수 입력 : ");
			
			for (int j = 0; j < subject.length;j++) {
				System.out.print(subject[j]+"점수 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				
			}
			
			
			
			
		}
		
		

	}

}
