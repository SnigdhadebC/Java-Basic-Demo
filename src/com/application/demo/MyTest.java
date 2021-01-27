package com.application.demo;

public class MyTest implements Interface1, Interface2{

    @Override
    public void display() { // override the abstract method of the interface it is mandatory else compiler eill thow error
        System.out.println("Inside display method of class MyTest...");
    }

    @Override
    public void display(int i, int j) {
        System.out.println("inside overloaded method display of Interface");
    }

    public void display(String message){
        System.out.println("Hello .. "+message);
    }

    @Override
    public void m1(){
        System.out.println("Inside default method of Class MyTest");
    }

    // data hiding
//    public static void m2(){
//        System.out.println("Inside static method m2() of Class MyTest");
//    }

//    public static void main(String[] args) {
//        Interface1 obj = new MyTest(); // runtime or dynamic polymorphism
//        obj.display();
//        obj.m1();
//        m2();// is not allowed as m2 is static
//    }
}
