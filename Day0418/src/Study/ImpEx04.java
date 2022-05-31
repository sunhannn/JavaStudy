package Study;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.io.*;

public class ImpEx04 {

	public static void main(String[] args) throws IOException{
		
		
		String name, nai, add, tel;
		/*
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bb = new BufferedReader(is);
		*/
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		
		System.out.println("이름 : ");
		name = br.readLine();
		
		System.out.println("나이 : ");
		nai = br.readLine();
		
		System.out.println("주소 : ");
		add = br.readLine();
		
		System.out.println("전화번호 : ");
		tel = br.readLine();
		
				
		

	}

}
