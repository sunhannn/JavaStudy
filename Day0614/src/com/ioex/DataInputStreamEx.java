package com.ioex;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream은 기본 자료형 타입 그대로 스트림을 통해서 기록할 수 있음
				// DataOutputStream은 1차 스트림이 아니기 때문에 다른 스트림을 이용해서
				// 특정 장치와 연결될 수 있다.
				DataInputStream dis = null; // 2차
				FileInputStream fis = null;// 1차
				
				try {
					// DataOutputStream 과 연결된 FileOutputStream
					fis = new FileInputStream("c:/ppp/data.sav");
					// 기본 자료형의 타입을 유지한 채 저장된 값을 읽어들임
					// 읽을 때 반드시 기록한 순서대로 읽어와야함
					dis = new DataInputStream(fis);
					
					int i = dis.readInt();
					double d = dis.readDouble();
					String s = dis.readUTF();
					// DataOutputStream은 기본 자료형별로 저장하는 write 메소드가 존재함
					System.out.println("i 값 : "+i);
					System.out.println("d 값 : "+d);
					System.out.println("s 값 : "+s);
					
				} catch (FileNotFoundException fnfe) {
					fnfe.printStackTrace();
				}catch (IOException ie) {
					ie.printStackTrace();
				}finally {
					try {if(fis != null) fis.close();} catch(IOException e) {}
					try {if(dis != null) dis.close();} catch(IOException e) {}
				}
				
		
		
		
		
		
		
	}

}
