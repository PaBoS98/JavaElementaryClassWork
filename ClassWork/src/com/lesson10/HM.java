package com.lesson10;

import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        Map<String,String> sMap = new HashMap<>();
        System.out.println(sMap.size());
        sMap.put("one", "oneone");
        System.out.println(sMap.size());
        System.out.println(sMap.containsKey("one"));
        System.out.println(sMap.containsKey("one1"));
        System.out.println(sMap.containsValue("oneone"));
        System.out.println(sMap.containsValue("oneone1"));
        sMap.put(null, "null");
        System.out.println(sMap.get(null));
    }

}
