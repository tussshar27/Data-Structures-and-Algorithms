package com.tushar;

public class BinarySearch {

	private static int binaryUsingRecursion(int[] numbers, int target, int left, int right) {
		if(right < left) {//means list have zero item, if there is one item then left == right.
			return -1;
		}
		int middle = (left + right) / 2;
		//using recursion
		if(numbers[middle] == target) {
			return middle;		//it actually prints the last target item after doing recursion.
		}
		if(target < numbers[middle]) {
			return binaryUsingRecursion(numbers, target, left, middle - 1);
		}
		//if we use if statement then it will give error.
		//that means for any return type 1 return type should be out of any loop.
		return binaryUsingRecursion(numbers, target, middle + 1, right);
	}
	
	private static int binaryUsingIteration(int[] numbers,int target) {
		//left and right variables are imp.
		var left = 0;
		var right = numbers.length - 1;
		while(left <= right) {
			var middle = (left + right) / 2;
			if(numbers[middle] == target) {
				return middle;
			}
			if(target < numbers[middle]) {
				right = middle - 1;
			}
			else {
				left = middle + 1;
			}
		}
		//if there is no item present
		return -1;
	}
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 5, 7, 10 };//binary search works only for sorted list
		int target = 5;
		//using recursion
		var a = binaryUsingRecursion(numbers, target, 0 , numbers.length - 1);
		System.out.println(a);
		
		//using iteration
		var b = binaryUsingIteration(numbers, target);
		System.out.println(b);
		
		
	}
}
