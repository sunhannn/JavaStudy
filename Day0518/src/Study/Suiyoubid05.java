package Study;

import java.io.*;

public class Suiyoubid05 {
	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//클래스 메소드
	
	public 	static int getInt(String str) throws IOException{
		//인스턴스 메소드
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println(str+" : ");	
	int imsi = Integer.parseInt(br.readLine());
	return imsi;
	}
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		int kor = getInt("국어점수");
		System.out.println("당신의 국어점수는 " + kor +"입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
