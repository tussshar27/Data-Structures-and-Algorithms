package com.tushar;

import java.util.NoSuchElementException;

public class LinkedList {
    //Node is part of linkedlist, so Node class is defined inside LinkedList class.

    private class Node{                 //Node is made up of (value+nextAddress) as shown below data members.

        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size = 0;

    public void addLast(int item){
        Node node = new Node(item);     //item is passed through constructor.
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;   //pointing to new node
            last = node;        //new node
        }
        size++;
    }
    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;      // imagine this two lines in mind.
            first = node;       //node value is given to first.

        }
        size++;
    }
    public void removeLast(){
        var current = first;    //starting
        if(isEmpty()){
            throw new NullPointerException();
        }
        else if (first.next == null){
            first = null;
        }
        else {
            while (current != null) { //ending
                if (current.next == last) {
                    current.next = null;
                    last = current;     //current value is given to last.
                }
                current = current.next; //traversing from first to last.
            }
        }
        size--;
    }
    public void removeFirst(){
        if(isEmpty()){
            throw new NullPointerException();
        }
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    public String indexOf(int item){
        var current = first;
        var index = 0;              // unlike arrays, we have to mention index manually.
        while(current.next != null){
            if(current.value == item){
                return "Index is " + index;
            }
            current = current.next;
            index++;
        }
        return "-1";
    }
    //**************************************************************** */
    //Analyze the imp code, it will come in future in other formats.
    public boolean contains(int item){
        var current = first;
        while(current.next != null){
            if(current.value == item){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //**************************************************************** */
    public int size(){      //O(n)
        return size;
    }
    private boolean isEmpty()       //boolean value will return if the first node is empty/null or not.
    {
        return first == null;       //== comparison operator is used to know if is empty first node.
    }
    public int[] toArray(){     //O(n)
        int index = 0;
        int[] a = new int[size];
        var current = first;
        while(current != null){
            a[index] = current.value;
            current = current.next;
            index++;
        }
        return a;
    }
    public void reverse(){
        // first        last                                      last        first
        // [10 -> 20 -> 30] to [10 <- 20 -> 30]         to        [10 <- 20 <- 30]
        //   a     b     c             a     b     c                            a      b      c

        //flow of linkedlist nodes:
        //Before:            [10 ->  20 -> 30]
        //iteration1:        ["10 <- 20"   30]   // link betwn 20 and 30 will be removed as 20 will point to 10 now.
        //iteration2: After: [10 <- "20 <- 30"]

        // you have to change the pointer direction with same linkedlist.
        //you also have to interchange first and last value.
        var a = first;
        var b = first.next;
        last = first;           //making 10 as last
        last.next = null;
        //now do operation with first 2 elements and iterate it till b != null;
        while (b != null){
            var c = b.next;
            b.next = a;         //[10 <- 20]
            a = b;          //swapping  //shifting a and b to the right by 1 element.
            b = c;
        }
        first = a;          //when a=30 then making 30 as first.
    }
    public int getKthFromTheEnd(int k){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        // [10 -> 20 -> 30 -> 40 -> 50]
        //if we type 1 then it should give 50 same as 2=40, 3=30, 4=20, 5=10.
        var a = first;
        var b = first;
        for (int i = 0; i < k-1; i++){        //moving 2nd pointer to k-1 location as from above list.
            b = b.next;
            if(b == null){          // if kth value is out of the list size then.
                throw new IllegalArgumentException();
            }
        }
        while(b != last){           //b will stop at 40 i.e before the last node.
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
    
    public void printMiddle() {
    	//[10 -> 20 -> 30 -> 40 -> 50]
    	//for odd count list
    	var f = first;
    	var l = first;
    	//we don't know the size of list to find the middle. So, we have to iterate 1st pointer with 1 and 2nd pointer with 2
    	//	while(odd condition && even condition)
    	while(l.next != null && l.next != last) {
    		f = f.next;
    		l = l.next.next;
    	}
    	
    	if(l.next == null) {
    		System.out.println("For odd size list: " + f.value);
    	}
    	else {
    		System.out.println("For even size list: " + f.value + " " + f.next.value);
    	}
    	
    }

    public boolean hasLoop() {
    	var slow = first;
    	var fast = first;
    	
    	while(fast.next != last) {	//[10 -> 20 -> 30 -> 40 -> 50 -> 30 -> 40] the last pointer will point to 40 bcoz it moves 2iterations.
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	if(slow == fast) {
    		return true;
    	}
    	else {
    	return false;
    	}
    	
    }
    public static LinkedList createWithLoop() {		//LinkedList datatype is mentioned bcoz its returning LinkedList in the end.
    	//1. creating loop 
    	//before[10 -> 20 -> 30 -> 40 -> 50]
    	LinkedList list = new LinkedList();
    	list.addLast(10);
    	list.addLast(20);
    	list.addLast(30);
    	
    	var node = list.last;
    	
    	list.addLast(40);
    	list.addLast(50);
    	
    	list.last.next = node;
    	
    	return list;
    	//after[10 -> 20 -> 30 -> 40 -> 50 -> 30] 
    	

    	
    }
    
    //    public void addFirst(int item){
    //        node.value = item;
    //        if(isEmpty())        //if the list is empty
    //            first = last = node;
    //        else{
    //            node.next = first;
    //            first = node;
    //        }
    //    }
//    public int indexOf(int item){
//        int index = 0;          //There is no index in linkedlist, so we created one.
//        var current = first;    //initializing first node for traversing from it.
//        while(current != null){
//            if(current.value == item){
//                return index;
//            }
//            current = current.next;     //next means newnode.
//            index++;
//        }
//        return -1;
//    }
//    public Boolean contains(int item){
//        return indexOf(item) != -1;
//    }
//    public void removeFirst(){
//        if(isEmpty()){              //empty linkedlist
//            throw new NoSuchElementException();
//        }
//        if(first == last){          //single item linkedlist logic
//            first = last = null;
//            return;                 //return is given bcoz we do'nt wanna execute below code logic of 2 items linkedlist.
//        }
//        var second = first.next;    //[10 -> 20 -> 30]  //this logic is for atleast two items linkedlist.
//        first.next = null;
//        first = second;
//
//    }
//    public void removeLast(){
//        var current = first;
//        if(isEmpty()){              //empty linkedlist
//            throw new NoSuchElementException();
//        }
//        if(first == last){          //single item linkedlist logic
//            first = last = null;
//            return;                 //return is given bcoz we do'nt wanna execute below code logic of 2 items linkedlist.
//        }
//        while(current != null){
//            if(current.next == last){
//                current.next = null;
//                last = current;
//                break;
//            }
//            current = current.next;
//        }
//
//    }
}