package com.application.demo;

public class ChildOfMyTest extends MyTest{

    public static void main(String[] args) {
        System.out.println("Inside child of MyTest class.....");
        MyTest obj = new ChildOfMyTest(); // runtime polymorphism
        obj.display();
        obj.display("Manickam");
        obj.display(10,20);
        obj.m1();
        Interface1.m2();// is not allowed as m2 is static

    }

}
