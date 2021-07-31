package co.collections.util;

import java.util.*;

public class ListIterations {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> marks = Arrays.asList(92,34,56,67,89,99);
        System.out.println(marks);

        /*Collections.sort(marks);
        System.out.println(marks);*/

        iterateList1(marks);
        Thread.sleep(1500);

        iterateList2(marks);
        Thread.sleep(1500);

        iterateList3(marks);
        Thread.sleep(1500);

        iterateList4(marks);
        Thread.sleep(1500);

        iterateList5(marks);
        Thread.sleep(1500);

    }
    static void iterateList1(List<Integer> marks)
    {
        System.out.println("1. list iteration using a normal for loop with get() method -> only for java.util.list");
        for(int i = 0; i<marks.size(); i++){
            Integer n = marks.get(i);
            System.out.println(n+"  ");
        }
        System.out.println("\n");
    }
    static void iterateList2(List<Integer> marks)
    {
        System.out.println("2. list iteration using a enhanced for loop");
        for(Integer n : marks){

            System.out.println(n+"  ");
        }
        System.out.println("\n");
    }
    static void iterateList3(List<Integer> marks) {
        System.out.println("3. list iteration using java.util.Iterator");
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.println(n + "   ");
        }

        System.out.println("\n");
    }
    static void iterateList4(List<Integer> marks) {
        System.out.println("4. list iteration using java.util.ListIterator -> java.util.List");
        ListIterator<Integer> itr = marks.listIterator();
        while (itr.hasNext()) {
            Integer n1 = itr.next();
            System.out.println(n1 + "   ");
        }

        System.out.println("\n");
        while (itr.hasPrevious()) {
            Integer n1 = itr.previous();
            System.out.println(n1 + "   ");
        }
        System.out.println("\n");
    }

    static void iterateList5(List<Integer> marks) {
        System.out.println("5. list iteration using java.util.Enumeration");
       Enumeration<Integer> en = Collections.enumeration(marks);
        while (en.hasMoreElements()) {
            Integer n = en.nextElement();
            System.out.println(n + "   ");
        }

        System.out.println("\n");
    }

}
