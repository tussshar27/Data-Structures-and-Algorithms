package com.tushar;

import java.util.Arrays;

public class SelectionSort {

	private static void sort(int[] numbers) {
		//iterating every number of an array
		for(int i = 0; i < numbers.length; i++) {
			//assuming 1st number as minimum.
			var minIndex = i;
			for(int j = i + 1; j < numbers.length; j++) {
				//comparing iterating number to the minimumindex number and if found minimum then swapping it.
				if(numbers[minIndex] > numbers[j]) {
					var temp = numbers[j];
					numbers[j] = numbers[minIndex];
					numbers[minIndex] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] numbers = { 8, 2, 4, 1, 3};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
