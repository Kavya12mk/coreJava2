package com.kavya.collections.queue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MarksQueue
{
    public static void main(String[] args) {
        Queue<Integer> marks = new ArrayDeque<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        System.out.println(marks.peek());//prints 10 header first element

        marks.remove();//removes first element 10
        System.out.println(marks);//20,30

        marks.poll();//removes first element at the header
        System.out.println(marks);//30

        marks.add(40);
        marks.add(50);
        marks.remove();//removes first in the queue
        System.out.println(marks);//removes 30 and prints 40,50

        marks.poll();
        System.out.println(marks);//prints 50


    }
}
