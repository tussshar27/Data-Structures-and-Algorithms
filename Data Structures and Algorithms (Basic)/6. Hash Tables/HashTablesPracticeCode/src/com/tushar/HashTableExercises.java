package com.tushar;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
public class HashTableExercises {
	
	private static void mostRepeatedElement() {
		int[] a = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		Map<Integer, Integer> map = new HashMap<>();
		for(var b : a) {
			if(map.containsKey(b)) {//search key
				var count = map.get(b);//gets object value for key value
				map.put(b, count + 1);
			}
			else {
				map.put(b, 1);
			}
		}
		System.out.println(map);
		 int max = 0, c = 0;		
		 
		System.out.println(map.keySet());//shows only key values
		System.out.println(map.entrySet());//shows key-object pair values
		
		 for(var d : map.keySet()) {//from key values	//O(n) 
			 c = map.get(d);		//.getKey(), .getValue()
			 if(c > max) {
				 max = c;
			 }
		 }
		 System.out.println(max);
	}
	
	private static void countPairsWithDiff() {
		int k = 2, count = 0;
		int[] items = {1, 7, 5, 9, 2, 12, 3};
		// For a given number (a) and difference (diff), number (b) can be:
        //
        // b = a + diff
        // b = a - diff
		
		//adding array iktem to set
		Set<Integer> set = new HashSet<>();
		for(var item : items) {
			set.add(item);
		}
		System.out.println(set);
		
		//iterating array items and increasing count if found the eqn value
		for(var item : items) {
			if(set.contains(item + k)) {
				count++;
			}
			if(set.contains(item - k)) {
				count++;
			}
			set.remove(item);
		}
		System.out.println(count);
		//(1, 3), (3, 5), (5, 7), (7, 9) = 4 counts
	}
	
	
	public static void main(String[] args) {
	
		HashTableExercises.mostRepeatedElement();
		countPairsWithDiff();
	}

}
