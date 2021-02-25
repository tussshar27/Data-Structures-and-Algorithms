package com.tushar;

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueReverser {

	
	public static void reverse(int k, Queue<Integer> queue) {
		if(k < 0 || k > queue.size()) {
			throw new IllegalStateException();
		}
		
		Stack<Integer> stack = new Stack<>();
		
		//pushing elements from queue to stack till kth value.
		for(int i = 0; i<k; i++) {
			stack.push(queue.remove());
		}
		//adding elements from stack to the back of the queue.
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		//removing the remaining elements from the front of the queue and adding it to the back of the queue.
		for(int i = 0; i < queue.size() - k; i++) {
			queue.add(queue.remove());
		}
		
	}
	
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		
		QueueReverser.reverse(3,queue);
		System.out.println(queue);
		
	}
	
	
}
