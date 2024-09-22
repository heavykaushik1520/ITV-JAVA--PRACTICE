package org.collection.set;


import java.util.HashSet;
import java.util.Iterator;

public class HS {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("America");
        hs.add("India");
        hs.add("China");
        hs.add("Japan");
        hs.add("America");

        Iterator it = hs.iterator();

        System.out.println("Elements using iterator : ");
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }


    }
}
