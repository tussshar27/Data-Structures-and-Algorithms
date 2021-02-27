package com.tushar;

import java.util.ArrayList;
import java.util.Collections;

public class DynamicArray {
    //Dynamic array has 2 classes: 1)Vector 2)ArrayList.
    //Vector: grow 100% when it gets full - all the methods in it are synchronized, means it uses single thread to access that method
    //ArrayList: grow 50% when it gets full - all the methods in ArrayList class are non synchronized, means it can be used by multiple threads
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);//giving index no.
        list.indexOf(30);//gives index of searched data
        list.contains(30);  //gives the boolean value if the parameter value is present or not.
        //.length property is for array and .size() function is for Arrayb
        list.size();    //to get number of items in array.
        list.toArray(); //converts ArrayList to array
        Collections.sort(list);//sorting
        System.out.println(list.get(0));//takes index and give value
        System.out.println(list);//to print the list
        list.set(1, 20);//(index, value) modify
        System.out.println(list);//to print the list
        
        for(int i : list) {//to print one after the another
        	System.out.println(i);
        }

    }
}
