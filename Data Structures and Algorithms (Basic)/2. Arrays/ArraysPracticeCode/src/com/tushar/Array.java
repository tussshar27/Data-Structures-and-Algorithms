package com.tushar;
//Dynamic Array
import java.util.Arrays;
public class Array {
    public int[] items;
    public int count;
    public int t, r;
    public int[] items2 = new int[10];
    public int[] items3 = new int[10];
    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){

        //check whether the array is full and resize it
        if(items.length == count){
            //create a new array(twice the size)
            int [] newItems = new int[count * 2];

            //copy all the existing items to new array
            for(int i = 0; i < count; i++ ){
                newItems[i] = items[i];
            }

            //set "items" to this new array
            items = newItems;   //now items is the newItems
        }

        //inserting value to the end of array
        items[count++] = item;    //items(0++) = item
        //count++;
    }
    public void removeAt(int index){
        //first validate the index
        if(index < 0 || index >= count){
            throw new ArithmeticException();
        }
        //shift the items to left to fill the hole.
        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        //delete the last item of array after shifting to left.
        count--;    //count points to the last element of array.
    }
     public String indexOf(int item){
        //worst case time complexity is O(n)
        for(int i = 0; i < count; i++){
            if(items[i] == item){
                return "index at: "+i;
            }
        }
        return "not found "+(-1);   //no need to write -1.
     }
     public String max(){
        for(int i = 0; i < count; i++){        //this nested loops is for sorting array in asc order.
            for(int j = i; j >= 0; j-- ){
                if(items[i] > items[i+1]){
                    t = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = t;
                }
            }
        }
        return "Maximum number:"+items[count];  //after array is sorted , last element became the highest number.
     }
     public void intersect(){
        //print array1
         System.out.println(Arrays.toString(items));
        //creation of 2nd array
        items2[0] = 20;
        items2[1] = 80;
        items2[2] = 50;
        items2[3] = 60;
        items2[4] = 70;
         items2[5] = 35;
         items2[6] = 77;
         items2[7] = 90;
         items2[8] = 7;
         items2[9] = 10;
        System.out.println(Arrays.toString(items2));

        //intersecting both the arrays
         for(int i = 0; i < count; i++){
             for(int j = 0; j < items2.length; j++){
                 if(items2[j] == items[i]){
                     System.out.println("intersecting number:"+items2[j]);
                 }
             }
         }


     }
     public void reverse(){
        int l = items2.length;  //l=10
         System.out.println("Length of items2 array:"+items2.length);
        for(int i = 0; i < items2.length; i++){ //20 200 50 60  //60 200 50 20
            while(i<items2.length/2){
                r = items2[i];
                items2[i] = items2[--l];
                items2[l] = r;
                items3[i] = items2[i];
                i++;
            }                    //60 200 50 20  //60 50 200 20
            items3[i] = items2[i];
        }
         System.out.println("Reverse of array:"+Arrays.toString(items3));

     }
    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
class Array2{
    int[] items4 = {10, 20, 30, 40, 50};
    public void insertAt(int item, int index){
        System.out.println(Arrays.toString(items4));
        //insert at specified location
        items4[index] = item;
        System.out.println("After insertion:"+Arrays.toString(items4));
    }
}
