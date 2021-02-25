package com.tushar;

import java.util.ArrayList;

public class DynamicArray {
    //Dynamic array has 2 classes: 1)Vector 2)ArrayList.
    //Vector: grow 100% when it gets full - all the methods in it are synchronized, means it uses single thread to access that method
    //ArrayList: grow 50% when it gets full - all the methods in ArrayList class are non synchronized, means it can be used by multiple threads
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        list.indexOf(30);
        list.contains(30);  //gives the boolean value if the parameter value is present or not.
        list.size();    //to get number of items in array.
        list.toArray(); //converts ArrayList to array


        System.out.println(list);

    }
}
