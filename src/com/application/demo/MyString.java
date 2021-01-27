package com.application.demo;

public class MyString {
    public static void main(String[] args) {

//        String str = "hello"; // String literal
//        String newStr = new String("hello"); // String object
//
//        String newStr1 = newStr.intern(); // interning
//
//
//        System.out.println(str == newStr); // memory reference
//        System.out.println("-------------------");
//        System.out.println(str == newStr1);
//
//        //.equals
//        System.out.println("--------------");
//        System.out.println(str.equals(newStr)); // equals() check for the content at the location
//
//        //.equalsIgnoreCase -> case insensitive
//        System.out.println("--------------");
//        System.out.println(str.equalsIgnoreCase(newStr));


        String a = new String("World");
        String b = new String("Of Java");
        a.concat(b); // String is immutable
        System.out.println(a); // world


        //StringBuilder is mutable but not thread safe
        StringBuilder sb = new StringBuilder("World");
        sb.append("World of Java");
        System.out.println(sb); //SB ->String

        // StringBuffer is thread safe -> multithreading concepts
        StringBuffer sbuffer = new StringBuffer("Hello");
        sbuffer.append("World..");
        System.out.println(sbuffer);

        // String -> "Cognizant"
        // Question -> tnazingoC"
        //reversing a String


        System.out.println("============================");
        String myString = "Cognizant";
        char[] ch = myString.toCharArray();
        // decrement loop
        for(int i = ch.length-1; i >= 0 ; i--){
            System.out.print(ch[i]);
        }

        System.out.println("\n");
        System.out.println("============Using StringBuilder===========");
        StringBuilder sBuilder = new StringBuilder(myString);
        sBuilder.reverse(); // mutable
        System.out.println(sBuilder);

        String t = new String("I reside in North America");
        char[] cha = t.toCharArray();
        for(int i = 0 ; i < cha.length ; i++){
            if(cha[i] == 'e'){
                System.out.println("# -> "+i);
            }
        }

        String x = t.replace("reside","live");
        System.out.println("@@@@ -> "+x);

        String q = t.substring(0,9);
        System.out.println(q);
        System.out.println(t.contains("java"));
        System.out.println(t.charAt(10));

        int i = t.indexOf("North");
        String s = t.substring(i,t.length());
        System.out.println(s);

        System.out.println(t.lastIndexOf("e"));

        System.out.println("-------------");
        String[]qwerty =  t.split(" ");
        for(String s1 : qwerty){
            System.out.println(s1.concat(" $ "));
        }














    }
}
