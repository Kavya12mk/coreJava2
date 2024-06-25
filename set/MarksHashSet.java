package com.kavya.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MarksHashSet
{
    public static void main(String[] args) {
        HashSet<Integer> marksSet = new HashSet<>();
        marksSet.add(79);
        marksSet.add(79);
        marksSet.add(89);
        marksSet.add(99);
        System.out.println(marksSet);

        marksSet.remove(89);
        System.out.println(marksSet);
        System.out.println(marksSet.size());
        System.out.println(marksSet.toArray());
        System.out.println(marksSet.toString());
        marksSet.clear();
        System.out.println(marksSet);


        LinkedHashSet<String> place = new LinkedHashSet<>();
        place.add("Bangalore");
        place.addFirst("Vellore");
        place.addLast("Andra");
        System.out.println(place);

        System.out.println(place.reversed());

        TreeSet<Integer> score = new TreeSet<>();
        score.add(98);
        score.add(99);
        System.out.println(score.ceiling(100));
        System.out.println(score);

        System.out.println(score.first());
        System.out.println(score.floor(97));
        System.out.println(score);
    }
}
