package com.obj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			// 파일에 저장된 객체를 읽어 오기 위해 ObjectInputStream객체를 생성
				// 기록할 수 있는 ObjectInputStream 객체를 생성
				ois = new ObjectInputStream(new FileOutputStream("c:/ppp/obj.txt"));
				//ObjectInputStream은 스트림으로부터 읽어들은 직렬화된 객체를
				// 역직렬화해서 객체를 생성할 수 있음
				// 역직렬화할때 필요한 클래스를 찾지 못하면 예외가 발생됨
				
				Data data = new Data();
				data.setNo(30);
				data.setName("홍길동");
				data.setMail("hong@naver.com");
				//ObjectInputStream을 객체를 직렬화 해서 스트림을 통해서
				// 저장할 수 있는 writeObject()메소드를 활용함
			ois.writeObject(data);
		} catch (IOException e) {
			e.printStackTrace();
			
			}finally {
				try {if(oos != null) oos.close();} catch(IOException e) {}
				
			}
			
	}

}
