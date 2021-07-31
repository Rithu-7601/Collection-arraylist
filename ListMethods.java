package co.collections.util;

import java.util.ArrayList;

public class ListMethods
{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names +" | size = "+names.size());//[] | size = 0
        System.out.println("is list empty =  "+names.isEmpty());//is list empty =  true

        names.add("riya");
        System.out.println(names +" | size = "+names.size());//[riya] | size = 1
        System.out.println("is list empty =  "+names.isEmpty());//is list empty =  false
        names.add("gopika");
        names.add("ankita");
        names.add("riya");
        names.add("sindhuja");
        System.out.println(names +" | size = "+names.size());//[riya, gopika, ankita, riya, sindhuja] | size = 5

        //to check element availabe in the list -> use contains() method!
        System.out.println("is riya in the list: "+names.contains("riya"));//is riya in the list: true

        //to add element in b/w
        names.add(1, "Chris");
        System.out.println(names +" | size = "+names.size());//[riya, Chris, gopika, ankita, riya, sindhuja] | size = 6

        //to replace
        names.set(2, "dixit");
        System.out.println(names +" | size = "+names.size());//[riya, Chris, dixit, ankita, riya, sindhuja] | size = 6

        System.out.println("element at index 5 = "+names.get(5));//element at index 5 = sindhuja

        System.out.println("Index of riya "+ names.indexOf("riya"));//Index of riya 0
        System.out.println("Index of riya "+ names.lastIndexOf("riya"));//Index of riya 4

        //if you're searching for an element and if it is not found then it'll return -> -1
        System.out.println(names.indexOf("varun")); // -1


        //to know how many times "riya" name is present in the list

        long count = names.stream().filter((name) -> name.equals("riya")).count();
        System.out.println("no of people having name riya = "+ count);


        //to remove an element -> returns true or false
        //System.out.println("remove riya = "+names.remove("riya"));//true
        System.out.println("remove riya = "+names.remove(0));//remove riya = riya

        System.out.println(names +" | size = "+names.size());//[Chris, dixit, ankita, riya, sindhuja] | size = 5

        names.stream().forEach(name -> System.out.println(name));






    }


}
