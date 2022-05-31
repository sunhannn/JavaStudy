package Study;
import java.io.*;
public class Mokuyoubi03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[]	subname = {"국어", "영어", "수학"};
		int [][] sub = new int [3][subname.length+1]; //총점을 저장할 공간 확보
		// 0 : 1번째 사람, 1 : 두번째 사람, 2: 3번째 사람
		float[] avg = new float[3];
		
		for(int i = 0; i < sub.length; i++) {//사람
			
			for(int j = 0; j <sub[i].length;j++){
				
				
				do {
					System.out.print(subname[i]+"점수 : ");
					sub[i][j] = Integer.parseInt(br.readLine());
				}while(sub[i][j]< 0 || sub[i][j]>100);
				//	누적
				sub[i][sub[i].length-1]+= sub[i][j];
				
			}
			avg[i] = sub[i][sub[i].length-2] / (float)(sub[i].length-2);
			sub[i][sub[i].length-1]=1;
		}
		
		for (int i =0; i <sub.length;i++) {
			for (int j = 0;j < sub.length;j++) {
				if(sub[i][sub[i].length-2] < sub[j][sub[j].length-2]) {
					sub[i][sub[i].length-1]++;
				}
			}
		}
		
		
		//System.out.println(avg);
		//출력
		for (int i =0;i <sub.length; i++) {
			System.out.println();
			System.out.println("총점 : "+sub[i][sub[i].length-2]);
			System.out.println("평균"+avg[i]);
			System.out.println(sub[i][sub[i].length-1]+"등");
		}
		
		

	}

}
