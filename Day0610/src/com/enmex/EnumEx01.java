package com.enmex;

import java.awt.Color;

public class EnumEx01 {
	
		private Color myColor = Color.RED;
		
	
	
	public Color getMyColor() {
			return myColor;
		}



		public void setMyColor(Color myColor) {
			this.myColor = myColor;
		}



	public static void main(String[] args) {
		
		EnumEx01 ee = new EnumEx01();
		
		ee.setMyColor(Color.GREEN);
		Color color = ee.getMyColor();
		
		switch (color) {
		
		case Red : 
		System.out.println("red");
		break;
		
		case Green : 
			System.out.println("Green");
			break;
			
		case Blue : 
			System.out.println("blue");
			break;
			
		
		
		}
		
		
		
	}

}
