package com.application.demo.mycollection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MyMap {

    public static void main(String[] args) {

       // Map<Object,Object> amap = new ConcurrentHashMap<>();

        Map<Integer,String> tmap = new TreeMap<>();
        tmap.put(3,"abc");
        tmap.put(1,"12345");
        tmap.put(2,"test");


        Set<Map.Entry<Integer,String>> set = tmap.entrySet();
        for(Map.Entry<Integer,String> data : set){
            if(data.getKey() == 2){
                tmap.remove(2);
                System.out.println("Hello...");
            }

            System.out.println(data.getValue());
        }





//        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
//        while(iterator.hasNext()){
//            Map.Entry<Integer,String> data = iterator.next();
//            int key = data.getKey();
//            if(key == 1){
//                iterator.remove();
//            }
//        }






//        amap.put(1,"abc");
//        amap.put(2,"Hello World");
//        amap.put(3,"abcde");
//        amap.put(4,"abcdef");
//        amap.put(5,"abcdefg");
//        amap.put(1,"Java");
//        amap.put(1,null);
//        amap.put(null,null);
//        amap.put(null,"Y");
//
//        // too retrive element from map
//        //System.out.println(amap.get(4));
//
//
//        // remove the 3rd element
//        amap.remove(3);
//        System.out.println("####"+amap.get(3));
//
//
//        //to populate entire map
//        Set<Map.Entry<Object,Object>> set = amap.entrySet();
//
//        for(Map.Entry<Object,Object> data : set)
//        {
//            System.out.println(data.getKey());
//            System.out.println(data.getValue());
//            System.out.println("---------------------");
//        }
//
//        //System.out.println(null instanceof Object);

    }
}
