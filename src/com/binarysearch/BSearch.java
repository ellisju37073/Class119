package com.binarysearch;
import java.util.*;
public class BSearch {
    public static void main(String[] args) {
        //array data
        //sort the data
        //output if we have the key or not and number of occurences
        // if not found it will say not found

        int arr[] = {6, 2, 25, 4, 5, 15, 7, 8};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int left = 0;
        int right = arr.length - 1;
        int key = 15;
        int count = 0;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (key == arr[mid]) {
                count++;
                break;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            }
        }
        if (count == 0) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + mid);
        }
    }
}

