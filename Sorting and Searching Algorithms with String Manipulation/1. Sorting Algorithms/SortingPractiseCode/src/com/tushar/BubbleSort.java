package com.tushar;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] array) {
		//O(n)
		//for loop for iterating every element in an array
		for(int i = 0; i < array.length; i++) {
			//for loop for comparing two neighbor elements.
			for(int j = 1; j < array.length - i; j++) {//- i is optional as it reduces the array size after every iteration. 
				//in above for loop, if we declare j=0 then exception arrayindexoutofbound error will occur.
				if(array[j-1] > array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {7, 3, 1, 4, 6, 2, 3};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}