package com.tushar;
//logic of reverse number and palindrome number are same

public class ReverseInteger {
	private static int reverse(int n) {
		int r, sum = 0;
		while(n>0) {
			r = n%10;
			sum = (sum*10) + r;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(reverse(123));
		
	}
}
