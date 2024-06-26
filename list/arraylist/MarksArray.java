package com.kavya.collections.list.arraylist;

import java.util.ArrayList;

public class MarksArray
{
    public static void main(String[] args)
    {
        ArrayList<Integer> marksList = new ArrayList<>();
        marksList.add(90);
        marksList.add(95);
        marksList.add(89);
        System.out.println(marksList);//90,95,89

        marksList.remove(1);
        System.out.println(marksList);//90,89

        marksList.add(1,98);
        System.out.println(marksList);//90,98,89

        marksList.removeFirst();
        System.out.println(marksList);//98,89

        marksList.addFirst(100);
        marksList.addLast(99);
        System.out.println(marksList);//100,98,89,99

        System.out.println(marksList.contains(99));
        System.out.println(marksList.indexOf(100));

        ArrayList<Integer> marksList1 = new ArrayList<>();
        marksList1.add(60);
        marksList1.add(61);
        marksList1.add(62);

        marksList.addAll(0,marksList1);
        System.out.println(marksList);


    }
}
