package com.application.demo;

public interface Interface3 {

    public void add(int i , int j);

    default void view(){
        System.out.println("View..");
    }
}
