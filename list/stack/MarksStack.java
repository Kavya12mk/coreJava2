package com.kavya.collections.list.stack;
import java.util.Stack;

public class MarksStack
{
    public static void main(String[] args)
    {
        Stack<Integer> marks=new Stack<>();
        marks.push(10);
        marks.push(20);
        System.out.println(marks.peek());//20 top element

        marks.pop();//20 removed

        marks.push(30);
        marks.push(40);
        System.out.println(marks.peek());//40
        System.out.println(marks);//10,30,40

        marks.remove(1);
        System.out.println(marks);//10,40

        marks.removeFirst();
        System.out.println(marks);//40

    }
}
