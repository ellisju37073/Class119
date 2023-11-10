package com.linearsearch;
import java.util.*;
public class LSearch {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int flag = 0;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int key = 25;

//        for (int i : list) {
//            if (i == key) {
//                System.out.println("Key found at index: " + list.indexOf(i));
//                break;
//            } else {
//                System.out.println("Key not found");
//            }

        for (int i : list) {
            if (i == key) {
                flag = 1;
            }

        }
        if (flag == 1) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");


        }
    }
}
