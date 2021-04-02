package com.Lesson10;

import java.util.*;

public class Lesson10 {
    public static void main(String... args) {

        ArrayList<String > arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("hi");
        arrayList.add("hihi");
        arrayList.add("hihihi");
        System.out.println(arrayList);

        linkedList.add("hi");
        linkedList.add("hihi");
        linkedList.add("hihihi");
        System.out.println(linkedList);

        arrayList.remove("hi");
        System.out.println(arrayList);

        arrayList.add(0,"hohoho");
        System.out.println(arrayList);

        System.out.println(arrayList.get(1));
//        arrayList.clear();
        System.out.println(arrayList);

        Set<String> set = new HashSet<>();
        Set<String> set1 = new LinkedHashSet<>();

        set.add("ypikaee");
        set.add("hoho");
        set.add("hoho");
        set1.add("g");
        set1.add("n");
        set1.add("a");
        System.out.println(set);
        System.out.println(set1);
        int numbers = 53;

        set1 = new TreeSet<>();
        set1.add("g");
        set1.add("n");
        set1.add("b");
        System.out.println(set1);

        Iterator<String> iter = set.iterator();


            Map<String, String> map = new HashMap<>();
            map.put("id", "hi");
            map.put("3", "matr");

        System.out.println(map);

        map.remove("3");
        System.out.println(map);


        Set<String> set2 = new HashSet<>();
        set2.add("rr");
        set2.add("rrr");
        set2.add("rrrr");

        for (String str:set2) {
            System.out.println(str);
        }




    }
}
