package com.tushar;

public class Vowels {
	
	private static int findVowels(String str) {
		if(str == null) {
			return 0;
		}
		int count = 0;
		String vowels = "aeiou";	//initializing "aeiou" to a String variable.
		for(var ch : str.toLowerCase().toCharArray()) {	//converted into character array
			
			//type 1
			if(vowels.indexOf(ch) != -1) {	//if ch is not present in vowel then -1
				count++;
			}
			
			//type 2
//			if(vowels.contains(Character.toString(ch))) {	//convert it to String
//				count++;
//			}
			
			//type 3
//			if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//				count++;
//			}
//			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				count++;
//			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		var a = findVowels("hello");
		System.out.println(a);
	}
}
