package com.ioex;
import java.io.*;
public class FileOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:/ppp/fileout.txt");
			String message = "Work hard java Programing !";
			fos.write(message.getBytes());
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
