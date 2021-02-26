package com.tushar;
//logic of palindrome number and reverse number are same

public class PalindromeInteger {

	private static boolean isPalindrome(int number) {
		
		//121
		int sum = 0, rem, temp;
		temp = number;
		while(number > 0) {
			rem = number % 10;
			sum = (sum*10) + rem;
			number = number / 10;
		}
		if(temp == sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		var n = isPalindrome(121);
		System.out.println(n);
	}
}
