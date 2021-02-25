package com.tushar;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int[] numbers) {
		
		for(int i = 1; i < numbers.length; i++) {//staring with 2nd index as 1st index used for comparing.
			var current = numbers[i];
			var j = i - 1;	//left value of current 
			while(j >= 0 && numbers[j] >current) {//if left value is greater than current
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = current;	//[j+1} because above j-- is given so it will be last in left of exact substituting location.
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = { 8, 2, 1, 5, 4, 1, 3};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
}
