package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 04.08.15.
 */
public class New_lesson1 {
    public static void main(String[] arg){
        ArrayList <Integer> a=new ArrayList<>();
        System.out.println(a.size());
        a.add(10);
        a.add(5);
        System.out.println(a.size());
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.remove(1));
        System.out.println(a.size());

        Integer [] a1={1,2,10,20};
        a.addAll(Arrays.asList(a1));
        System.out.println(a);

    }
}
