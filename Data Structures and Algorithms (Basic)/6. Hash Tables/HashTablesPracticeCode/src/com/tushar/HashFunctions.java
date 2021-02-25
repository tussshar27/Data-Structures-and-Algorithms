package com.tushar;

import java.util.HashMap;
import java.util.Map;

public class HashFunctions {

	public static void main(String[] args) {
		String str = "orange";
		System.out.println(str.hashCode());//hashCode() function gives hascode of the string in java but its not the index value of hash table by this function.
		Map<String, String> map1 = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		map.put(123456, "tushar");//since hashmap uses array to store internally and as value is 123456 so the array to store this big number uses hash function which maps key value to index value.
		map1.put("123456-A", "tushar");//since hashmap uses array to store internally and as value is 123456 so the array to store this big number uses hash function which maps key value to index value.
		System.out.println(hash(123456));
		System.out.println(hash1("123456-A"));
	}
	
		public static int hash(int number) {
			return number % 100; //100 is the array size
		}
		
		public static int hash1(String key) {
			int hash1 = 0;
			for(var ch : key.toCharArray()) {
				hash1 += ch;//ch is converted from String to int known as implicit typecasting.
			}
			return hash1 % 100; //100 is the array size
		}
}
