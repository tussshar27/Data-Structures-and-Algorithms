package com.tushar;
import java.util.Set;
import java.util.HashSet;
public class SetMain {

	public static void main(String[] args) {
		//Set is used for storing only the non duplicate KEY values.
		Set<Integer> set = new HashSet<>();
		int[] a = {1, 2, 3, 3, 4, 5, 4, 1, 4};
		//storing the above array to Set so we have to iteratge each element from array to store in Set.
		for(var b : a) {
			set.add(b);
		}
		System.out.println(set);
		set.remove(2);
		//set.removeAll();
		System.out.println(set.contains(3));
		System.out.println(set.size());
		System.out.println(set);
	}
}
