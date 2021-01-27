package com.application.demo;

public class Child extends Parent{

    public Child(){
        //super();
        System.out.println("Inside Child Class constructor...");
    }

    public void test(){
        System.out.println("Inside test() method of Child Class...");
    }

    @Override
    public void run(){
        System.out.println("Inside run() method of Child Class...");
    }



    public static void main(String[] args) {
        Parent parent = new Child();
        ((Child)parent).test();
    }
}
