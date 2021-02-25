package com.tushar;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence = "Trees are Beautiful";
		String[] words = sentence.split(" ");//split() function is available in array.
		StringBuilder str = new StringBuilder();
		for(int i = words.length - 1; i >= 0; i--) {
			str.append(words[i] + " ");
		}
		System.out.println(str.toString());
	}
}
