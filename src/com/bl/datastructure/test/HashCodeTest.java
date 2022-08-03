package com.bl.datastructure.test;

public class HashCodeTest {

	public static void main(String[] args) {

		String str1 = "Hello World!!!!";
		String str2 = new String("Hell World!!!!");

		System.out.println(Math.abs(str1.hashCode()%10));
		System.out.println(Math.abs(str2.hashCode()%10));

		if (str1.equals(str2)) {
			System.out.println("Both hash code values are same");
		} else {
			System.out.println("Both hash code values are different");
		}

		System.out.println(str1 == str2);
	}

}