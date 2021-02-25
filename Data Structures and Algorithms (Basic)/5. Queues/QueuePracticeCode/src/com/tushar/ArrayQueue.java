package com.tushar;

import java.util.Arrays;

public class ArrayQueue {
	//declaring array of integers
	//private int[] items = new int[5];
	private int[] items;	//using constructor for setting array size.
	
	private int rear = 0;		//declaring and initializing rear pointer.
	private int count;
	private int front = 0;		//declaring and initializing front pointer.
	
	public ArrayQueue(int capacity) {	//constructor
		items = new int[capacity];
	}
	
	public void enqueue(int item) {		//enqueue means adding item to the rear of the queue.
		if(count == items.length) {
			throw new IllegalStateException();
		}
			
		//items[rear++] = item;		//storing the item to the rear and increasing pointer with 1.
		
		//for circular array: its logically not possible but we can create it virtually.
		//[0, 0, 30, 40, 50]	//linking the rear of array to the front to fill the vacant place.
		//			    rear=4, now icrementing then r=5 so it will give exception(error) so linking that 5 to 0, 6 to 1, 7 to 2, etc.
		//5 -> 0=(=5%5)remender		//sofrom this pattern, formula  can be ((rear+1) % array.length)
		//6 -> 1
		//7 -> 2
		//8 -> 3
		//9 -> 4
		//10 -> 0 (again)
		//11 -> 1
		// ...
		items[rear] = item;
		rear = (rear+1) % items.length; 
		count++;
	}
	
	public int dequeue() {
		var item = items[front];
		//items[front++] = 0;		//setting the front value to 0 and increasing the pointer by 1.
		//same as for front 
		items[front] = 0;
		front = (front+1) % items.length; 
		count--;
		return item;
	}
	
	//the array became [0, 0, 30, 40, 50], so if we enqueue 60 then it will give error so circular array is used. 
	@Override
	public String toString() {		//printing aq object then java will internally invokes toString() method on the object, so we override for desired output.
		return Arrays.toString(items);
	}
}
