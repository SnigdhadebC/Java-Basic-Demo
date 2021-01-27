package com.application.demo;

import com.application.demo.exception.DataNotFoundException;
import com.application.demo.model.User;

import java.util.ArrayList;
import java.util.List;

public class TestException {

    public void display() throws Exception {
        throw new Exception("Data is unavailable...");
    }

    public static void main(String[] args)
    {

        TestException obj = new TestException();
        //obj.display();
        try {
            obj.display();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("--------end of main-------");

    }

}
