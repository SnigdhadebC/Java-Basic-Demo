package com.application.demo;

public interface Interface1 {

    int i = 50;

    void display(); // abstract
    void display(int i , int j);

    default void m1(){
        System.out.println("Inside default method of Interface");
    }

    static void m2(){
        System.out.println("Inside static method of Interface");
    }

}
