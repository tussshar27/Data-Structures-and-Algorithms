package com.tushar;
import java.util.*;
public class MostRepeated {

	private static char mostRepeated(String str) {
		if(str == null || str.isEmpty()) {
			throw new IllegalArgumentException();//here argument is exceptional so IllegalArgumentException() is used.
		}
		
		Map<Character, Integer> map = new HashMap<>();
		for(var ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				var count = map.get(ch);//storing object value in count variable
				map.put(ch, count + 1);
				
			}
			else {
				map.put(ch,1);
			}
		}
		System.out.println(map);
		
		int max = 0, c = 0;
		char result = ' ';//compulsory initialization is required if u are using it
		for(var ch : map.keySet()) {
			c = map.get(ch);//get object value from key
			if(c > max) {
				max = c;
				result = ch;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		var a = mostRepeated("Helloooo!!!");
//		var a = mostRepeated(null);
//		var a = mostRepeated("");
		System.out.println(a);
	}
}
