package com.tushar;

import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();	//Generic
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);	//print the stack
		
		var top = stack.pop();				//removing top data of the stake
		System.out.println(top);			//printing the top data
		System.out.println(stack);
		
		top = stack.peek();					//returning the top without removing it
		System.out.println(top);
		
		System.out.println(stack.empty());	//gives boolean value whether the stack is empty or not.
		
		String str = "abcd";
		StringReverser sr = new StringReverser();
		var result = sr.reverse(str);
		System.out.println(result);
		
		String text = ") 4 + 6 ( 12";	//o/p false
//		String text = "( 4 + 6 )";		//true
//		String text = "( 4 + 6 >";		//false
		Expression e = new Expression();
		var str2 = e.expressionStack(text);
		System.out.println(str2);
	}
}
