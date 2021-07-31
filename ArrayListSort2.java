package co.collections.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSort2
{
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<Integer>();

        elements.add(89);
        elements.add(12);
        elements.add(67);
        elements.add(200);
        elements.add(10);

        Collections.sort(elements);
        System.out.println("increasing order ->  "+elements);

        Collections.sort(elements,Collections.reverseOrder());
        System.out.println("decreasing order ->  "+elements);


    }
}
