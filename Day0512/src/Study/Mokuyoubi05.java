package Study;
import java.io.*;
public class Mokuyoubi05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		//nt kor = 0, eng =0, mat = 0, sum = 0;
		 // 	0국어 1영어 2 수학 3 총
		String [] subname = {"국어점수","영어점수","수학점수"};
		int [][] sub = new int [3][subname.length+1];
		float [] avg =new float[3];
		
		for (int k = 0 ; k < sub.length;k++) {
			
		for (int i =0 ; i < sub[k].length-1;i++) {
		
		do {
			System.out.println(subname[i]+" : ");
			sub[k][i] = Integer.parseInt(br.readLine());
			
		}while(sub[k][i] < 0 || sub[k][i] > 100);
		//총합
		sub[k][sub.length-1] += sub[k][i];
		}
		
		
		avg[k] = sub[k][sub.length-1] / (float)(sub[k].length-1) ;
		}
		for (int k = 0 ; k < sub.length;k++) {
		System.out.println();
		System.out.println("총점"+sub[k][sub.length-1]);
		System.out.println("평균"+avg[k]);
		
		}
	}

}
