package com.bl.datastructure.test;

import com.bl.datastructure.MyHashMap;

public class HashMapTest {

	public static void main(String[] args) {
		/*
		 * MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		 * 
		 * String phrase = "To be or not to be";
		 * 
		 * String[] words = phrase.split(" ");
		 * 
		 * for (int i = 0; i < words.length; i++) { Integer prevValue =
		 * myHashMap.get(words[i].toLowerCase()); if (prevValue != null) {
		 * myHashMap.add(words[i].toLowerCase(), prevValue + 1); } else {
		 * myHashMap.add(words[i].toLowerCase(), 1); } }
		 * 
		 * myHashMap.print();
		 */
		
		MyHashMap<String, Double> employeeData = new MyHashMap<>();
		
		employeeData.add("Mack", 100000.0);
		employeeData.add("Jack", 200000.0);
		employeeData.add("Rocky", 150000.0);
		employeeData.add("Mack", 175000.0);
		
		employeeData.print();
	}

}