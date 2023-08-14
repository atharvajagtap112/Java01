package com.company;

import java.util.HashSet;

public class HashSet_Java {
    public static void main(String[] args) {
        HashSet<Integer> MyHashSet=new HashSet<>(5,0.5f);
        MyHashSet.add(76);
        MyHashSet.add(45);
        MyHashSet.add(12);
        MyHashSet.add(11);
        MyHashSet.add(11);
        System.out.println(MyHashSet);
    }
}
