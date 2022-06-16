package com.ioex;
import java.io.*;
// 텍스트 파일에 문자 기록
public class BufferedWriteEx {

	public static void main(String[] args) {
		
		// Buffered 스트림 : 스트림의 읽고 쓰는 기능을 위해 스트림 내부에 버퍼를 가지고 있는 스트림
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c/:ppp/hello.txt")));
		
		//FileInputStream fis = new FileInputStream("c:/ppp/hello.txt");
		
		try {
			
			fw = new FileWriter("c:/ppp/hello.txt");
			
			bw = new BufferedWriter(fw);
			
			bw.write("오늘도 날씨는 흐리다");
			bw.newLine();
			bw.write("오늘도 날씨는 흐리다");
//			bw.flush();
			
			
			
		} catch (IOException e) {
		e.printStackTrace();
		
		}finally {
			try {if(fw != null) fw.close();} catch(IOException e) {}
			try {if(bw != null) bw.close();} catch(IOException e) {}
			
		}
		
	}
	}


