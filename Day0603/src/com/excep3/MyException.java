package com.excep3;
import java.io.*;
public class MyException extends Exception {

	private String message;
	// 예외 내용을 저장하는 변수선언
	private Throwable cause;
	// 예외의 원인을 Throwable 객체의 형태로 저장 하겠다.
	// Throwable는 예외하고 에러 모두를 관리 Exception 와 Error 클래스의 부모 클래스
	
	
	public MyException() {
		
		super();
		
		
	}
	
	public MyException(String msg) {
		super(msg);
		message = msg;
		
	}
	public MyException(Throwable cause) {
		super(cause);
		this.cause = cause;
	}
	public MyException(Throwable cause, String msg) {
		
		super(msg,cause);
		
		message = msg;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	
	public void printStackTrace() {
		System.out.println("에러 발생...");
		System.out.println("에러 원인 : "+message);
		System.out.println("관련 클래스 : "+cause);
		System.out.println("에러 정보 끝 ...");
	
			super.printStackTrace(System.out);
	}
	
	public void printStackTrace(PrintStream out) {
		
		super.printStackTrace(out);
		
	}
public void printStackTrace(PrintWriter out) {
	super.printStackTrace(out);
	
	
}

	
	
}
