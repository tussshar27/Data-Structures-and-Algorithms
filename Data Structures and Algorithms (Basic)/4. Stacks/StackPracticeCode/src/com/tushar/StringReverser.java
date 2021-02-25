package com.tushar;

import java.util.Stack;

public class StringReverser {
	
	public String reverse(String input) {
		//create stack to store that string characters
		//stack is created same as class in java
		Stack<Character> stack = new Stack<>();
		
		//storing characters one after another in stack
//		for(int i = 0; i < input.length(); i++) {
//			stack.push(input.charAt(i));
//		}
		
		//above for loop can be written in more clean for- each loop as shown below.
		//if we use for-each loop for String then it must convert to character array as it does not support Strings.
		for(char ch : input.toCharArray()) 
			stack.push(ch);		//storing characters one after another in stack
			
		//String reverse = "";
		//StringBuffer class is used when there is lots of String manipulation.
		StringBuffer reversed = new StringBuffer();		//String is immutable(unchangeable)
		while(!stack.isEmpty()) {
			//reverse += stack.pop();	//for above commented String	//every time String gets modified it creates new memory object. so, suppose there are 1million characters to add then there will be 1million objects, so StringBuffer is used here instead of just String.
			reversed.append(stack.pop());	//storing characters from stack to String.
		} 
		return reversed.toString();
	}

}
