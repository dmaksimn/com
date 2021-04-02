package com.Lesson10;

import java.util.ArrayList;
import java.util.List;

public class Task03 {

    public static void main(String... args) {

    }

    public List<String> List = new ArrayList<>();

    public String addListElement(String str) {
        List.add(0,str);
        List.add(1, str);
        return List.toString();
    }

    public String getFromHead(String str) {
       return List.get(0);
    }

    public String removeFromHead(String str) {

        List.remove(0);

        if (List.isEmpty() == false) {

            return "object from list";
        }
        else {
            return null;
        }
    }

    public void Print(List<String> strList) {
        System.out.println(strList.toString());
    }
}