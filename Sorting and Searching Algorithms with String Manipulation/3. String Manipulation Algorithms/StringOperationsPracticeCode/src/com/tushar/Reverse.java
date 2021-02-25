package com.tushar;
import java.util.Stack;
public class Reverse {

	private static String reverse(String str) {
		String str2;
		if(str == null) {
			return "";//or null
		}
		
		//type 1
		//String rev ="";
		//StringBuffer reverseVar = new StringBuffer();
		StringBuilder reverseVar = new StringBuilder();//StringBuilder is more efficient than StringBuffer, both provides O(1) time complexity
		for(int ch = str.length() - 1; ch >= 0; ch--) {
			//rev = rev + str.charAt(ch);	//O(n)	//charAt(i) will give character at integer i.
						//appending it to rev.
			reverseVar.append(str.charAt(ch));//O(1)
		}
		//return rev;
		return reverseVar.toString();
		
		//type 2
//		Stack<Character> stack = new Stack<>();	//Character because it stores characters not string
//		for(var ch : str.toCharArray()) {
//			stack.push(ch);
//		}
//		StringBuffer reverseVar = new StringBuffer();//StringBuffer is beneficial if string is large.
//		while(!stack.isEmpty()) {
//			reverseVar.append(stack.pop());//append is used because String in immutable
//		}
//		return reverseVar.toString();//StringBuffer is a sequence of characters not String so we used toString() method to convert it to String.
	}
	public static void main(String[] args) {
		var a = reverse("hello");
		System.out.println(a);
	}
}
