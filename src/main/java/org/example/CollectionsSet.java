package org.example;

import java.util.*;

public class CollectionsSet {

    public static void main(String[] args) {

        // in Hashset order not maintained
        Set<Integer> numbers = new HashSet<>();
        numbers.add(15);
        numbers.add(5);
        numbers.add(5);  //duplicate not allowd
        numbers.add(55);
        numbers.add(35);
        numbers.add(65);
        numbers.add(25);
        numbers.add(75);
        numbers.add(null); //allowed
        System.out.println(numbers);


        //in linked-hashset insertion order is maintained
        Set<Integer> orderdnums = new LinkedHashSet<>();
        orderdnums.add(15);
        orderdnums.add(5);
        orderdnums.add(5); //duplicate not allowd
        orderdnums.add(55);
        orderdnums.add(65);
        orderdnums.add(45);
        orderdnums.add(35);
        orderdnums.add(null);  //allowed
        System.out.println(orderdnums);

      //Treeset - sorted
     // Set<Integer> treeset= new TreeSet<>();
        Set<Integer> treeset= new TreeSet<>(Comparator.reverseOrder());
        treeset.add(15);
        treeset.add(55);
        treeset.add(45);
        treeset.add(35);
        treeset.add(75);
        treeset.add(65);
        treeset.add(65);  //duplicate not allowed
     //   treeset.add(null);   null-pointer excedption
        System.out.println(treeset);



    }
}
