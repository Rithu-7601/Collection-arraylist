package co.collections.util;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) throws InterruptedException {

        Vector<Integer> v = new Vector<Integer>();

        //creating vector with our own capacity
       // Vector<Integer> v = new Vector<Integer>(5);
        //Vector<Integer> v = new Vector<Integer>(5,3);initial capacity, capacity increment

        //vector default capacity --> 10
        System.out.println(v +" | size = "+v.size()+" | capacity =  "+v.capacity());

        for(int i =11; i<=20; i++){
            v.add(i);
        }
        System.out.println(v +" | size = "+v.size()+" | capacity =  "+v.capacity());

        v.add(23); //capacity will become 10 * 2 = 20

        System.out.println(v +" | size = "+v.size()+" | capacity =  "+v.capacity());

        //we can use for loop list iterator etc but only in enumeration case we can use elements() method!!!
        Enumeration<Integer> en = v.elements();
        while(en.hasMoreElements()){
            Integer n = en.nextElement();
            System.out.println(n);
            Thread.sleep(1500);
        }
    }
}
