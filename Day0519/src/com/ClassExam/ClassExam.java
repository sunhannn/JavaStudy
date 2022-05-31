package com.ClassExam;

import java.io.*;

public class ClassExam {

	private int x;
	private int y;
	private BufferedReader br;
	
	public ClassExam() throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		x = 0;
		y = 0;
		
		
		
		
	}
	
	
	public void setX() throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x : ");
		x = Integer.parseInt(br.readLine());
		
		
		
	}
	
public void setY() throws IOException{
	br = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.print("y : ");
	y = Integer.parseInt(br.readLine());
		
		
	}


public void display() {
	System.out.println();
	System.out.println("점의 좌표 (x,y) : ");
	System.out.println("("+x+","+y+")");
	System.out.println();
	System.out.println();
	
	
}

}

