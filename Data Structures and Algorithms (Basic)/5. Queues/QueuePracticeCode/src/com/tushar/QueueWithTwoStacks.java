package com.tushar;
import java.util.Stack;

public class QueueWithTwoStacks {

	//algo:
	//Q [10, 20, 30]
	//S1 []	//enqueue //storing the queue items in 1st stack initially.
	//now if we wanna remove 10 from Q then 10 is present at the bottom of S1. so we move to S2
	//S2 [30, 20, 10] //dequeue
	private Stack<Integer> stack1 = new Stack();
	private Stack<Integer> stack2 = new Stack();
	
	//O(1)
	public void enqueue(int item) {
		stack1.push(item);
	}
	
	//O(n)
	public int dequeue() {
		if(stack1.isEmpty() && stack2.isEmpty()) {
			throw new IllegalStateException();
		}
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		} 
		return stack2.pop();
	
	}
	
	//O(n)
		public int peek() {
			if(stack1.isEmpty() && stack2.isEmpty()) {
				throw new IllegalStateException();
			}
			
			if(stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			} 
			return stack2.peek();
		
		}
  
}
