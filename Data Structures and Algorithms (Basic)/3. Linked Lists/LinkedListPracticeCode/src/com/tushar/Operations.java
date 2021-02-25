package com.tushar;

import java.util.Arrays;

//here, custom user-defined LinkedList is made and used instead of (inbuilt LinkedList class by importing java.util package)
public class Operations {
  public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addLast(10);
      list.addLast(20);
      list.addLast(30);
      list.addLast(40);
      list.addLast(50);
      //list.addLast(60);	//commenting to run hasLoop();


//      list.addFirst(50);
//      list.removeFirst();
//      list.removeLast();
      System.out.println(list.indexOf(100));
//      System.out.println(list.contains(100));
      System.out.println(list.size());
//      list.reverse();
      System.out.println(list.getKthFromTheEnd(3));
      list.printMiddle();
      
      var newList = list.createWithLoop();
      System.out.println(newList.hasLoop());
      
//      var array = list.toArray();
//      System.out.println(Arrays.toString(array));

  }
}