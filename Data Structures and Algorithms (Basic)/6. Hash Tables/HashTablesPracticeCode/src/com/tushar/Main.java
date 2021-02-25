package com.tushar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		
		//key : employee number(Integer)
		//value : employee name(String)
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "tushar");	
		map.put(2, "john");
		map.put(4, "aparna");	//it always store data in key sorted format.
		map.put(3, "jay");
		map.put(3, "rahul");	//it will replace previous jay value since in hashmap there are no duplicates stored.
		map.put(null, "null");
		System.out.println(map);
		map.remove(null);
		System.out.println(map);
		var k = map.get(1);
		System.out.println(k);
		var b = map.containsKey(4);	//O(1)
		System.out.println(b);
		var b1 = map.containsValue("tushar");	//O(N) because it will search every object stored in hashtable.
		System.out.println(b1);


		for(var item : map.keySet()) {	//singly map can't be iterated, so we have to use functions with it. //.keySet() will give only key data.
			System.out.println(item);
		}
		for(var item : map.entrySet()) {	//.entrySet() will give key-value pair data.
			System.out.println(item);	//.getKey(), .getValue(), .setValue() functions can also be used with it.
		}
		
		
		//NOTE: Hash tables(Dictionaries) don't store duplicate vlaues in it.
		
		
		//QUES: //first non repeating character in a string "a green apple"		
		String str = "a green apple";
		
		//first create hashmap to store the characters count
		Map<Character, Integer> map1 = new HashMap<>();
		//key should be come first(Character) and then object value(Integer) in the above declaration of HashMap.
		System.out.println(str);
		var chars = str.toCharArray();	//String should be converted ALWAYS to character array before iteration.
		for(var ch : chars) {
			//now if the char is present in hashmap then increase the existing count or else insert it to hashmap.
			//System.out.println(ch); 
			var count = map1.containsKey(ch) ? map1.get(ch) : 0;
			//inserting value
			map1.put(ch, count + 1);
		}
		System.out.println(map1);//output: { =2, p=2, a=2, r=1, e=3, g=1, l=1, n=1}
		for(var ch : chars) {
			if(map1.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
		
		//QUES: First Repeated Characters in String
		Map<Character, Integer> map2 = new HashMap<>();
		for(var ch : str.toCharArray()) {
			if(map2.containsKey(ch)) {
				var count = map2.get(ch);
				map2.put(ch, count + 1);
			}
			else {
				map2.put(ch, 1);
			}			
		}
		System.out.println(map2);
		
		//above for-each loop can be written as:
//		for(var ch : str.toCharArray()) {
//			var count = map2.containsKey(ch) ? map2.get(ch) : 0;
//			map2.put(ch, count + 1);
//		}
//		
		for(var ch : str.toCharArray()) {
			if(map2.get(ch)>=2) {
				System.out.println(ch);
				break;
			}
		}
		
		
		

	}
}
