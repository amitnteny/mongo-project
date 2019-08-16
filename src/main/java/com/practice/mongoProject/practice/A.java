package com.practice.mongoProject.practice;

import java.util.*;

public class A {
    public int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B extends A {
    public int a = 2;

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }
}

class C {
    public static void main(String[] args) {
        /*A a = new B();
        System.out.println(((B)a).a);
        char c = (char) 97;
        System.out.println(c);*/
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, list);
        List<String> list1 = map.get(1);
        list1.add("d");
        System.out.println(map.get(1).size());
    }
}