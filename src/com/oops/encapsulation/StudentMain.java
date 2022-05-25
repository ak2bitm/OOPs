package com.oops.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student();
		st.setSid(101);
		st.setSname("Ramesh");
		st.setEmail("ramesh@gmail.com");
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getEmail());
	}
}
