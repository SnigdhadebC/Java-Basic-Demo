package com.application.demo.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList {


    public static void main(String[] args) {


        // List ->
        //1. the insertion order is preserved
        //2. duplicates are allowed

        final List<Integer> datalist = new ArrayList();
        datalist.add(100);
        datalist.add(15);
        datalist.add(100);

        int size = datalist.size();
        System.out.println("Size of the list is : "+size);

        datalist.add(5);
        datalist.add(35);

        System.out.println("-----------------");
        int size1 = datalist.size();
        System.out.println("Size of the list is : "+size1);

        System.out.println(datalist.isEmpty());


//        for(int i = 0; i < datalist.size() ; i++){
//            System.out.println(datalist.get(i));
//        }

        // for-each
//        for(Integer a : datalist){
//            System.out.println(a);
//        }

        System.out.println("------------------------");
//        // Iterator
//        Iterator<Integer> iterator=  datalist.iterator();
//        int count = 0;
//        while(iterator.hasNext()){
//            count++;
//            System.out.println(iterator.next());
//            System.out.println(iterator.next());
//            System.out.println("Count : "+count);
//
//        }
//
        int i = 0;
        while(i < datalist.size()){
            System.out.println(datalist.get(i));
            i++;
        }

        System.out.println("^^^^^^^^^^^^^^^^^^");
        System.out.println(datalist.contains("hello"));














    }
}
