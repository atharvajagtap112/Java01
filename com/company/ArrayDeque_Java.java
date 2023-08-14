package com.company;

import java.util.ArrayDeque;

public class ArrayDeque_Java {
    public static void main(String[] args) {
        ArrayDeque<Integer> ls=new ArrayDeque<>();
        ls.add(7);
        ls.add(4);
        ls.add(2);
        System.out.println(ls.getFirst());
        System.out.println(ls.getLast());

    }
}
