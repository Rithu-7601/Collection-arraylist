package co.collections.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer>  list = Arrays.asList(92,34,56,67,89,99);
        ArrayList<Integer> marks = new ArrayList<>(list);

        System.out.println(marks);

        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            System.out.println(n+"   ");
            Thread.sleep(1500);
            it.remove();
        }
        System.out.println("\n"+marks);
    }
}
