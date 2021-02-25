package com.tushar;
import java.util.*;
public class RemoveDuplicates {
	private static String removeDup(String str) {
		StringBuilder output = new StringBuilder();
		Set<Character> seen = new HashSet<>();
		
		if(str == null) {
			return null;
		}
		
		for(char ch : str.toCharArray()) {
			//if character is already present then iterate.
			if(!seen.contains(ch)) {//str.charAt(ch) is not used becoz ch is already declares as Char.
				seen.add((ch));
				output.append((ch));
			}
		}
		return output.toString();
	}
	public static void main(String[] args) {
		
		var a = removeDup("Helloooo!!!!!!");
		//var a = removeDup(null);
		System.out.println(a);
	}
}
