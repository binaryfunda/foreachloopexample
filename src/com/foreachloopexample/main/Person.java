package com.foreachloopexample.main;
public class Person {
	public static void main(String args[]) {

		int array[] = new int[5];
		array[0] = 5;
		array[1] = 5;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		//traditional for loop 
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
