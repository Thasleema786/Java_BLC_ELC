package com.blc.elc;

public class StudentMain {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.setStudentDetails("Thaslim",82,88);
       String result=stu.getStudentDetails();
       System.out.println(result);
	}

}
