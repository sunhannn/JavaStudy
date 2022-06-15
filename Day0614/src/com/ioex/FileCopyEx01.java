package com.ioex;
import java.io.*;
public class FileCopyEx01 {

	public static void main(String[] args) {
		System.out.println("파일 복사 시작");
		long start = System.currentTimeMillis();
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		try {
			
		}catch(FileNotFoundException fnfe){
		fnfe.printStackTrace();	
		}catch(IOException ie){
			ie.printStackTrace();
		}finally {
			try {
				if(dest != null) {
					dest.close();
				}catch(IOException ii) {
			}
		}
		
		
		
		long end = System.currentTimeMillis();
		long copyTime = (end -start)/1000;
		System.out.println("복사에 걸린 시간"+copyTime+"초");
		
		
		
		
		
		
		
		
	}

}
