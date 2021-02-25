package com.tushar;
import java.util.Arrays;
public class UserDefinedPriorityQueue {

	private int[] items = new int[5];	//sorted array
	private int count;
	
	public void add(int item) {
		if(isFull()) {	//if(5 == 5)
			throw new IllegalStateException();
		}
		int i;	//by default access specifier is private in java so no need to add access specifier if we want.
		
		//shifting items
		for(i = count-1; i>=0; i--) {
			if(items[i]>item) {
				items[i+1] = items[i];
			}
			else {//found the i position to insert the value.
				break;//insert 2 in [1 3 5 7], now we got item[i]=1 the inserting position so break ot from the for loop i.e no need for further looping since we got the position.
			}
		}
		items[i+1] = item;
		count++;
	}
	public boolean isFull() {
		return count == items.length;
	}
	public int remove() {
		return items[--count];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(items);	//converting arrays to String.
	}
	
}
