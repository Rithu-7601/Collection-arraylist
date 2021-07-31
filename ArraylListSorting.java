package co.collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArraylListSorting {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("pineapple");
        fruits.add("apple");
        fruits.add("gauva");
        fruits.add("mango");
        fruits.add("lichee");
        fruits.add("jackfruit");

        System.out.println(fruits + "  size =  " + fruits.size());

        //iterating thorught the arrray
        listIterator(fruits);

        //ascending order
        Collections.sort(fruits);
        System.out.println("increasing -> asccending  " + fruits);

        //descending order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("decreasing -> descending  " + fruits);


    }

    static void listIterator(ArrayList<String> fruits) {
        ListIterator<String> itr = fruits.listIterator();
        while (itr.hasNext()) {
            String s1 = itr.next();
            System.out.println(s1 + "   ");
        }
        System.out.println("\n");
        while (itr.hasPrevious()) {
            String s1 = itr.previous();
            System.out.println(s1 + "   ");
        }
        System.out.println("\n");
    }

}
