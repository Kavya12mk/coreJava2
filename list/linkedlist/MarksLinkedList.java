package com.kavya.collections.list.linkedlist;

import java.util.LinkedList;

public class MarksLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> marksList = new LinkedList<>();
        marksList.add(79);
        marksList.add(89);
        marksList.add(99);
        System.out.println(marksList);//79,89,99

        marksList.push(100);
        marksList.add(2,90);
        System.out.println(marksList);//100,79,90,89,99

        System.out.println(marksList.peek());//100
        System.out.println(marksList.poll());//100

        System.out.println(marksList.peekFirst());//79

        System.out.println(marksList.pollLast());//99
    }
}
