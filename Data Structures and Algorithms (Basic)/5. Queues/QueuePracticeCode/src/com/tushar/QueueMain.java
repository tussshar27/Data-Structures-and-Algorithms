package com.tushar;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();		//there is no size limit in queue because ArrayDeque class has inbuilt resizeable array.
        //interface                //class
        queue.add(10);
        queue.add(20);
        queue.add(30);
      
        System.out.println(queue);
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);
        reverse(queue);				//reversing the same queue
        System.out.println(queue);
        
        								//user defined ArrayQueue class
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.dequeue();	//deleting 10
        var front1 = aq.dequeue();	//deleting 20
        System.out.println(front1);	//printing 20
        aq.enqueue(40);
        aq.enqueue(50);
        //aq.enqueue(60);	//[0, 0, 30, 40, 50] 	//error because out of size array	//circular array can be used to link rear to the front.
        aq.enqueue(60);
        aq.enqueue(70);
        aq.dequeue();	//now, o/p: [60, 70, 0, 40, 50]		//means f=40 and r=0 circularly.
        System.out.println(aq);	//printing aq object then java will internally invokes toString() method on the object, so we override for desired output.
   
        //QueueWithTwoSTacks
        QueueWithTwoStacks queue1 = new QueueWithTwoStacks();
        queue1.enqueue(100);
        queue1.enqueue(200);
        queue1.enqueue(300);
        queue1.dequeue();
       //var ab = queue1.dequeue();
        System.out.println(queue1.dequeue());
        queue1.peek();
        
        //PriorityQueue
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(5);
        queue2.add(1);
        queue2.add(3);
        queue2.add(2);
        while(!queue2.isEmpty()) {
        	System.out.println(queue2.remove());
        }
        
        UserDefinedPriorityQueue queue3 = new UserDefinedPriorityQueue();
        queue3.add(5);
        queue3.add(3);
        queue3.add(7);
        queue3.add(1);
        queue3.add(9);
     
        System.out.println(queue3);
        while(!queue3.isEmpty()) {
        	System.out.println(queue3.remove());
        }
        
    }
    
    public static void reverse (Queue<Integer> queue) {		//queue as a parameter
    	//u have a queue[10, 20, 30] then reverse it to [30, 20, 10] using stack.
    	//Stack is used for reverse program.
    	Stack<Integer> stack = new Stack<>();
    	while(!queue.isEmpty()) {
    		stack.push(queue.remove());			//pushing to stack
    	}
    	while(!stack.isEmpty()) {
    		queue.add(stack.pop());
    	}
    	
    }
    
   
    

}
