package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsList {

    public static void main(String[] args) {

        List<String>citylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        citylist.add("pune");
        citylist.add("nashik");
        citylist.add("nashik");
        citylist.add("mumbai");
        citylist.add("nagar");
        citylist.add("thane");
        citylist.add("nagpur");
        System.out.println(citylist);

       ///Adding
        System.out.println("Enter city to add : ");
        String city = sc.next();
        citylist.add(city);
        System.out.println(citylist);
        System.out.println(citylist.size());


        //Deleting
        System.out.println("Enter City to Delete : ");
        String str = sc.next();
        citylist.remove(str);
        System.out.println(citylist);
        System.out.println(citylist.size());

        //Sorting
        Collections.sort(citylist);
        System.out.println(citylist);

        //Searching
        System.out.println("Enter city to find : ");
        String findcity = sc.next();
        int i  =citylist.indexOf(findcity);
        if(i==-1) {
            System.out.println("City not found ");
        }else {
            System.out.println("found at index " + i);
        }

        //Reverse
        Collections.reverse(citylist);
        System.out.println( "Reverse : "+citylist);

        System.out.println("-----------------------------------------------------");
        //using iterator ---Fail-fast
        System.out.println("using iterator");
        Iterator<String> itr =citylist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
          //  citylist.add("dholakpur");  #ConcurrentModificationException
        }

        System.out.println("------------------------------------------------------");
        //using lambda expression ---Java8
        System.out.println("using lambda function");
        citylist.forEach(c-> System.out.print(c+ " "));
        System.out.println();

        //Stream Api --- java8
        List<String> Sname = citylist.stream()
                .filter(name -> name.startsWith("n"))
                .collect(Collectors.toList());
        System.out.println("Starting with Enterd char : "+Sname);


    }
}
