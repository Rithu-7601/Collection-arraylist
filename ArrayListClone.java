package co.collections.util;

import java.util.ArrayList;

public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("pineapple");
        fruits.add("apple");
        fruits.add("gauva");
        fruits.add("mango");
        fruits.add("lichee");
        fruits.add("jackfruit");

        System.out.println("ArrayList = "+fruits);
        System.out.println("\n");

        //cloning the array list

        ArrayList<String> fruits1 = (ArrayList<String>)fruits.clone();
        System.out.println("shallow copy of array list "+fruits1);

        System.out.println("\n");


        //add and remove on original ArrayList
        fruits.add("fig");
        fruits.remove("mango");

        //displaying original arraylist and cloned list after adding and removing some elements in the original araylist
        System.out.println("original array list "+fruits);

        System.out.println("\n");

        //even after adding and removal of elements in orginal arraylist , the cloned arraylist will never change
        System.out.println("cloned array list "+fruits1);


    }
}
