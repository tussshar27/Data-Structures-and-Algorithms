package com.tushar;

import java.util.Arrays;

public class Capitalize {

	private static String[] capitalize(String str) {//return type is String[]
		if(str == "" || str == null) {
			throw new IllegalArgumentException();
		}
		//first split the string in String array
		String[] array1 = str.trim().replaceAll(" +", " ").split(" ");//replaceAll(" +"," "), " +" means multiple whitespaces to " " single whitespace
		for(int i = 0; i < array1.length; i++) {
			array1[i] = array1[i].substring(0,1).toUpperCase() + array1[i].substring(1).toLowerCase();
										//0->from 0th index	and end 1st index						1->from 1st index
		}
		return array1;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(capitalize("      trees       are   beautiful.")));
		
	}
}
