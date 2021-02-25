package com.tushar;

import java.util.Arrays;

public class Anagram {
	private static boolean anagram(String str1, String str2) {
		if(str2 == null || (str1.length() != str2.length())) {//null will come before str2.length condition because we can't calculate length of a null
			return false;
		}
		//var can also be used  below
		//storing in char arrays
		str1.toLowerCase();
		char[] array1 = str1.toCharArray();//['A' 'B' 'C' 'D']
		Arrays.sort(array1);
		str2.toLowerCase();
		var array2 = str2.toCharArray();//['B' 'A' 'D' 'C']
		Arrays.sort(array2);
		
		return Arrays.equals(array1,array2);
	}

	public static void main(String[] args) {
		var a = anagram("abcd", "BAdc");
		System.out.println(a);
	}
}
