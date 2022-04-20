package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashSet<Student> set=new HashSet<>();
        set.add(new Student("nurbek",20));
        set.add(new Student("nurbek",20));
        set.add(new Student("nurbek",20));
        set.add(new Student("nurbek",20));
        set.add(new Student("nurbek",20));

        for (Student a:set) {
            System.out.println(a);
        }
    }
}
