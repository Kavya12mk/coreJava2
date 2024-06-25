package com.kavya.collections.map;

import java.util.HashMap;

public class Marks
{
    public static void main(String[] args) {
        HashMap<Integer,String> name= new HashMap<>();
        name.put(1,"Kavya");
        name.put(2,"Salim");
        name.put(3,"Vishwa");
        System.out.println(name);

        System.out.println(name.containsKey(4));

        name.replace(3,"Vishwa","Viswa");
        System.out.println(name);
    }
}
