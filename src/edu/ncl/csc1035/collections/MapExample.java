package edu.ncl.csc1035.collections;


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> modules = new HashMap<>();
        modules.put("CSC1035", "Programming Paradigms 2");
        modules.put("CSC1036", "Programming Paradigms");
        modules.put("CSC1034", "Programming Paradigms 1");
        modules.put("CSC1031", "Fundamentals of Computing");
        // modules.put("CSC1031", "Advanced Fundamentals of Computing");

        System.out.println(modules.get("CSC1031"));
        System.out.println(modules);

        System.out.println(modules.keySet());
        System.out.println(modules.values());

        for (String key: modules.keySet()) {
            System.out.println(key + ": " + modules.get(key));
        }

        Map<Integer,String> otherMap = new HashMap<>();
        otherMap.put(10, "hello, ");
        otherMap.put(23, "world");
        System.out.println(otherMap.get(10)+otherMap.get(23));
    }
}
