package com.kavya.collections.list.vector;

import java.util.Vector;

public class MarksVector
{
    public static void main(String[] args) {
        Vector<Integer> marks = new Vector<>();
        marks.add(90);
        marks.add(50);
        marks.add(30);
        System.out.println(marks);

        System.out.println(marks.capacity());

        marks.removeElementAt(2);

        marks.clone();
        System.out.println(marks);

        Vector<String> names = new Vector<>();
        System.out.println(names.capacity());
        names.add("Kavya");
        names.add("Divya");
        names.add("Suriya");
        System.out.println(names.capacity());
    }
}
