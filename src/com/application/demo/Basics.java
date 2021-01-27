package com.application.demo;

public class Basics {

    public static void main(String[] args) {

        int [] arr = new int[10];
        arr[0] = 4;
        arr[2] = 6;
        arr[9] = 9;
        arr[1] = 5;
        arr[3] = 7;
        arr[4] = 8;


        System.out.println("Size of the array is : "+arr.length);


        //initialization
        // condition
        // increment
        int i = 0;
        for(;i < arr.length;){
            System.out.println("i -> "+i);
            System.out.println("data "+arr[i]);
            i++;
        }
    }

}
