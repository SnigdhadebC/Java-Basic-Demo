package com.application.demo.mycollection;

import com.application.demo.model.User;

import java.util.*;

public class MySet {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("admin2","admin2"));
        userList.add(new User("admin3","admin3"));
        userList.add(new User("admin","admin"));
        userList.add(new User("admin1","admin1"));
        userList.add(new User("admin1","admin1"));

        Iterator<User>iter = userList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("------------------------");

//        // sorting -> Collections.sort()
//        Collections.sort(userList, new Comparator<User>() {
//            @Override
//            public int compare(User user1, User user2) {
//                return user2.getUsername().compareTo(user1.getUsername());
//            }
//        });
//
//        for(User user : userList){
//            System.out.println(user);
//        }

        SortedSet<User> userSet = new TreeSet<>(userList);
        for(User user: userSet){
            System.out.println(user);
        }

        SortedSet<String> test = new TreeSet<>(new ComparatorImplementation());
        test.add("rat");
        test.add("cat");
        test.add("mat");
        test.add("bat");
        System.out.println("--------------------------");
        for(String s : test){
            System.out.println(s);
        }













//        System.out.println(userSet.first());
//        System.out.println(userSet.last());
//        System.out.println(userSet.contains(new User("test","test")));
//        List<User> userList = new LinkedList<>(userSet);// Set to list
//        Collections.sort(userList);
//
//        System.out.println("-------------------------");
//        for(User user : userList){
//            System.out.println(user);
//        }

// TreeSet

    }
}
