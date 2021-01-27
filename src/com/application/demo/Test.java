package com.application.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test
{

    public static final void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("rat");
        data.add("cat");
        data.add("mat");
        data.add("bat");

        List<String> f = Collections.unmodifiableList(data);
        f.remove("cat");

        for(String str: f){
            System.out.println(str);
        }
    }

}
