package com.tushar;

import java.util.*;

public class Palindrome {
	private static boolean isPalindromeUsingStringBuilder(String str) {
		if(str == null) {
			return false;
		}
		//reverse() function is not present in string so we have to use StringBuilder
		//not used an array
		var m = str.toLowerCase();
		StringBuilder input = new StringBuilder(m);
		input.reverse();
		return input.toString().equals(m);	
		//we have to convert StringBuilder back to String and in java we can't use == to compare strings as it will give error.
	}
	
	private static boolean isPalindromeUsingTwoPointers(String str1) {
		
		if(str1 == null) {
			return false;
		}
		var n = str1.toLowerCase();
		int left = 0;
		int right = n.length() - 1;
		while(left < right) {
			if(n.charAt(left) != n.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		var x = isPalindromeUsingStringBuilder("madAm");
		System.out.println(x);
		var y = isPalindromeUsingTwoPointers("abA");
		System.out.println(y);

	}
}
