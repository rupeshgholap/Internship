package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapHash {

    public static void main(String[] args) {

        Hashtable<String,String> HT = new Hashtable<>();
        HT.put("Maharastra","fadnvis");
        HT.put("tamilnadu", "stalin");
        HT.put("Madhyapradesh","yadav");
        HT.put("delhi","Atishi"); //duplicate key not alowed
        HT.put("delhi","kejriwal");
      //  HT.put(null,"Daman"); not allowed
        System.out.println(HT);

        Map<Integer,String> map = new HashMap<>();      //order not preserved
       // Map<Integer,String> map = new LinkedHashMap<>(); //order preserved
       // Map<Integer,String> map = new TreeMap<>();    //orderd by key value
        map.put(12, "Amit");
        map.put(21, "Jivan");
        map.put(23, "Sheela");
        map.put(67, "Maya");
        map.put(54, "Meena");
        map.put(45, "Dipak");
        map.put(21, "null");
        map.put(11, "null");
        map.put(null,"ram"); //allowed in linkedhashmap,hashmap, not allowed in treemap
        System.out.println(map);

        Map<Integer,String> prime = new ConcurrentHashMap<>();
        prime.put(1,"not prime");
        prime.put(2,"prime");
        prime.put(3,"prime");
        prime.put(4,"not prime");
        prime.put(5,"prime");
        prime.put(0,"not prime");
        prime.put(1,"not prime"); //duplicate not allowed
        // prime.put(null,"prime");// null not allowed
        System.out.println(prime);
        //  System.out.println(prime.hashCode());

        // Fail-safe
        Iterator<ConcurrentHashMap.Entry<Integer,String>> itr = prime.entrySet().iterator();
        System.out.println("printing using iterator---failsafe");
        while (itr.hasNext())
        {
            ConcurrentHashMap.Entry<Integer,String> entry = itr.next();
            System.out.println(entry);
        }




    }
}
