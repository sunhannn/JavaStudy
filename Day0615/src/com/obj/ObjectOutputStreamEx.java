package com.obj;
import java.io.*;
public class ObjectOutputStreamEx {
//직렬화 된 객체를 파일에 저장
	
	
	public static void main(String[] args) {
		ObjectInputStream oos = null;
		try {
		// 메모리에 생성된 객체를 직렬화 해서 스트림을 통해서
			// 기록할 수 있는 ObjectInputStream 객체를 생성
			oos = new ObjectInputStream(new FileOutputStream("c:/ppp/obj.txt"));
			//ObjectInputStream을 통해서 직렬화된 후 파일로 기록될 Data객체 생성
			// 객체를 생성하기전 반드시 Serializable을 구형하고 있어야함
			
			
			Data data = new Data();
			data.setNo(30);
			data.setName("홍길동");
			data.setMail("hong@naver.com");
			//ObjectInputStream을 객체를 직렬화 해서 스트림을 통해서
			// 저장할 수 있는 writeObject()메소드를 활용함
		oos.writeObject(data);
	} catch (IOException e) {
		e.printStackTrace();
		
		}finally {
			try {if(oos != null) oos.close();} catch(IOException e) {}
			
		}
		
		
		
	}

}
