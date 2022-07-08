package com.unicastex;
import java.io.*;
import java.net.*;

public class UnicastServer {

	public UnicastServer() {
		
		ServerSocket server = null;
		try {
			//서버 소켓 생성
			server = new ServerSocket(5000);
			
			
			
			
		}catch(IOException ii){
			System.out.println("해당 포트가 사용 중입니다.");
		System.exit(0);
		}
		
		try {
			while(true) {
				System.out.println("Server Ready ....");
				Socket socket = server.accept();
			}
		}catch(IOException ii) {
			ii.printStackTrace();
			
			/* 클라이언트와 메시지를 송수신할 수 있는 스레드 생성
			 *  스레드 생성시 socket을 전달 받아서 구현 함
			 *  스레드를 시작함
			 * 
			 */
			
			Socket socket = null;
			//
			UnicastServerThread thread = new UnicastServerThread(socket);
			thread.start();
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		
	}

}
