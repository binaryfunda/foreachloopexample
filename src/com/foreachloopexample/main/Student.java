package com.foreachloopexample.main;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;

	Student(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student("Ram");
		studentList.add(s1);
		Student s2 = new Student("sam");
		studentList.add(s2);
		Student s3 = new Student("seema");
		studentList.add(s3);
		Student s4 = new Student("raj");
		studentList.add(s4);
		for (Student student : studentList) {
			System.out.println(student.getName());

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}



	


