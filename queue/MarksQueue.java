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

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(11);
        arrayDeque.add(12);
        arrayDeque.addFirst(10);
        arrayDeque.offerFirst(9);
        System.out.println(arrayDeque);

        arrayDeque.addLast(13);
        arrayDeque.offerLast(14);
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.peek());

        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peekLast());

        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.pollFirst());

        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque.pollLast());

        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);
    }
}
