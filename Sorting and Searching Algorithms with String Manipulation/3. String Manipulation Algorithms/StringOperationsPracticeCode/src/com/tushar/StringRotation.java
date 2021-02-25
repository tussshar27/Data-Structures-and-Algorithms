package com.tushar;

public class StringRotation {

	private static boolean rotate(String str1, String str2) {
		if(str1 == null || str2 == null) {
			return false;
		}
		//check the length and compare.
		return (str1.length() == str2.length() &&
				(str1 + str1).contains(str2));
		//str1+str1 = ABCDABCD.contains(DABC);
		
	}
	public static void main(String[] args) {
		//var
		boolean a = rotate("ABCD", "CDAB");
		System.out.println(a);
	}
}
