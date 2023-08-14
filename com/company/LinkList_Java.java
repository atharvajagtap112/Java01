package com.company;


import java.util.LinkedList;

public class LinkList_Java {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
      LinkedList<Integer> l2=new LinkedList<>();
        l2.add(15);
        l2.add(13);
        l2.add(15);
        l1.add(7);
        l1.add(6);
        l1.add(7);
        l1.add(0,9);
        l1.add(0,3);
        l1.addAll(l2);//<<---add from bottom
        l1.addAll(0,l2);//<<---add from top
        //   l1.add(1,8);
        // l1.clear();
        System.out.println(l1.contains(4));
        System.out.println(l1.indexOf(13));
        System.out.println(l1.lastIndexOf(7));
        l1.set(1,566);
        System.out.println(l1.isEmpty());
        // System.out.println(l1.clone());
        l1.remove(7);
        for (int i=0;i<l1.size();i++){
            //System.out.println(l1[i]);
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}
