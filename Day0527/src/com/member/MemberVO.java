package com.member;

public class MemberVO {

		private String name;
		private String tel;
		private String email;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNation() {
			return nation;
		}

		public void setNation(String nation) {
			this.nation = nation;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		private String nation;
		private int age;
		
		public MemberVO(int age, String name, String tel, String email, String nation) {
		this.age = age;
		this.name = name;
		this.email = email;
		this.nation = nation;
		this.tel = tel;
			
			
		}
		
		
	
	
	
	
	
}
