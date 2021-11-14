package org.student;

public class Students {
	
	public void getStudentInfo(int id) {

		System.out.println("Student Id : " +id);
		
	}
	public void getStudentInfo(int id, String name) {

		System.out.println("Student Id : " +id +", Name : " +name);
		
	}
	public void getStudentInfo(String email, int phNo) {

		System.out.println("Student email : " +email + ", phonenumber : " +phNo);
		
	}

	public static void main(String[] args) {
		
Students Std1 = new Students();
Std1.getStudentInfo(169);
Std1.getStudentInfo(169, "Priyanga");
Std1.getStudentInfo("priyanga26@gmail.com", 987654321);

		

	}

}
