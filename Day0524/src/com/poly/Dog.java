package com.poly;

public class Dog  extends Animal{
		private String name;
		
		public Dog() {
			name = getClass().getSimpleName();
			
			
		}
	
		@Override
		public String scream() {
		
				return "멍멍이요";
		
		}

		public String getName() {
			return name;
		}
		
		

		public void setName(String name) {
			this.name = name;
		}
	
	
	
}
