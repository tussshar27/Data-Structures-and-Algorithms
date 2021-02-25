package com.tushar;

public class LinearSearch {

	private static int linear(int[] numbers,int target) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == target) {
				return i;
			}
//			else {				//shown error
//				return -1;
//			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int target;
		int[] numbers = { 1, 2, 4, 6, 8, 10 };
		System.out.println(linear(numbers,6));
	}
}
