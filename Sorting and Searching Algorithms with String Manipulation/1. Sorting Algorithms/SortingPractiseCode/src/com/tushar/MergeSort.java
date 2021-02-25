package com.tushar;

import java.util.Arrays;

public class MergeSort {

	private static void sort(int[] numbers) {	//O(nlogn)
		if(numbers.length < 2) {	//4. this block will run after merge() function //setting the base condition for recursion
			return;
		}
		//1. dividing array into half sub-arrays
		var middle = numbers.length / 2;	//3
		int[] left = new int[middle];	//left array
		for(int i = 0; i < middle; i++) {
			left[i] = numbers[i];	//storing elements to the left array
		}
		
		int[] right = new int[numbers.length - middle];		//right array
		for(int i = middle; i < numbers.length; i++) {
			right[i - middle] = numbers[i];	//starting from right[5-5=0]		//storing elements to the right array
		}
		
		//2. recursion
		sort(left);
		sort(right);
		
		//3. sorting and merging arrays
		merge(left, right, numbers);	//copying items back to input array
		
	}
	private static void merge(int[] left, int[] right, int[] result) {
		int i = 0, j = 0, k = 0;	//pointer for left, right, numbers(result) arrays
		
		while(i < left.length && j < right.length) {	//iterating left and right arrays
			if(left[i] < right[j]) {
				result[k++] = left[i++];
			}
			else {//if j is bigger than i
				result[k++] = right[j++];
			}
		}
		
		while(i < left.length) {	//after above while loop //for remaining left array	//eg: if j=3 and i=30
			result[k++] = left[i++];
		}
		
		while(j < right.length) {	//for remaining right array		//eg: if i=3 and j=30
			result[k++] = right[j++];
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = { 10, 5, 2, 23, 45, 21, 7};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
