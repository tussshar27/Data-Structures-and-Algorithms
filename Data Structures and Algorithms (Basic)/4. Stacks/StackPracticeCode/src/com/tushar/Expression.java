package com.tushar;

import java.util.Stack;

public class Expression {

	public boolean expressionStack(String exp) {
		
		//stack created.
		Stack<Character> stack = new Stack<>();
		
		//pushing and popping in stack.
		//if we use for-each loop for String then it must convert to character array as it does not support Strings.
		for(char ch : exp.toCharArray()) {
			if(isLeftBracket(ch)) {
				stack.push(ch);
			}
			if(isRightBracket(ch)) {
				if (stack.isEmpty()) 
					return false;		// ") 4 + 6 ( 12"
				var top = stack.pop();
				if(bracketsMatch(top, ch))return false;
			}
		}
		return stack.isEmpty();		
//		if(stack.isEmpty()) {
//			return true;
//		}
//		return false;
//	}
		
	}
	private boolean isLeftBracket(char ch) {
		return ch == '(' || ch == '[' || ch == '<' || ch == '{';
	}
	private boolean isRightBracket(char ch) {
		return ch == ')' || ch == ']' || ch == '>' || ch == '}';
	}
	private boolean bracketsMatch(char left, char right) {
		return (right == ')' && left != '(') || 
				(right == ']' && left != '[') || 
				(right == '>' && left != '<') || 
				(right == '}' && left != '{');
	}
}
	