package com.tushar;

import java.util.LinkedList;

public class LinkedListQueue {

	LinkedList<Integer> list = new LinkedList<>();
	
	public void enqueue(int item) {
		list.addLast(item);
	}
	public void dequeue() {
		if(list.isEmpty()) {
			throw new IllegalStateException();
		}
		list.removeFirst();
	}

	public static void main(String[] args) {
		LinkedListQueue lq = new LinkedListQueue();
		lq.enqueue(10);
		lq.enqueue(20);
		lq.enqueue(30);		
		lq.enqueue(40);

		
		System.out.println(lq);
	}
}
