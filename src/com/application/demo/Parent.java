package com.application.demo;

public class Parent {

    public Parent(){
        System.out.println("Parent Constructor...");
    }

    public void run(){
        System.out.println("Inside run() method of Parent Class...");
    }

    public void display(){
        System.out.println("Inside display() method of Parent Class...");
    }

    public void add(int i , int j){
        System.out.println("Inside Parent class sum method...");
        int sum = i + j;
        System.out.println("Sum is :"+sum);
        System.out.println("-----------------");
    }

}
